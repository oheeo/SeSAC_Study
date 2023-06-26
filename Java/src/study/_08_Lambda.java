package study;

interface Function<T,R> {
    public abstract R apply (T t);
}
public class _08_Lambda {
    public static void main(String[] args) {
        // 람다식을 객체 생성 코드로 풀어쓰면,
//        Function<String, Integer> f;
//        f = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String t) {
//                return t.length();
//            }
//        };
//        System.out.println(f.apply("안녕"));

        Function<String, Integer> f1;
        f1 = str->str.length();
        System.out.println(f1.apply("안녕"));

    }

}
