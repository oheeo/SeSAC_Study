package _01_collections_framework;

//import java.util.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _03_LinkedHashMap {

    public static void main(String[] args) {
        Map<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>();

        // 요소의 저장 put(K key, V value)
        lhMap1.put(3, "three");
        lhMap1.put(1, "one");
        lhMap1.put(2, "two");
        System.out.println(lhMap1.toString());

        // 요소의 추출 Set<K> keySet()
        Set<Integer> keySet = lhMap1.keySet();
        System.out.println(keySet.toString());
    }

}
