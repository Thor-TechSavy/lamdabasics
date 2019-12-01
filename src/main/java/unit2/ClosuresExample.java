package unit2;

interface Process {
    void process(int i);
}

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        final int b = 20;
        doProcess(a, i -> System.out.println(a + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}