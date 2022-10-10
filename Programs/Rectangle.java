import java.util.Scanner;

public class Rectangle {
     
    int Length;
    int Width;

       
            public void areaPerimeter(int l , int w){
            int A = l * w ;
            int P = 2 * (l + w);

            System.out.println("Area of the Rectangle is: " + A);
            System.out.println("Perimeter of the Rectangle is: " + P);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and the width for Rectangle: ");
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle();

        r1.areaPerimeter(sc.nextInt(), sc.nextInt());
        r2.areaPerimeter(sc.nextInt(), sc.nextInt());
        r3.areaPerimeter(sc.nextInt(), sc.nextInt());
        r4.areaPerimeter(sc.nextInt(), sc.nextInt());
       
    }
}

