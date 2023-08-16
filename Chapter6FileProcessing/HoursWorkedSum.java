import java.util.*; 
import java.io.*; 
public class HoursWorkedSum {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input =new Scanner(new File("TimeSheets.dat"));
        while(input.hasNext()){
            String name=input.next();
            double hours=0.0;
            while(input.hasNextDouble()){
                hours=hours+input.nextDouble();
            }
            System.out.println(name+" has worked for "+ hours);
        }
    } 
}
