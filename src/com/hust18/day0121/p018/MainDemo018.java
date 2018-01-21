package com.hust18.day0121.p018;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by huststl on 2018/1/21 15:27
 */
public class MainDemo018 {

    private static int a = 0;//A类
    private static int b = 0;//B类
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int error = 0;//错误ip
    private static int pri = 0;//私有ip
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String s = scanner.next();
            checkIp(s);
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + error + " " + pri);
        scanner.close();
    }

    private static void checkIp(String s) {
        String[] str = s.split("~");
        String ip = str[0];
        String mask = str[1];

        String[] ipParts = ip.split("\\.");
        String[] maskParts = mask.split("\\.");

        int[] ipInts = new int[4];
        int[] maskInts = new int[4];

        //判断ip是否由4部分组成
        if(ipParts.length !=4 || maskParts.length !=4){
            error++;
            return;
        }

        //判断IP中的每一部分格式
        for(int i=0;i<4;i++){
            if(" ".equals(ipParts[i]) || " ".equals(maskParts[i])){
                error++;
                return;
            }
        }
        //将ip解析成数字
        for(int i=0;i<4;i++){
            ipInts[i] = Integer.parseInt(ipParts[i]);
            if(ipInts[i]>255 || maskInts[i] >255){
                error++;
                return;
            }
        }

        //将掩码转成二进制格式
        String temp = "";
        for(int i=0;i<maskParts.length;i++){
            BigInteger bi = new BigInteger(maskParts[i]);
            temp +=bi.toString(2);
        }

        //找掩码二进制格式中的第一个0位置
        int index = temp.indexOf("0");
        temp = temp.substring(index+1);

        //掩码中，第一个0后如果有1说明掩码不合法
        if(temp.contains("1")){
            error++;
            return;
        }

        if(ipInts[0] >=1 && ipInts[0] <=126){
            a++;
        }
        if(ipInts[0] >=128 && ipInts[0] <=191){
            b++;
        }
        if(ipInts[0] >=192 && ipInts[0] <=223){
            c++;
        }
        if(ipInts[0] >=224 && ipInts[0] <=239){
            d++;
        }
        if(ipInts[0] >=240 && ipInts[0] <=255){
            e++;
        }
        if(ipInts[0] ==10){
            pri++;
        }
        if(ipInts[0] == 172){
            if(ipInts[1]>=16 && ipInts[1] <=31){
                pri++;
            }
        }
        if(ipInts[0]==192){
            if(ipInts[1] == 168){
                pri++;
            }
        }

    }
}
