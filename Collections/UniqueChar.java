package Collections;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        String string = "abababac";
        Set<Character> s = new HashSet<>();
        for(int i=0;i<string.length();i++){
            s.add(string.charAt(i));
        }
        System.out.println("Number of unique characters are "+s.size());

    }
}
