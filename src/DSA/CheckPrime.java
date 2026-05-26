package DSA;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if(n<=1){
            flag=false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
            if(flag){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }

        }

        System.out.println(flag);


    }
}
