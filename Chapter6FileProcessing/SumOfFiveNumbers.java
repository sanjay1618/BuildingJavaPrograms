
import java.io.*;
import java.util.*;
public class SumOfFiveNumbers {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input =new Scanner(new File("TextFileWithNumbers.txt"));
        double sum=0.0;
        while(input.hasNextDouble()){
            sum=sum+input.nextDouble();
        }
        System.out.println("The Sum of numbers in the files are :"+sum);
    }

}
