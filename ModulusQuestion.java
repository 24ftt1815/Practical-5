import java.io.IOException;
import java.io.FileWriter;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        String filename = "C:/Users/Fendi/Desktop/ITP/Practical 5/ModulusQuestion.txt";
        //FileWriter fw = new FileWriter(filename);            //single argument means overwrite mode  
        FileWriter fw = new FileWriter(filename, true);   //two argument means append mode
        int limit=100;
        limit = limit + 1;
        
        int randomLimit = (int) (Math.random()*limit);
        int randomLimit2 = (int) (Math.random()*limit);
        fw.write(randomLimit+ " % "+ randomLimit2+ " = ?\r\n");
        fw.close();

        System.out.println("A new question added");
    }
}