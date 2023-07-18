package Programs;

import java.util.HashSet;

public class DuplicateElementsFromTheArray {
    public static void main(String[] args) {

        String sub[] = {"English", "Maths", "Hindi", "Marathi", "English" };

        HashSet<String> set = new HashSet<>();

        for (String element : sub) {

            if(set.add(element)==false){

                System.out.println("Duplicate element from array is " + element);
            }
        }
    }
}
