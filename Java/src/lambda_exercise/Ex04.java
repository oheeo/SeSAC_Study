package lambda_exercise;

interface A4 {
    int abc(String str);
}
public class Ex04 {
    public static void main(String[] args) {
//        A4 a = new A4() {
//            @Override
//            public int abc(String str) {
//                return Integer.parseInt(str);
//            }
//        };

//        A4 a = (str) -> Integer.parseInt(str);

        A4 a = Integer::parseInt;

        System.out.println(a.abc("1234"));  // 1234

    }

}
