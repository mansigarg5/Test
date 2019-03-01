package Java8;
@FunctionalInterface
interface DefaultAndStatic{
    void display();
    default void defaultMethod(){
        System.out.println("This is the Default Method of interface.");
    }
    static void staticMethod(){
        System.out.println("This is the Static Method of interface.");
    }
}

public class Q6 {
    public static void main(String[] args) {
        DefaultAndStatic defaultAndStatic = () -> System.out.println("This is the display method of inteface.");
        defaultAndStatic.display();
        defaultAndStatic.defaultMethod();
        DefaultAndStatic.staticMethod();
    }
}

