import java.util.Scanner;

public class Studen1 {
    int id;
    String name;
    int roll;
}

class student2 extends Studen1{

    String mobile_no;
        
        public student2(){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id of the student: ");
            id = sc.nextInt();

            System.out.println("Enter the name of the student: ");
            name = sc.nextLine();

            System.out.println("Enter the roll_no of the student: ");
            roll = sc.nextInt();

            System.out.println("Enter the mobile_no of the student: ");
            mobile_no = sc.nextLine();
        }

            public void print(){
                System.out.println("Id of the student is " + id);
                System.out.println("name of the student is " + name);
                System.out.println("roll of the student is " + roll);
                System.out.println("mobile number of the student is " + mobile_no);
            }

            public static void main(String[] args) {
                student2 s = new student2();

                s.print();
            }
}


