package DSA;
import java.util.Scanner;
public class FibonnaciSeries {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;

        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int arr(int arr[]){
        int sum=0;

       for(int i=1;i<arr.length;i++){
           sum=arr[i-1]+arr[i];
       }
       return sum;

    }


        public static void main (String[]args){
        Scanner sc= new Scanner(System.in);

          int n=sc.nextInt();



//            int sum=0;
//           System.out.println( fibonacci(n));

            int first=0;
            int second=1;
            for(int i=1;i<=n;i++){
                int next=first+second;
                first=second;
                second=next;
            }
            System.out.println(first);



        }

        }
