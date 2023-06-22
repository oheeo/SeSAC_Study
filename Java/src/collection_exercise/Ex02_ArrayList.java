package collection_exercise;

import java.util.ArrayList;
import java.util.List;

public class Ex02_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);  // [2, 3, 4]
        list.remove(2);  // 4
        System.out.println(list);  // [2, 3]
    }
}
