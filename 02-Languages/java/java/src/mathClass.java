import javax.swing.*;
import java.util.Scanner;
public class mathClass {
    public static void main(String[] args){
        //double x= 3.1415;
        //double y= -10;
        //double z=Math.max(x,y);  min,abs,sqrt,round,ceil(round up)
        //floor(round down)
        //System.out.println(z);

        Scanner scanner= new Scanner(System.in);
        System.out.println("x:");
        double x= scanner.nextDouble();
        System.out.println("y:");
        double y= scanner.nextDouble();
        double z= Math.sqrt((x*x)+(y*y));
        System.out.println(z);
        scanner.close();

    }
}
