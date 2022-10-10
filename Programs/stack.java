
import java.util.Scanner;
public class stack {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the Array: ");
            int size = sc.nextInt();
            
            int [] array = new int [size];

            for(int i = 0; i<size; i++){
                    
                    array[i]= sc.nextInt();

            }

            for(int i = 0; i <=size; i++){

                System.out.println(array[i]);
            }

            
    }
}
