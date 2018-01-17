package com.hust18.day0117.p002;

import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/17 10:57
 */
public class Maindemo002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //是否还有其他的行，一次可以测试多行
        while (scanner.hasNext()){
            String input = scanner.next();
            String ch = scanner.next();
            System.out.println(countCharNumber(input,ch));
        }
    }

    private static int countCharNumber(String input, String chStr) {
        char ch = 0;
        for(int i = 0;i<chStr.length();i++){
            if(chStr.charAt(i)!=' '){
                ch = chStr.charAt(i);
                break;
            }
        }
        ch = toUppercase(ch);

        int count = 0;
        for(int i=0;i<input.length();i++){
            if(toUppercase(input.charAt(i))==ch){
                count++;
            }
        }
        return count;
    }

    //将小写字母变成大写字母
    private static char toUppercase(char ch) {
        if(ch >='a' && ch <='z'){
            return (char) ('A'+(ch-'a'));
        }
        return ch;
    }
}
