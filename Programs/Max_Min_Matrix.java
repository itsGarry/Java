import java.util.Scanner;
public class Max_Min_Matrix {   
    public static void main(String[] args) {
        int a[][] = new int [3][3];
        int max = 0, min = 999999;
    
        Scanner sc  = new Scanner(System.in);
        for (int i = 0; i<3;i++){
            for(int j = 0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
            }
            for(int i=0; i<3;i++){
                for(int j = 0; j<3; j++)
               {
                if(a[i][j]>max)
                    max = a[i][j];
                if (a[i][j]<min) 
                    min=a[i][j];
               }
               
            }
            System.out.println(max);
            System.out.println(min);
            
        }
       
     }