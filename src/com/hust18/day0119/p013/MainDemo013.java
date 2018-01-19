package com.hust18.day0119.p013;

import java.util.Scanner;

/**
 * huawei_oj
 * Created by huststl on 2018/1/19 9:57
 */
public class MainDemo013 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String input = scanner.nextLine();
            System.out.println(reverseSentence(input));
        }
    }

    private static String reverseSentence(String str) {

        char[] chars = str.toCharArray();

        //翻转整个句子
        reverse(chars,0,chars.length-1);

        for(int i=0,j;i<chars.length;i=j+1){
            //从i位置开始后的第一个非空白字符

            while (i<chars.length&&chars[i] ==' '){
                i++;
            }
            j=i+1;
            //从i位置之后的第一个空白字符
            while (j<chars.length && chars[j]!=' '){
                j++;
            }
            reverse(chars,i,j-1);
        }
        return new String(chars);
     }

    private static void reverse(char[] str, int start, int end) {
        char tmp;
        while (start<end){
            tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start++;
            end--;
        }
    }
}
