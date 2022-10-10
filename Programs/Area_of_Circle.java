import java.util.Scanner;
public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        
        System.out.println("Enter the value of redius: ");
        int redius = sc.nextInt();

        double area = pi*redius*redius;

        System.out.println("Area of circle is " + area);

        System.out.println("By Garry");

    }
}
