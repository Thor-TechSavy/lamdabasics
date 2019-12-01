package unit2;

public class ThisReferenceExample {
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);
            }

            public String toString() {
                return "This is anonymous inner class";
            }
        });
    }

    public void doProcess(int i, Process process) {
        process.process(i);
    }
}
