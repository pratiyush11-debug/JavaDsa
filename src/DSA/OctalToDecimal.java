package DSA;

public class OctalToDecimal {
    public static void main(String[] args) {
        int res=0;
        int n= 140;

        int place=1;
        while(n!=0){
            res=res+(n%10)*place;
            place=place*8;
            n=n/10;
        }
        System.out.println(res);
    }

}
