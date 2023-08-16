import java.util.*;
import java.io.*;
public class LinesToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("poem.txt"));
        while(input.hasNextLine()){
            String text=input.nextLine();
            System.out.println(text.toUpperCase());
        }
        
    }
}
