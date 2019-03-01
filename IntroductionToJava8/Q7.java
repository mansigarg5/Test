package Java8;
@FunctionalInterface
interface DefaultOverRidding{
    void display();
    default void defaultMethod(){
        System.out.println("This is the Default Method of interface.");
    }
}

public class Q7 implements DefaultOverRidding{
    @Override
    public void display() {
        System.out.println("This is the display method of interface.");
    }
    @Override
    public void defaultMethod(){
        System.out.println("This is the Default Method of interface from main class.");
    }

    public static void main(String[] args) {
        DefaultOverRidding defaultOverridding = new Q7();
        defaultOverridding.display();
        defaultOverridding.defaultMethod();
    }
}

