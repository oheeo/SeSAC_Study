package lambda_exercise;
// 익명 이너 클래스 객체 생성 코드 -> 람다식

interface A3 {
    double abc(int k);
}
class B1 {
    double bcd(int k) {
        return k * 0.1;
    }
}

public class Ex03 {

    public static void main(String[] args) {

//        A3 a = new A3() {
//            @Override
//            public double abc(int k) {
//                B1 b = new B1();
//                return b.bcd(k);
//            }
//        };
//        System.out.println(a.abc(10));  // 1.0

        A3 a = (k) -> {
            B1 b = new B1();
            return b.bcd(k);
        };
        System.out.println(a.abc(10));  // 1.0

    }

}
