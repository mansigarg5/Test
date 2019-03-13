//Q1: Implement Singleton Design Pattern on a dummy class.

package DesignPatterns;
class CreateSingleton {
    private static CreateSingleton s = new CreateSingleton();
    private CreateSingleton(){}
    public static CreateSingleton getInstance() {
        return s;

    }
    public void display(){
        System.out.println("This is a singleton class.");
    }
}

public class Q1 {
    public static void main(String [] args){
        CreateSingleton a = CreateSingleton.getInstance();
        a.display();
    }
}



