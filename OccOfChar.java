public class OccOfChar {
    public static void main(String [] args)
    {
        String a = "This is a sentence.";
        int b = a.length()-a.replaceAll("s","").length();
        System.out.println("The occurrence of character 's' is: "+b);
    }
}
