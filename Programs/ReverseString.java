package Programs;

public class ReverseString {
    public static void main(String[] args) {
        String c = "Hello Word";
        String d = " ";

        for (int i = 0; i<c.length();i++) {
            System.out.println(c.charAt(i));

        }
        for (int i = c.length()-1;i >=0; i--){
            d = d + c.charAt(i);

        }
        System.out.println(c);
        System.out.println(d);
        System.out.println("Original String is " + c);
        System.out.println("Reverse of String is " + d);

    }
}
