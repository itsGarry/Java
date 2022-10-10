                // Garry's Code
public class myClass {
    public void Father(){
        System.out.println("Hi, I am the father of my child");
    }
    public void Father(String bookName){
        System.out.println("I am reading " + bookName + " book");
    }
}

class abc{
    public static void main(String[] args) {
        
        myClass m = new myClass();
        
        
        m.Father("Fault in our stars");
    
    }
}