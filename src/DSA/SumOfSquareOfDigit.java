package DSA;

import java.util.Scanner;

public class SumOfSquareOfDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int sum=0;
//        while(n>0){
//            int rem=n%10;
//
//        }
//        for(int i=0;i<=n;i++){
//            int rem=n%10;
//            ans=rem*rem;
//            sum=sum+ans;
//            n=n/10;
//
//
//        }
        while(n>0){
            int dig=n%10;
            sum+=dig*dig;
            n=n/10;
        }
        System.out.println(sum);
    }
}
