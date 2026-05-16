package DSA;
import java.util.Scanner;
public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int c=a+b;
        char ch= sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;

            case '/':
                if(b != 0){
                    System.out.println(a/b);
                }else{
                    System.out.println("cannot take zero in denomenator");
                }

                break;
            case '%':
                if(b!=0)
                System.out.println(a%b);
                else
                    System.out.println("cannot take zero");

                break;
            default:
                System.out.println("Invalid");
        }
    }
}
