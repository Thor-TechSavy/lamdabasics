package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4, 5};
        int key = 2;
        process(someNumbers, key, wrapperLambda((v, k) ->
                System.out.println(v / k))
        );

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {
                biConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return biConsumer;
    }
}
