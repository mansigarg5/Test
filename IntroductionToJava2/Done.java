package Java2;

import java.util.Scanner;

public class Done {
    public void whileLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String s = sc.next();
        while (!(s.equals("done"))) {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                System.out.println("The first character of the word is equal to its last character");
            } else {
                System.out.println("The first character of the word is not equal to its last character");
            }
            System.out.println("Enter the next word:");
            s = sc.next();
        }
    }
    public void doWhileLoop() {
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.println("Enter the word:");
            s = sc.next();
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                System.out.println("The first character of the word is equal to its last character");
            } else {
                System.out.println("The first character of the word is not equal to its last character");
            }
            System.out.println("Enter the next word:");
            s = sc.next();

        }while(!(s.equals("done")));
    }
    public static void main(String [] args){
       Done d = new Done();
       Scanner sca = new Scanner(System.in);
        System.out.println("Enter 1 for while loop and 2 for doWhile");
        int i = sca.nextInt();
        if(i==1)
        {
            d.whileLoop();
        }
        else
        {
            d.doWhileLoop();
        }
    }
}
