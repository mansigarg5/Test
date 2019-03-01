package Java8;

import java.util.stream.IntStream;

public class Q9 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,10);
        System.out.println("The even numbers from 1 to 10 are:");
        intStream.filter(e -> e%2 == 0).forEach(System.out::println);
    }
}

