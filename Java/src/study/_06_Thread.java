package study;

public class _06_Thread {

    public static void main(String[] args) {

        Thread.State state;

        Thread thread = new Thread() {
            @Override
            public void run() {
                for (long i = 0; i < 100000000L; i++) {}
            }
        };
        state = thread.getState();
        System.out.println("thread State : " + state);

        thread.start();
        state = thread.getState();
        System.out.println("Thread State : " + state);

        try {thread.join();} catch (InterruptedException e) {}
        state = thread.getState();
        System.out.println("thread State : " + state);

    }
    
}
