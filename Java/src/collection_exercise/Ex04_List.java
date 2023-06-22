package collection_exercise;

import java.util.LinkedList;
import java.util.List;
public class Ex04_List {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        // LinkedList 는 데이터의 저장 방식이 index 가 아닌 앞뒤 객체의 위치 정보를 저장하므로
        // 더이터의 추가 삭제 속도가 빠르다.
        for (int i = 0; i < 100000; i++) {
            list.add(0, i + "데이터");
        }
        System.out.println("완료");
    }
}
