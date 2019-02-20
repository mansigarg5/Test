public class Overloading {
    public static void main(String [] args){
        Overloading test = new Overloading();
        System.out.println("Addition of 2 and 3: "+test.addition(2,3));
        System.out.println("Addition of 13.7 and 45.6: "+test.addition(13.7, 45.6));
        System.out.println("Multiplication of 4.4 and 5.5: "+test.mul(4.4f,5.5f));
        System.out.println("Multiplication of 4 and 5: "+test.mul(4,5));
        System.out.println("Concatination of two string: "+test.con("Man","si"));
        System.out.println("Concatination of three string: "+test.con("Man","si ","Garg"));

    }
    public int addition(int a, int b){
        return a+b;
    }
    public double addition(double a, double b){
        return a+b;
    }
    public float mul(float a, float b){
        return a*b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public String con(String a, String b){
        return a.concat(b);
    }
    public String con(String a, String b, String c){
        return a.concat(b.concat(c));
    }
}
