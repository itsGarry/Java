import java.util.*;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[]= s.split(" ");
        int i;


        for ( i = 0 ; i <s1.length; i++){
            System.out.println(s1[i]);
           
        } 
        System.out.println(s1.length);

    }
}
