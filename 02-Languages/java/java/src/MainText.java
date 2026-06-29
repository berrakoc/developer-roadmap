
import java.io.FileWriter;
import java.io.IOException;

public class MainText {
    public static void main(String [] args){
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("something \n another thing");
            writer.append("berra");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
