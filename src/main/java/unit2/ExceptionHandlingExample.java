package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4, 5};
        int key = 2;
        process(someNumbers, key, (v, k) -> System.out.println(v / k));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {
            try {
                biConsumer.accept(i, key);
            } catch (ArithmeticException e) {
                //exception
            }
        }
    }
}
