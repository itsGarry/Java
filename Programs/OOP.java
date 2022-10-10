import java.util.Scanner;

class Student{
    int age;
    String name;
    String mobile_number;

    public void studentId(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.mobile_number);
    }
}


public class OOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        
        System.out.println("Enter the name of the student: ");
        s1.name=sc.nextLine();
        
        System.out.println("Enter the age of the student: ");
        s1.age= sc.nextInt();

        System.out.println("Enter the Mo.No. of the student: ");
        s1.mobile_number= sc.next();
        


        s1.studentId();
    }
    
}