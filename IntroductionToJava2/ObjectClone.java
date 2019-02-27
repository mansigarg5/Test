package Java2;

public class ObjectClone implements Cloneable{
    String name;
    ObjectClone(String s){
        this.name = s;
    }
    ObjectClone(ObjectClone c){
        this.name = c.name;
    }
    public static void main(String [] args){
        try {
            ObjectClone a = new ObjectClone("Mansi Garg");
            ObjectClone b = (ObjectClone) a.clone();
            ObjectClone c = new ObjectClone(a);
            System.out.println("The original name is: " + a.name);
            System.out.println("The cloned name is: " + b.name);
            System.out.println("The copied name is: " + c.name);
        }
        catch(CloneNotSupportedException e){
            System.out.println("Exception thrown");
        }
    }
}

