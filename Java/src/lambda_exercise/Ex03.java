package lambda_exercise;
// 익명 이너 클래스 객체 생성 코드 -> 람다식

interface A {
    double abc(int k);
}
class B {
    double bcd(int k) {
        return k * 0.1;
    }
}

public class Ex03 {

    A a = new A() {
        @Override
        public double abc(int k) {
//            B b = new B();
//            return b.bcd(k);

            B b = new B();
            A a = b::bcd;

        }

    };

}
