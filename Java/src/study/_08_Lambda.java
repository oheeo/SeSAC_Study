package study;

interface Function<T,R> {
    public abstract R apply (T t);
}
public class _08_Lambda {
    public static void main(String[] args) {

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
