package _01_collections_framework;

//import java.util.*;  // 가급적 이런식으로 쓰진 말자

import java.util.Hashtable;
import java.util.Map;

public class _02_Hashtable {

    public static void main(String[] args) {
        Map<Integer, String> hTable1 = new Hashtable<Integer, String>();

        // 요소의 저장 put(K key, V value)
        hTable1.put(3, "three");
        hTable1.put(1, "one");
        hTable1.put(2, "two");
        System.out.println(hTable1.toString());

    }
}
