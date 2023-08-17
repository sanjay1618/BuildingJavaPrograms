import java.util.*;
import java.io.*;
public class StockMain {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("First stock's symbol");
        String symbol1= console.next();
        Stock stock1= new Stock(symbol1);
        double profit1= 
        
    }
    
    public static double makePurchases(Stock currentStock,Scanner console){
        System.out.println("How many purchases did you make?");
        int numPurchases= console.nextInt();
        //asking about each purchase.
        for(int i=0;i<numPurchases;i++){
            System.out.println(i+"How many shares and at what price per share");
            int numShares=console.nextInt();
            double pricePerShare= console.nextDouble();
            //recording in the stock object and calling the purchase method.
            currentStock.purchase(numShares,pricePerShare);
        }
        System.out.println()
    }
}
