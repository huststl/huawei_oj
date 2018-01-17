package com.hust18.day0117.p003;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * huawei_oj
 * Created by huststl on 2018/1/17 11:12
 */
public class MainDemo003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();//读取输入的数字数
            Set<Integer> set = new TreeSet<>();//存放输入的数字
            while ((--num) >= 0){
                set.add(scanner.nextInt());
            }

            System.out.print(setToString(set));
        }
    }

    private static String setToString(Set<Integer> set) {

        StringBuilder builder = new StringBuilder(128);
        for(Integer i:set){
            builder.append(i).append("\n");
        }
        return builder.toString();
    }
}
