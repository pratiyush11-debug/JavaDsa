package DSA;

public class PrefectSquare {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<80;i++){
            //if(i>=start/i && i<=end/i) optimization
            if(i*i>=20 && i*i <=80){
                count++;
                System.out.println(i*i);
            }
        }
        System.out.println( "the count is: " + count);


    }
}
