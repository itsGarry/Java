public class Employee {
    float Salary = 1000;
    String name = "Madan";

}

class Programmer extends Employee{
    int Bonus = 5000;
    public static void main(String[] args) {
        Programmer p = new Programmer();

        System.out.println(p.Bonus);
        System.out.println(p.Salary);
        System.out.println(p.name);
    }
}

