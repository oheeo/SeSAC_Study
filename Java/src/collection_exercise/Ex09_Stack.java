package collection_exercise;

import java.util.Stack;

public class Ex09_Stack {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<Double>();
        stack.push(1.1);
        stack.push(2.2);
        stack.pop();
        stack.push(3.3);
        stack.push(4.4);

        System.out.println(stack.search(1.1));  // 3
        System.out.println(stack.search(2.2));  // -1
        System.out.println(stack.search(3.3));  // 2
        System.out.println(stack.search(4.4));  // 1

        // push(E item) : 매개변수의 item을 Stack에 추가
        // pop() : 최상위 데이터 꺼내기 (데이터 개수 줄어듬)
        // search(Object o) : Stack 원소들의 위치값을 리턴 (최상위의 위치 1을 기준으로 아래로 내려갈수록 1씩 증가
    }
}
