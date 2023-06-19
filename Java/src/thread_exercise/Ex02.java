package thread_exercise;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
            System.out.println(i + "초");
        }
    }
}
public class Ex02 {
    public static void main(String[] args) {
        MyRunnable mRun = new MyRunnable();
        Thread th = new Thread(mRun);
        th.start();
    }
}
