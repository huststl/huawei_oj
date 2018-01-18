package com.hust18.day0118.p007;

import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/18 10:34
 */
public class MainDemo007 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            float input = scanner.nextFloat();
            System.out.println(floatToNearInt(input));
        }
        scanner.close();
    }

    private static int floatToNearInt(float f) {
        return (int) ((f*10+5)/10);//关键判断语句
    }
}
