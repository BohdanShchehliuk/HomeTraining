package Task3Synchronized;

public class Walet {
    private static int balance = 100; // 100 гривень у гаманці

    public int getBalance() {
        return balance;
    }

    public synchronized void shopping(int spending) {
        if (balance - spending >= 0) {
            this.balance = balance - spending;
        } else return;
    }
}
