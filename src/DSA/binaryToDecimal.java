package DSA;

public class binaryToDecimal {
    public static void main(String[] args) {
        int n=1100100;
        int res=0;
        int place=1;
        while(n!=0){
            res=res+(n%10)*place;
            place*=2;
            n/=10;
        }
        System.out.println(res);

    }
}

