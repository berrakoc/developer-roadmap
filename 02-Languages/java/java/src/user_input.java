import java.util.Scanner;
public class user_input {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = girdi.nextLine();
        System.out.println("How old are you? ");
        int age= girdi.nextInt();
        girdi.nextLine();
        System.out.println("Whats your occupation?");
        String surname= girdi.nextLine();

        System.out.println("Hello "+ name);
        System.out.println(surname);
        System.out.println("You are "+age+" years old");
    }
}
