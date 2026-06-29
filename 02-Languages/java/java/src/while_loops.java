import java.util.Scanner;

public class while_loops {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        String name= "";
        do {
            System.out.print("enter your name: ");
            name= scanner.nextLine();
        }while (name.isBlank());
        //its the same but with do variation
        // your looping at least once then checking
        // and deciding continue or not
        System.out.println("Hello "+name);
    }
}
