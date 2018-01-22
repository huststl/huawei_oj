package com.hust18.day0122.p021;

import java.util.Scanner;

/**
 * Created by huststl on 2018/1/22 15:05
 */
public class MainDemo021 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num;
        while (scanner.hasNextInt() && (num = scanner.nextInt())!=0){
            System.out.println(bottle(num));
        }
    }

    private static int bottle(int num) {
        final int BASE = 3;

        if(num<BASE-1){
            return 0;
        }
        int result = 0;

        while (num > BASE-1){
            //本次喝的饮料数
            int drink = num/BASE;
            //总共喝的饮料数
            result +=drink;
            //手上目前有的瓶子
            num = num % BASE +drink;

        }
        if(num == BASE-1){
            // 如果还有bASE-1个瓶子，那就可以再向老板借一瓶，喝完就有三个瓶子
            // 又可以换一瓶，又多喝了一瓶
            result++;
        }
        return result;
    }
}
