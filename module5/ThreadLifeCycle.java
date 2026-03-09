class LifeThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {

        LifeThread t = new LifeThread();

        System.out.println("State: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());
    }
}
