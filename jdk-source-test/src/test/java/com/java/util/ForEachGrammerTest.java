package com.java.util;

import java.util.ArrayList;
import java.util.List;

public class ForEachGrammerTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
