package pw;

public class Bomb extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(30000);
            System.out.println("Exploded");
            System.exit(0);
        } catch (InterruptedException e) {
            System.out.println("Bomb stopped");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread bomb = new Bomb();
        bomb.start();

        Thread.sleep(1000);
        bomb.interrupt();

        System.out.println("Start again");
        bomb.run();
    }
}
