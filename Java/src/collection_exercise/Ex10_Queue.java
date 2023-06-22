package collection_exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Ex10_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("떙큐");
        queue.offer("베리");
        queue.offer("감사");
        queue.poll();
        queue.offer("방가");

        System.out.println(queue.peek());  // 베리
        System.out.println(queue.poll());  // 베리
        System.out.println(queue.poll());  // 감사
        System.out.println(queue.poll());  // 방가

        // offer(E item) : 매개변수의 item을 Queue에 추가
        // poll() : 가장 상위에 있는 원소값 꺼내기 (꺼낼 데이터 없는 경우 null 발생)
        // peek() : 가장 상위에 있는 원소 값 리턴 (데이터는 변화가 없음, 데이터가 하나도 없는 경우 null을 리턴)
    }
}
