package _01_collections_framework;

import java.util.TreeMap;

public class _04_TreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap1 = new TreeMap<Integer, String>();

        // Integer 크기 비교
        Integer intValue1 = new Integer(20);
        Integer intValue2 = new Integer(10);

        // intValue1 > intValue2
        treeMap1.put(intValue1, "가나다");
        treeMap1.put(intValue2, "나다라");
        System.out.println(treeMap1.toString());

        // String 크기 비교
        TreeMap<String, Integer> treeMap2 = new TreeMap<String, Integer>();
        String str1 = "가나";
        String str2 = "다라";

        // str1 < str2
        treeMap2.put(str1, 10);
        treeMap2.put(str2, 20);
        System.out.println(treeMap2.toString());

    }
}
