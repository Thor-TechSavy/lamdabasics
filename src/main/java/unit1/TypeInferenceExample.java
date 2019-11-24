package unit1;

public class TypeInferenceExample {
    public static void main(String[] args) {
        //StringLengthLambda stringLengthLambda = s -> s.length();
        //printLambda(stringLengthLambda);
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda lengthLambda) {
        System.out.println(lengthLambda.getLength("Hello World"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
