public class Main {
    public static void main(String[] args) {
        NumberGenerator number1 = new NumberGenerator();
        Thread thread1 = new Thread(number1);
        NumberGenerator number2 = new NumberGenerator();
        Thread thread2 = new Thread(number2);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread1.start();
    }
}
