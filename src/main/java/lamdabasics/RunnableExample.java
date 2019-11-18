package lamdabasics;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });
        thread.run();
        Thread lambdaThread = new Thread(() -> System.out.println("Printed inside lambda thread"));
        lambdaThread.run();

    }
}
