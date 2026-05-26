package funtion;

public class funtion2 {
    public static boolean f1(int n) {
        boolean flag = true;

        if (n <= 1) {
            flag = false;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
            if(flag){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }


        }
        return flag;
    }
        public static void main (String[]args){

            System.out.println(f1(2));
        }


    }
