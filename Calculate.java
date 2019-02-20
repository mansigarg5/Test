import java.util.*;
public class Calculate {
    public static void main(String [] args)
    {
        String a = "FFlwv3@";
        int u=0,l=0,d=0,s=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.isUpperCase(a.charAt(i)))
            {
                u++;
            }
            else if(Character.isLowerCase(a.charAt(i)))
            {
                l++;
            }
            else if(Character.isDigit(a.charAt(i)))
            {
                d++;
            }
            else
            {
                s++;
            }
        }
    }
}
