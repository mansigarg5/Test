package Java8;

import java.util.function.*;

public class Q5 {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println("Consumer: "+str);
        consumer.accept("Mansi");
        Supplier<String> supplier = () -> "Mansi";
        System.out.println("Supplier: "+supplier.get());
        Predicate<Integer> predicate = i-> i<5;
        System.out.println("Predicate: "+predicate.test(6));
        Function<String, String> concateString = str -> str + "Garg";
        System.out.println(concateString.apply("Mansi "));
    }
}
