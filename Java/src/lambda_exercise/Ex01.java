package lambda_exercise;
// 객체 생성 코드 -> 람다식
interface A1 {
    void abc(double k);
}

public class Ex01 {

    public static void main(String[] args) {
//        A1 a = new A1() {
//            public void abc(double k) {
//                System.out.println(k + 0.5);
//            };
//        };
//        a.abc(3.8);  // 4.3

        A1 a = (double k) -> {System.out.println(k + 0.5);};
        a.abc(3.8);  // 4.3
        // 익명이너클래스 표현과 람다식의 경우 중괄호() 다음에 세미콜론이 옴
    }
}
