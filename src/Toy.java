public class Toy extends Thread {

    User user = new User();
    private static final int WAIT = 2500;

    @Override
    public void run() {
        try {
            turnOffTheButton();
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public void turnOffTheButton() {
        do {
            try {
                if (user.isClicker()) {
                    Thread.sleep(WAIT);
                    user.setClicker(false);
                    System.out.println("Игрушка сбросила нажатие пользователя");
                }

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        } while (!isInterrupted());
    }
}
