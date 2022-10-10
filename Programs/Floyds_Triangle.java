import java.util.Scanner;

/**
 * Floyds_Triangle
 */
public class Floyds_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the pyramid: ");
        int n = sc.nextInt();
        int number = 1;
        for (int i = 1; i <=n; i++){
            for (int j = 1; j<=i; j++){
                if (i==1){
                    System.out.print(" 1  *");
                    number++;
                }
                else{
                System.out.print(" " + number);
                number++;
                }
            }
            System.out.println();
        }
    }
}