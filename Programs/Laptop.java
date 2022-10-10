abstract public class Laptop {
        String company;
        String RAM;
        String ROM;
        String model_no;

    public Laptop(String m){
        model_no = m;
    }

    public Laptop(String c, String r, String R){        
        company = c;
        RAM = r;
        ROM = R; 
    }
    
        public void detail(){
            System.out.println("Company of the Laptop: " + company);
            System.out.println("RAM of the Laptop: " + RAM);
            System.out.println("ROM of the Laptop: " + ROM);
            System.out.println("Model No of the Lapatop: " + model_no);
        }

       abstract public void detail(int A);

    }

class laptop1 extends Laptop{


public laptop1(String m) {
        super(m);
        //TODO Auto-generated constructor stub
    }

@Override
public void detail(int A) {
    System.out.println("CONGRATULATIONS for the new " + company + " laptop" );
    
}
}

class main{
    public static void main(String[] args) {
        
        Laptop l1 = new laptop1("dell");

        l1.detail(1);
    }
}