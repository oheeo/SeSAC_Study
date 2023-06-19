package thread_exercise;

public class Ex04 {

        public static void main(String[] args) {
            Thread t = new Thread() {
                public void run() {
                    for(int i = 1; i <= 5; i++) {
                        try {Thread.sleep(1000);} catch (InterruptedException e) {}
                        System.out.println(i);
                    }
                }
            };
            t.setDaemon(true);
            t.start();

            try {Thread.sleep(3500);} catch (InterruptedException e) {}
        }
    }
