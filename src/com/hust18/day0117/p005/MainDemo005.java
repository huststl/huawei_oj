package com.hust18.day0117.p005;

import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/17 14:13
 */
public class MainDemo005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            System.out.println(hexToDec(input));
        }
        scanner.close();

    }

    private static int hexToDec(String hex) {
        final int BASE = 16;
        int result = 0;

        for(int i=2;i<hex.length();i++){
            result = result * BASE +hexToNum(hex.charAt(i));
        }
        return result;
    }

    private static int hexToNum(char ch) {

        if(ch >='0' && ch<='9'){
            return ch-'0';
        }else if(ch>='a'&&ch<='z'){
            return ch-'a'+10;
        }else {
            return ch-'A'+10;
        }
    }

}
