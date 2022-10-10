import java.util.Scanner;

public class Mobile {
    int RAM;
    int ROM;
    String company;

    Scanner sc = new Scanner(System.in);
    
    public Mobile(){

        System.out.println("Enter RAM");
        RAM = sc.nextInt();

        System.out.println("Enter ROM");
        ROM = sc.nextInt();

        System.out.println("Enter Company");
        company = sc.next();
    }

        public void print(){
            System.out.println(RAM);
            System.out.println(ROM);
            System.out.println(company);
        }

    public static void main(String[] args) {
        
        Mobile m[] = new Mobile[3];

        for(int i = 0; i<m.length;i++){
            System.out.println("Creating Object");
            m[i] = new Mobile();
        }

        for(int i = 0; i<m.length;i++){
            System.out.println("Printing Values");
            m[i].print(); 
        }
        

    }
}
