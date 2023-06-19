package thread_exercise;

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i + "초");
        }
    }
}

class Ex01 {
    public static void main(String[] args) {
            MyThread1 mt1 = new MyThread1();
            mt1.start();
        }
    }

    