package study_02;

class A {
    void print1() {
        System.out.println("A 클래스 print1");
    }
    void print2() {
        System.out.println("A 클래스 print2");
    }
}

class B extends A {
    void print1() {
        System.out.println(" B 클래스 print1");
    }
    void print2(int a) {
        System.out.println(" B 클래스 print2 ");
    }
}

public class _01_Overloading {

    public static void main(String[] args) {
        A aa = new A();
        aa.print1();
        aa.print2();

        B bb = new B();
        bb.print1();
        bb.print2();
        bb.print2(3);

        A ab = new B();
        ab.print1();
        ab.print2();
//        ab.print2(3);

    }
}
