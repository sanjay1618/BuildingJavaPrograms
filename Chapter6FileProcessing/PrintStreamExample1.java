//import java.util.*;
import java.io.*;
public class PrintStreamExample1 {
    public static void main(String[] args) throws FileNotFoundException{
        PrintStream output= new PrintStream(new File("output1.txt"));
        for(int i=0;i<10;i++){
            output.println(i);
        }

    }
}
