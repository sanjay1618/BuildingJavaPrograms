public class triangle{
    public static int getTriangles(int n){
        //Base case for the recursive method. 
        if(n==1){
            return 1;
        }
        else {
            //recursive calls.
            return(n+getTriangles(n-1));
        }
    }
    public static void main(String[] args){
        //Writing a recursive method to find the columnar triangles.
        System.out.println(getTriangles(1000));

    }

}