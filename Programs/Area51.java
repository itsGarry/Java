import java.nio.channels.Pipe;
import java.util.Scanner;

public class Area51 {
    
        public void circle(int r){
            double p = 3.14;
            double area = p * r * r;
            System.out.println("the are of Circle: " + area );
        }

        public void square(int s){
            int area = s * s;
            System.out.println("the area of Square: " + area);
        }

        public void rectangle(double l, double b){
            double area = l * b;
            System.out.println("the area of rectangle: "+ area); 
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Area51 a = new Area51();

          a.circle(sc.nextInt());
          a.square(sc.nextInt());
          a.rectangle(sc.nextDouble(),sc.nextDouble());
        }
}

