package com.hust18.day0118.p010;

import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/18 14:00
 */
public class MainDemo010 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()){
            int[] arr = new int[128];
            String input = scanner.nextLine();
            
            countChar(arr,input);
            
            System.out.println(countcharNum(arr));
        }
        scanner.close();
    }

    private static int countcharNum(int[] arr) {
        int result = 0;
        for(int i:arr){
            if(i!=0){
                result++;
            }
        }
        return result;
    }

    private static void countChar(int[] arr, String input) {
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c<=127){
                arr[c]++;
            }
        }
    }
}
