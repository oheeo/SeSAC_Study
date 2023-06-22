package collection_exercise;

import java.util.HashMap;
import java.util.Map;

public class Ex08_Map {
    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<>();
        map.put("사운드", true);  // 데이터 추가 put(K key, V value)
        map.put("그래픽", false);
        map.put("배경음", true);
        map.put("그래픽", true);

        System.out.println(map);  // {배경음=true, 사운드=true, 그래픽=true}
    }
}
