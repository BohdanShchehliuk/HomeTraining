package Task2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Thread threadFirst = new Thread(new First());
        Thread threadSecond = new Thread(new Second());
        Thread threadRun = new Thread();

        threadFirst.start();
        threadSecond.start();
        threadRun.start();

        for (int i = 0; i < 5; i++) {
            threadSecond.join();
            System.out.println("Class Run is " + i);
        }
    }
}

class First implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Class First is " + i);
        }
    }
}

class Second implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Class Second is " + i);
        }
    }
}
