package Java8;

import java.util.stream.IntStream;

public class Q10 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,10);
        System.out.println("The sum of numbers greater than 5 from 1 to 10 is:");
        System.out.println(intStream.filter(e-> e>5).sum());
    }
}


