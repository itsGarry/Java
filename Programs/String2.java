import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[]= s.split(" ");
        int c = 0;
        
        for (String string : s1) {
            System.out.println( string + " " + string.length());
            c = c + string.length();
        }
        System.out.println("Total number of character is " + c);
    }
}
