package com.hust18.day0118.p009;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/18 11:11
 */
public class MainDemo009 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int input = scanner.nextInt();
            System.out.println(extractNumber(input + ""));
        }
        scanner.close();
    }

    private static String extractNumber(String numStr) {

        StringBuilder builder = new StringBuilder();

        HashSet<Character> set = new LinkedHashSet<>();

        for(int i = numStr.length()-1;i>=0;i--){
            set.add(numStr.charAt(i));
        }

        for (Character c:set){
            builder.append(c);
        }

        //如果第一个字符是0
        if(builder.charAt(0) =='0'){
            return builder.substring(1,builder.length());
        }

        return builder.toString();
    }
}
