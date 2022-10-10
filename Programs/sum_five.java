/**
 * sum_five
 */
public class sum_five {
     
    public static boolean isNum (String s){
        try {
            Integer.parseInt(s);
            return true;
            
        }
        catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "My age is 21";
        String s2[] = s1.split(" ");
        for (String s : s2){
                if(isNum(s)){

                    System.out.print((Integer.parseInt(s)+5)+ " ");
                }
                else{
                    System.out.print(s + " ");
                }
        } 
    }
}