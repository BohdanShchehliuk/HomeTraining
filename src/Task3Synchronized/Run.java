package Task3Synchronized;

public class Run extends Walet {
    public static void main(String[] args) throws InterruptedException {

        Husbund husbund = new Husbund();
        husbund.setSpending(2);

        Wife wife = new Wife();
        wife.setSpending(3);

        Thread threadHusbund = new Thread(husbund);
        Thread threadWife = new Thread(wife);

        threadHusbund.setPriority(5);
        threadWife.setPriority(5);

        threadWife.start();
        threadHusbund.start();
        Thread.sleep(1000); // без цього часто залишок виводиться швидше, ніж встигнуть відбутися покупки.

        System.out.println("Husbund spending is:" + husbund.getTotalSpending());
        System.out.println("Wife spending is:" + wife.getTotalSpending());
        System.out.println("Balanse after all spending is:" + new Walet().getBalance());
    }
}
