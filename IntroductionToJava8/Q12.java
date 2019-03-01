package Java8;

import java.util.stream.IntStream;

public class Q12 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,10);
        System.out.println("The first even number greater than 3 from 1 to 10 is:");
        System.out.println(intStream.boxed().filter(e -> e%2 == 0).filter(e -> e > 3).findFirst().orElse(null));
    }
}

