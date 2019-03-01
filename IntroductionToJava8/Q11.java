package Java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q11 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,10);
        System.out.println("The average from 1 to 10 after doubling each number is:");
        System.out.println(intStream.boxed().collect(Collectors.averagingInt((e -> e*2))));
    }
}


