package lambda_exercise;

class B3 {
    void bcd(int k) {
        System.out.println(k);
    }
}
interface A7 {
    void abc(B3 b, int k);
}
public class Ex07 {
    public static void main(String[] args) {

        A7 a = B3::bcd;
        B3 b = new B3();
        a.abc(b, 3);  // 3

        // 람다식을 객체 생성 코드로 풀어보면,
/*        A7 a = new A7() {
            public void abc(B3 b, int k) {
                b.bcd(k);
            }
        };
        B3 b = new B3();
        a.abc(b, 3);  // 3   */

    }

}

