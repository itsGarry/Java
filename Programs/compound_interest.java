import java.util.Scanner;
import java.lang.Math;

public class compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle: ");
            double p = sc.nextDouble();
       
        System.out.println("Enter total rate: ");
            double r = sc.nextDouble();
       
        System.out.println("Enter the number of times interest is compounded per year");
            double n = sc.nextDouble();
       
        System.out.println("Enter time in years");
            double t = sc.nextDouble();

                double a = p * (1 + (r/n));
        
                double b = (n*t);


        double amount = (Math.pow(a, b)-p);
        System.out.println("Compound Interest is: " + amount);

    }
}
