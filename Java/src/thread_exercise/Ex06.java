package thread_exercise;

class MyData2 {
    String name = "홍길동";
    synchronized void abc() {
    }
    void bcd() {
        synchronized (this) {
    }
}
    void cde() {
        synchronized (name) {
        }
    }
}

// Thread1  /  Thread2  /  동시사용
//  abc()   /   bcd()   /   불가능
//  bcd()   /   cde()   /    가능
//  cde()   /   abc()   /    가능