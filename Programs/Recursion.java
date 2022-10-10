import java.util.Scanner;

public class Recursion {
    public static void printNumber(int n){
        if (n==-1) {
            return;
        }
        System.out.println(n); ;
        printNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        printNumber(n);
    }
}
