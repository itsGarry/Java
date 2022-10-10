import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
    int marks = sc.nextInt();

    if(marks >= 100){
        System.out.println("Your grade is A");
    }
    else if (marks >=80){
        
        System.out.println("Your grade is B");
    }
    else{
        System.out.println("YOU are big C");
    }
    }
}
