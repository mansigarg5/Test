package Java2;

public class ProduceException {
    public void fun(){
        try{
            throw new NoClassDefFoundError();
        }
        catch(NoClassDefFoundError e){
            System.out.println("Program in NoClassDefFoundError");
            try{
                throw new ClassNotFoundException();
            }
            catch(ClassNotFoundException ex){
                System.out.println("Program in ClassNotFoundException");
            }
        }
    }
    public static void main(String [] args){
        ProduceException p = new ProduceException();
        p.fun();
    }
}

