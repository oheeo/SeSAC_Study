package study;

class AA {
    void print1() {
        System.out.println("AA 클래스 print1");
    }
    void print2() {
        System.out.println("AA 클래스 print2");
    }
}

class BB extends study.AA {
    void print1() {
        System.out.println(" BB 클래스 print1");
    }
    void print2(int a) {
        System.out.println(" BB 클래스 print2 ");
    }
}

public class _05_Overloading {

    public static void main(String[] args) {
        study.AA aa = new study.AA();
        aa.print1();
        aa.print2();

        study.BB bb = new study.BB();
        bb.print1();
        bb.print2();
        bb.print2(3);

        study.AA ab = new study.BB();
        ab.print1();
        ab.print2();
//        ab.print2(3);  오류남

    }

}
