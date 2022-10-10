import java.util.Scanner;
public class sum_string_without_space {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
    int sum =0; 
        
        String S= "123, 12, 1, 129, 89, 99, 22";
        String s1[] = S.split(" , ");
        for (String s : s1)
        s = s.trim();
        
        int a = Integer.parseInt(S);
            sum = sum + a;
    }    
}
