public class Name {
    static String FirstName;
    static String LastName;
    static int age;
    static
    {
        FirstName = "Mansi";
        LastName = "Garg";
        age = 22;
    }
    public static void main(String [] args){
        System.out.println("FirstName: "+FirstName+"\nLastName: "+LastName+"\nAge: "+age);
    }
}
