package DSA;
import java.util.Scanner;
public class Eligibleforvoting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String eli=age>17?"eligible":"not eligible";
        System.out.println(eli);
    }
}
