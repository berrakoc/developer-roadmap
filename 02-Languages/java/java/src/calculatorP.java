import javax.swing.JOptionPane;
public class calculatorP {
    public static void main(String[]args){
        double firstValue = Double.parseDouble(JOptionPane.showInputDialog("Enter the first value"));
        double secondValue = Double.parseDouble(JOptionPane.showInputDialog("Enter the second value"));
        String  operator = JOptionPane.showInputDialog("Enter the operation symbol you want to do : \"+-/x\"");

        double result= Double.NaN; // BÖYLECE 0A BÖLÜNDÜPĞÜNDE 0 SONUCU ALMAYACAK
        switch (operator){ //switch kullamına odaklan
            case "+":
                result= firstValue+secondValue;
                break;
            case "-":
                result= firstValue-secondValue;
                break;
            case "x":
                result= firstValue*secondValue;
                break;
            case "/":
                if (secondValue==0){
                    JOptionPane.showMessageDialog(null,"you cant divide the value by zero.try again");
                }
                else {
                    result= firstValue/secondValue;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"invalid operation, try again");
        }
        JOptionPane.showMessageDialog(null,"result: "+result);
    }
}
