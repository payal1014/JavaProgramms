package Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicatCharactorFromString {
    public static void main(String[] args){
        String name = "Hansika";
        Set<Character> setOfChar = new HashSet<>();
        for (int i = 0;i<name.length();i++){
            char ab = name.charAt(i);
            if (setOfChar.add(ab)== false){
                System.out.println("Duplicate character is " + ab);
            }
        }
    }
}
