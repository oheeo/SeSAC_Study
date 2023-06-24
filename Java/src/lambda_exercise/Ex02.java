package lambda_exercise;
// 람다식 -> 객체 생성 코드
interface A2 {
    int abc(String str);
}

public class Ex02 {

     // A2 a = str -> str.length();
    A2 a = new A2() {
        public int abc(String str) {
            return str.length();
        }
     };

}
