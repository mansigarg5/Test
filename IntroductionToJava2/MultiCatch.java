package Java2;

public class MultiCatch {
    public static void main(String [] args){
        try{
            int[] a = new int[3];
            a[3] = 1/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception thrown");
        }
        catch (ArithmeticException ex) {
                System.out.println("Arithmetic Exception thrown");
        }
    }
}
