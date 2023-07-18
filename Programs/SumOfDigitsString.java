package Programs;

public class SumOfDigitsString {
    public static void main(String[] args){
        String sumofnostring = "Welcom[21],Java1How are1 you78";
        int sum = 0;
        for(int i = 0; i< sumofnostring.length(); i++){
            if(Character.isDigit(sumofnostring.charAt(i)))
                sum=sum+Character.getNumericValue(sumofnostring.charAt(i));
        }
        System.out.println("Sum of all the digit in given string :"+sum);
    }

}
