package Java2;

public class CreateSingleton {
    private static CreateSingleton s = new CreateSingleton();
    private CreateSingleton(){}
    public static CreateSingleton getInstance() {
        return s;

    }
    public void display(){
        System.out.println("This is a singleton class.");
    }
}
class Main{
    public static void main(String [] args){
        CreateSingleton a = CreateSingleton.getInstance();
        a.display();
    }
}
