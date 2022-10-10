import java.util.Scanner;

public class Sum_in_the_sentense {
    public static void main(String[] args) {
        String s1 = new String(" My age is 21: ");
        String s2[] = s1.split( " " );
        
        int sum = 0;

        for (int i = 0 ;i<s1.length(); i++ ){
                char c = s1.charAt(i);
                if(Character.isDigit(c)){
                    sum = sum + Integer.parseInt(String.valueOf(c));
                }
        }
        System.out.println(sum);
    }
}
