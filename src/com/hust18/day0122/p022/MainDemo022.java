package com.hust18.day0122.p022;

import java.util.*;

/**
 * Created by huststl on 2018/1/22 15:14
 */
public class MainDemo022 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String input = scanner.nextLine();
            System.out.println(deleteLestWord(input));
        }
        scanner.close();
    }

    private static String deleteLestWord(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int min = Integer.MAX_VALUE;
        // 出现的最小的次数
        Collection<Integer> coll = map.values();
        for (int i : coll) {
            if (i < min) {
                min = 1;
            }
        }

        // 找要删除的字符
        Set<Character> set = new HashSet<>();
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> e: entries) {
            if (e.getValue() == min) {
                set.add(e.getKey());
            }
        }

        StringBuilder builder = new StringBuilder();

        // 删除字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
