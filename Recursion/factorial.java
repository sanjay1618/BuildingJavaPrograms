public class factorial {

    public static int Factorial(int n){
        //Base case for the recursive method. 
        if(n==1){
            return 1;
        }
        else {
            //recursive calls.
            return(n*Factorial(n-1));
        }
    }
    public static void main(String[] args){
        //Finding the factorial of 1ooo.
        System.out.println(Factorial(5));

    }

    
}
