public class rotateWord {
    public static char[] rotate(char[] word){
        char temp=word[0];
        for(int i=0; i<word.length-1;i=i+1){
            word[i]=word[i+1];
            System.out.println(new String(word));
        }
        word[word.length-1]=temp;
        return word;
    } 
    public static void main(String[] args){
        String x="cat";
        char word[]= new char[4];
        word=x.toCharArray();
        System.out.println(rotate(word));

    }
    
}
