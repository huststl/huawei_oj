package com.hust18.day0119.p012;

import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/19 9:52
 */
public class MainDemo012 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String input = scanner.nextLine();

            System.out.println(stringReverse(input));
        }
    }

    private static String stringReverse(String input) {

        StringBuilder builder = new StringBuilder(input.length());

        for(int i=input.length()-1;i>=0;i--){
            builder.append(input.charAt(i));
        }
        return builder.toString();
    }
}
