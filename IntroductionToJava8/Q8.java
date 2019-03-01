package Java8;
@FunctionalInterface
interface Interface1{
    void interface1();
    default void display(){
        System.out.println("This is default display of interface1.");
    }
}
@FunctionalInterface
interface Interface2{
    void interface2();
    default void display(){
        System.out.println("This is default display of interface2.");
    }
}

public class Q8 implements Interface1,Interface2{
    @Override
    public void interface1() {
        System.out.println("This is interface1.");
    }

    @Override
    public void interface2() {
        System.out.println("This is interface2.");
    }

    @Override
    public void display() {
        System.out.println("This is default display of class Q8.");
    }

    public static void main(String[] args) {
        Q8 q8 = new Q8();
        q8.display();
        q8.interface1();
        q8.interface2();
    }
}
