import javax.swing.JOptionPane;
/**
 *
 * @author Gaurang
 */
public class calculator{

    public static void main(String[] args) {

      String number1 = JOptionPane.showInputDialog("Enter your first number.");
      
      double n1 = Double.parseDouble(number1);
      
      String number2 = JOptionPane.showInputDialog("Enter your Second number.");
      
      double n2 = Double.parseDouble(number2);
       
      String Operation = JOptionPane.showInputDialog("Enter the operation you want to perform.");
      
        switch(Operation){
            case "+":
                    Double sum = n1+n2;
                    String Sum = "Sum of the numbers is "+ sum;
                    JOptionPane.showMessageDialog(null,Sum);
                    break;

                case "-":
                    Double min = n1-n2;
                    String Min = "Subtraction of the numbers is "+ min;
                    JOptionPane.showMessageDialog(null,Min);
                    break;
                
                case "*":
                    Double mul = n1*n2;
                    String Mul = "Multiplication of the numbers is "+ mul;
                    JOptionPane.showMessageDialog(null,Mul);
                    break;

                case "/":
                    Double div = n1/n2;
                    String Div = "Division of the numbers is "+ div;
                    JOptionPane.showMessageDialog(null,Div);
                    break;

                default: 
                    JOptionPane.showMessageDialog(null, "Enter valid operator(+,-,*,/)");
        }
      
      }
      
       
    }