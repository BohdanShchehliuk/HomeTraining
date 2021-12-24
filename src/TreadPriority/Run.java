package TreadPriority;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread();
        Thread two = new Thread(new PriorityThread());
        Thread three = new Thread(new PriorityRunner());

        three.setPriority(10);
        two.setPriority(5);
        one.setPriority(1);

        one.start();
        two.start();
        three.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("One =" + i);
            two.join();
        }
    }
}

class PriorityRunner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("PriorityRunner =" + i);
        }
    }
}

class PriorityThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("PriorityThread =" + i);
        }
    }
}