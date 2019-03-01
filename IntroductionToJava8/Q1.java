package Java8;

@FunctionalInterface
interface Calcutation{
     boolean isGreater(int a, int b);

}
interface Increament{
    int increamentByOne(int a);
}
interface Concatination{
    String ConcatenateString(String a, String b);
}
interface UpperCase{
    String convertToUpperCase(String a);
}


public class Q1 {
    public static void main(String[] args) {
        Calcutation calcutation = (a,b) -> a>b;
        System.out.println("Is 6 greater than 5: "+calcutation.isGreater(6,5));
        Increament increament = a -> a + 1;
        System.out.println("Increament 3: "+increament.increamentByOne(3));
        Concatination concatination = (a,b)-> a.concat(b);
        System.out.println("Concatenate Mansi and Garg: "+concatination.ConcatenateString("Mansi ","Garg"));
        UpperCase upperCase = a-> a.toUpperCase();
        System.out.println("Converting Mansi Garg to uppercase: "+upperCase.convertToUpperCase("Mansi Garg"));
    }
}


