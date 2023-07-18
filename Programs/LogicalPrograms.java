package Programs;

public class LogicalPrograms {
    public static void main(String[] args) {
        String abc = "I love my country";
        char[] arr = abc.toCharArray();
        for ( int i =arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
