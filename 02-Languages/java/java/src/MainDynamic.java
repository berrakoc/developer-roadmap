import java.util.Scanner;

public class MainDynamic {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        AnimalDynamic animal; // memoryde yer ayırdık
        System.out.println("What animal do you want?");
        System.out.println("(1=dog) or (2=cat)");
        int choice=scanner.nextInt();
        if (choice==1){
            animal= new DogDynamic();
            animal.speak();
        }
        else if (choice==2) {
            animal= new CatDynamic();
            animal.speak();
        }
        else {
            animal= new AnimalDynamic();
            animal.speak();
        }
    }
}
