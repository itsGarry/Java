import java.util.Scanner;
import java.lang.Math;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        double n = sc.nextDouble();

        System.out.println("Enter the number of power");
        int p = sc.nextInt();

        double power = Math.pow(n, p);

        System.out.println("power of " + n + " is: " + power);
    }
}
