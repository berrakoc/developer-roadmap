import java.util.Scanner;
public class stringMethods {
    public static void main(String[] args){
        String name= "Berra";
        Scanner scanner= new Scanner(System.in);
        System.out.println("whats your name?");
        String input= scanner.nextLine();

        boolean result= name.equalsIgnoreCase(input);
        //System.out.println(result);

        int uzunluk= input.length();
        //System.out.println(uzunluk);

        char hangiHarf= input.charAt(2);
        //System.out.println(hangiHarf);
        //it will return the char at the position given

        int index= input.indexOf("e");
        //System.out.println(index);
        //it will return the position

        String a= "";
        boolean check= a.isEmpty();
        //System.out.println(check);

        String uppers= input.toUpperCase();
        String lowers= input.toLowerCase();
        //System.out.println(lowers);

        String bosluksuz=  input.trim(); // boşlukları gideriyor
        String replaced= input.replace("r","l");

    }
}
