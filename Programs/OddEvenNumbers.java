package Programs;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Even numbers");
        for(int value :n){
            if(value%2==0)
                System.out.println(value);
        }
        System.out.println("Odd numbers");
        for(int value :n){
            if(value%2!=0)
                System.out.println(value);
        }
    }
}
