package _01_collections_framework;

import java.util.*;

public class _02_Hashtable {

    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

        // 요소의 저장
        hm1.put(3, "three");
        hm1.put(1, "one");
        hm1.put(2, "two");

        // 요소의 출력
        System.out.println(hm1.toString());

        Map<Integer, String> hm2 = new HashMap<Integer, String>();
        hm2.putAll(hm1);
        System.out.println(hm2.toString());

        // 데이터 변경 replace(K key, V value)
        hm2.replace(1, "하나");
        hm2.replace(4, "넷");  // 동작하지 않음
        System.out.println(hm2.toString());

        // 데이터 변경 replace(K key, V oldValue, V newValue)
        hm2.replace(1, "하나", "하나하나");
        System.out.println(hm2.toString());

        // 요소의 추출 V get(object key)
        System.out.println(hm2.get(1));
        System.out.println(hm2.get(2));

        // 요소의 추출 containsKey(object key)
        System.out.println(hm2.containsKey(1));
        System.out.println(hm2.containsKey(5));

        // 요소의 추출 containsValue(object value)
        System.out.println(hm2.containsValue("하나하나"));
        System.out.println(hm2.containsValue("가나다"));

        // 요소의 추출 Set<K> keySet()
        Set<Integer> keySet = hm2.keySet();
        System.out.println(keySet.toString());

        // 요소의 추출 Set<Map.Entry<K, V>> entrySet()
        Set<Map.Entry<Integer, String>> entrySet = hm2.entrySet();
        System.out.println(entrySet);

        // size
        System.out.println(hm2.size());


        //데이터 삭제 remove(Object key)
        hm2.remove(1);
        hm2.remove(4);  // 동작 안 함
        System.out.println(hm2.toString());

        //데이터 삭제 remove(Object key, Object value)
        hm2.remove(2, "two");
        hm2.remove(3, "다다다");  // 동작 안 함
        System.out.println(hm2.toString());

        //데이터 삭제 clear()
        hm2.clear();
        System.out.println(hm2.toString());
    }
}
