package com.hust18.day0119.p011;

import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/19 9:44
 */
public class MainDemo011 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(reverseNumber(num));
        }
    }

    private static String reverseNumber(int num) {
        StringBuilder builder = new StringBuilder();

        do{
            builder.append(num%10);
            num /=10;
        }while (num!=0);

        return builder.toString();
    }
}
