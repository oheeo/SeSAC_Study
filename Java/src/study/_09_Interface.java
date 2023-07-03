package study;

interface I1{
    void m1();
}
interface I2 extends I1{
    void m2();
}
interface I3{
    void m3();
}
class Aa implements I3{
    public void m3(){}
}
class Bb extends Aa implements I2{
    public void m1(){}
    public void m2(){}
}
public class _09_Interface {

    public static void main(String[] args) {
        Aa a = new Aa();
        Bb b = new Bb();

        I1 i1 = b;
        // I2 i2 = a;  // class A 는 interface I2 를 구현하고 있지 않기 때문에 컴파일 오류가 발생한다.
        I3 i3 = b;
        a = b;
    }

}
