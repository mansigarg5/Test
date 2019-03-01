package Java8;
@FunctionalInterface
interface Calculation{
    int calculate(int a, int b);
}
public class Q3 {
    int add(int a, int b){
        return a+b;
    }
    int subtract(int a, int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Calculation add = new Q3()::add;
        System.out.println("The addition is:"+add.calculate(2,3));
        Calculation subtract = new Q3()::subtract;
        System.out.println("The subtraction is: "+subtract.calculate(4,2));
        Calculation multiply = Q3::multiply;
        System.out.println("The multiplication is: "+multiply.calculate(2,3));

    }
}

