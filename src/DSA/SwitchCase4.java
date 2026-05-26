package DSA;
import  java.util.Scanner;
public class SwitchCase4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String access=sc.nextLine();
        switch(access){
            case "admin":
                System.out.println("full access");
                break;
            case "student":
                System.out.println("as per requirement");
                break;
            case "teacher":
                System.out.println("student details access");
                break;
            case "guest":
                System.out.println("no access");
                break;
        }
    }
}
