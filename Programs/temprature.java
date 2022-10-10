import java.util.Scanner;
public class temprature {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter temprature in celcius: ");
    double value = sc.nextDouble();

    
    double celcius = (value*9/5)+32;

    System.out.println("temprature in ferenheat: " + celcius);

    System.out.println("By Garry");
}
    
}