package com.hust18.day0117.p004;

import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/17 13:57
 */
public class MainDemo004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder builder = new StringBuilder(256);
        
        while (scanner.hasNext()){
            builder.setLength(0);
            String input = scanner.nextLine();
            stringSplit(builder,input);
            input = scanner.nextLine();
            System.out.print(builder);
        }
        scanner.close();
    }

    private static void stringSplit(StringBuilder builder, String str) {
        if(str==null || str.length() < 1){
            return;
        }
        int pos = 0;
        while((pos +=8) < str.length()){

            builder.append(str.substring(pos-8,pos)).append("\n");

        }
        //如果str.length()<pos,说明最后的不足8个字符或者刚好8个
        if(str.length()<=pos){
            builder.append(str.substring(pos-8,str.length()));

            for(int i = str.length();i<pos;i++){
                builder.append(0);
            }
            builder.append("\n");
        }
    }
}
