import java.util.*;
import java.io.*;
public class RemoveExtraSpaces {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner input= new Scanner(fileInputFromUser(console));
        PrintStream output= new PrintStream(new File("outputWithOutSpaces.txt"));
        if(input.hasNext()){
            output.print(input.next());
        }
        while(input.hasNext()){
            output.print(" " + input.next());
        }
        
    }
    public static File fileInputFromUser(Scanner console) throws FileNotFoundException{
         File f =new File(console.nextLine());
         while(!f.canRead()){
            System.out.println("Enter the correct File Name");
            f= new File(console.nextLine());
        }
        return f;
    }
}
