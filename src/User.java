public class User extends Thread {

    public static volatile boolean clicker = false;
    private static final int WAIT = 4000;

    @Override
    public void run() {
        clickOnTheButton();
    }

    public boolean isClicker() {
        return clicker;
    }

    public void setClicker(boolean clicker) {
        User.clicker = clicker;
    }

    public void clickOnTheButton() {
        try {
            for (int i = 0; i < 5; i++) {
                if (!isClicker()) {
                    setClicker(true);
                    System.out.println("Пользователь нажал на кнопку");
                    Thread.sleep(WAIT);
                }
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}


