package collection_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Ex01_List {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);  // [1, 2, 3]

        List<Integer> list2 = Arrays.asList(1, 2);
        // list2.add(3);
        // Arrays.asList(T …)로 List 객체 생성의 경우, 추가(add), 삭제(remove) 불가능
        // 변경(set) 만 가능
        // list2.set(1, 7);  -> [1, 7]
        System.out.println(list2);  // [1, 2]

    }
}
