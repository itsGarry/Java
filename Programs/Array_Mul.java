import java.util.Scanner;
public class Array_Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int mul = 1;
        
        for(int i = 0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        for(int i = 0; i<a.length; i++){
            mul = mul * a[i];
         }
         System.out.println("mul of all Array is: " + mul);
     }
}
