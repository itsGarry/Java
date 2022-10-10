import java.util.Scanner;
public class Area_of_Rectangle {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Width: ");
    double width = sc.nextDouble();

    System.out.println("enter Breath");
    double Breath = sc.nextDouble();

    double area = width*Breath;
    System.out.println("area of rectangle: " + area);

    System.out.println("By Garry");
}
    
}