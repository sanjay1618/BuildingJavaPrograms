import java.util.*;
import java.io.*;
public class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;
    public Stock(String symbol){
        if(symbol==null){
            throw new NullPointerException();
        }
        this.symbol=symbol;
        this.totalShares=0;
        this.totalCost=0.0;
    }
    
    public void purchase(int shares,double pricePerShare){
        if(shares<0 || pricePerShare<0){
            throw new IllegalArgumentException();
        }
        this.totalShares=this.totalShares+shares;
        this.totalCost=this.totalCost+(shares*pricePerShare);
    }
    public double getProfit(double currentPrice){
        if(currentPrice<0){
            throw new IllegalArgumentException();
        }
        return ((this.totalShares*currentPrice)-this.totalCost);


    }
}
