package com.hust18.day0122.p023;

import java.util.Scanner;

/**
 * Created by huststl on 2018/1/22 15:41
 */
public class MainDemo023 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            String input = scanner.nextLine();
            System.out.println(encrypt(input));
            input = scanner.nextLine();
            System.out.println(unencrypt(input));
        }
        scanner.close();
    }

    private static String unencrypt(String s) {
        char[][] mask = {
                {'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'},
                {'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'},
                {'9', '0', '1', '2', '3', '4', '5', '6', '7', '8'}
        };
        return convert(s,mask);
    }

    private static String encrypt(String s) {
        char[][] mask = {
                {'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a'},
                {'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A'},
                {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}
        };

        return convert(s,mask);

    }

    private static String convert(String s, char[][] mask) {
        StringBuilder builder = new StringBuilder(s.length());

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                builder.append(mask[0][c-'A']);
            }else if(c>='a' && c<='z'){
                builder.append(mask[1][c-'a']);
            }else {
                builder.append(mask[2][c-'0']);
            }
        }
        return builder.toString();
    }
}
