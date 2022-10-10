import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
    int add=a+b;
    int min=a-b;
    int mul=a*b;
    int div=a/b;

    System.out.println(add);
    System.out.println(min);
    System.out.println(mul);
    System.out.println(div);
    }
}
