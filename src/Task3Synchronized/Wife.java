package Task3Synchronized;

public class Wife implements Runnable {
    public void setSpending(int spending) {
        this.spending = spending;
    }

    private int spending;
    private int totalSpending;

    public int getTotalSpending() {
        return totalSpending;
    }

    Walet walet = new Walet();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (walet.getBalance() - spending >= 0) {
                totalSpending = totalSpending + spending;
                walet.shopping(spending);
                System.out.println("Wife");
            }
        }
    }
}
