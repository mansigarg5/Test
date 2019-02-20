public class Reverse {
    public static void main(String [] args){
        StringBuffer a = new StringBuffer("Mansi Garg");
        System.out.println("The original string is: "+a);
        System.out.println("Reverse of the string is: "+a.reverse());
        System.out.println("String after removal is: "+a.delete(4,9));
    }
}
