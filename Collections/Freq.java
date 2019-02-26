package Collections;
import java.util.*;

public class Freq {
    public static void main(String[] args) {
        String string = "abababac";
        List<Character> list = new ArrayList<>();
        for(int i=0;i<string.length();i++){
            list.add(string.charAt(i));
        }
        Set<Character> set = new HashSet<>();
        for(int i=0;i<string.length();i++){
            set.add(string.charAt(i));
        }
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            char c = (char)iterator.next();
            System.out.println("The frequency of "+c+" is "+Collections.frequency(list, c)+".");
        }
    }
}

