package com.hust18.day0120.p014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by huststl on 2018/1/20 16:06
 */
public class MainDemo014 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int num = Integer.parseInt(scanner.nextLine());

            List<String> list = new ArrayList<>(num);

            while ((--num)>=0){
                list.add(scanner.nextLine());
            }

            Collections.sort(list);

            for(String s : list){
                System.out.println(s);
            }
        }
        scanner.close();
    }
}
