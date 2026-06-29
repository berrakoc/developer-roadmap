import java.util.Scanner;
public class if_statement {
    public static void main(String[ ] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("whats your age?");
        int age= scanner.nextInt();
        if (age>=75){
            System.out.println("OK Boomer!");
        }
        else if (age>=18){
            System.out.println("Youre an adult!");
        }
        else{
            System.out.println("Youre not allowed");
        }
    }
}
