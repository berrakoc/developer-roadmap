import java.util.Random;
import java.util.Scanner;

public class Word_Guess_Game {
    public static void main(String []args){
        String [] wordList = {"kırmızı", "mavi", "yeşil", "sarı", "mor", "turuncu", "pembe", "beyaz", "gri", "siyah"};

        Random random = new Random();
        int index = random.nextInt(wordList.length);

        String chosenWord = wordList[index];
        //System.out.println(chosenWord);

        Scanner scanner= new Scanner(System.in);
        StringBuilder lines= new StringBuilder(); //smt that I recently learnt
        for (char i: chosenWord.toCharArray()){
            lines.append("_");             //append instead of add
        }

        int guesses = 6;
        while (guesses>0){
            System.out.println("enter a letter:");
            char guess = scanner.next().toLowerCase().charAt(0); //char at 0

            boolean correctGuess= false;

            for (int i=0; i<chosenWord.length(); i++){
                if(chosenWord.charAt(i)==guess){
                    lines.setCharAt(i,guess);
                    //System.out.println(lines);
                    correctGuess=true;
                }
            }
            if(!correctGuess){
                guesses--;
            }
            if (lines.toString().equals(chosenWord)){
                System.out.println(lines);
                System.out.println("You won!");
                break;
            }
            System.out.println(lines);
            System.out.println("You have "+guesses+" left");
        }
        if (guesses==0){
            System.out.println("You are out of the guesses. You lost.The correct word was: " + chosenWord);
        }
        scanner.close();
    }
}
