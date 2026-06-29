import javax.swing.JOptionPane;
public class mathGUI {
    public static void main(String[]args){
        double x= Double.parseDouble(JOptionPane.showInputDialog("enter x"));
        double y= Double.parseDouble(JOptionPane.showInputDialog("enter y"));
        double z= Math.sqrt((x*x)+(y*y));
        JOptionPane.showMessageDialog(null,z);
    }
}
