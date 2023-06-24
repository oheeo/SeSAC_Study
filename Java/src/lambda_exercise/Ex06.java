package lambda_exercise;

class B2 {
    B2() {System.out.println("첫 번째 생성자");}
    B2(int a) {System.out.println("두 번째 생성자");}
    B2(int a, double b) {System.out.println("세 번째 생성자");}
}
interface A6 {
    B2 abc(int a, double b);
}

public class Ex06 {
    public static void main(String[] args) {

        A6 a = B2::new;
        a.abc(3, 5.8);

        // 람다식을 객체 생성 코드로 풀어쓰면,
//        A6 a = new A6() {
//            public B2 abc(int a, double b) {
//                return new B2(a, b);
//            }
//        };
//        a.abc(3, 5.8);

    }

}