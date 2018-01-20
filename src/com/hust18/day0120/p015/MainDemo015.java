package com.hust18.day0120.p015;

import java.util.Scanner;

/**
 * Created by huststl on 2018/1/20 16:17
 */
public class MainDemo015 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int input = scanner.nextInt();
            System.out.println(countOnes(input));
        }
        scanner.close();

    }

    private static int countOnes(int input) {

        int result = 0;

        while (input!=0){

            result += input & 1;

            input >>>=1;
        }
        return result;
    }
}
