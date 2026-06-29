
import java.util.Scanner;
public class input_hw {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name surname");
        String NameSurname= scanner.nextLine();
        System.out.println("age");
        int age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("edu");
        String education= scanner.nextLine();
        System.out.println("health");
        String health= scanner.nextLine();


        System.out.println(NameSurname+age+education+health);



    }
}
