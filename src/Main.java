public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread user = new User();
        user.start();
        Thread toy = new Toy();
        toy.start();
        user.join();
        toy.interrupt();
    }
}
