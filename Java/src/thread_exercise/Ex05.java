package thread_exercise;

class MyData1 {
    int data;
    synchronized void modifyData() {
        data++;
    }
}

class MyThread2 extends Thread {
    MyData1 myData;
    public MyThread2(MyData1 myData) {
        this.myData = myData;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            myData.modifyData();
        }
        System.out.println(myData.data);
    }
}

public class Ex05 {
    public static void main(String[] args) {
        MyData1 md = new MyData1();
        MyThread2 mt1 = new MyThread2(md);
        mt1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        MyThread2 mt2 = new MyThread2(md);
        mt2.start();
    }
}
