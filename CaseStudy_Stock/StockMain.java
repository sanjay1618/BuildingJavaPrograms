import java.util.*;
public class StockMain {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("First stock's symbol");
        String symbol1= console.next();
        Stock stock1= new Stock(symbol1);
        double profit1=makePurchases(stock1, console);
        System.out.println("Second Stock's Symbol");
        String symbol2= console.next();
        Stock stock2= new Stock(symbol2);
        double profit2= makePurchases(stock2, console);

        if(profit1>profit2){
            System.out.println(profit1-profit2 + " stock1's profit is more");
        }
        else{
            System.out.println("stock2 is profit bigger by"+ (profit2-profit1));
        }
        
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
        System.out.println("What is the current price");
        int currentPrice=console.nextInt();
        double profit=currentStock.getProfit(currentPrice);
        return profit;





    }
}
