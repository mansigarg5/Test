package Java8;
@FunctionalInterface
interface Compute<S, R, T>{
    T sum(S a, R b);
}

public class Q2 {
    public static void main(String[] args) {
        Compute<Integer, Integer, Integer> integerIntegerCompute= (a,b)-> a+b;
        System.out.println("The sum of 4 and 5 is: "+integerIntegerCompute.sum(4,5));
    }
}

