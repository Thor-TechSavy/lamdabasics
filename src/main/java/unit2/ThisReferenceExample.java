package unit2;

public class ThisReferenceExample {

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.execute();
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println(i);
            System.out.println(this);
        });
    }

    public String toString() {
        return "This is main ThisReferenceExample class instance";
    }

    public void doProcess(int i, Process process) {
        process.process(i);
    }
}
