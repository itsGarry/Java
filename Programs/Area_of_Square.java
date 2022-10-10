import java.util.Scanner;
public class Area_of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of side: ");
        double b = sc.nextDouble();

        double area = b*b;

        System.out.println("Area of square : " + area);

        System.out.println("By Garry");
    }
}
