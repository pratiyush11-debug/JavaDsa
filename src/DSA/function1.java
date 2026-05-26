package DSA;


public class function1 {
    public static  void f1(int a,int b,int c){

        System.out.println(a+b+c);
        return;


    }
    public static int  f2(int a,int b){
        int sum=a+b;
        if(sum%2==0){
            System.out.println(sum);

        }

        return sum;

    }
    public static int sumEven(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                sum+=i;
            }

        }
        return sum;
    }
    static boolean second_LastDigit(int num) {
        if (num < 10) {
            return false;
        }
        int sec_lastdigit = (num / 10) % 10;
        return sec_lastdigit % 2 == 0;
    }


    public static void main(String[] args) {
//        int a=1;int b=2;int c=3;
//        f1(1,2,3);
//
//        f2(4,4);
//        System.out.println(sumEven(0,10));
        System.out.println(  second_LastDigit(1));


    }
}
