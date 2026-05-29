package DSA;

public class OctalToBinary {
    public static void main(String[] args) {
        int n=140;
//        int temp=n;

        int place=1;
       int  place1=1;
        int res=0;
        while(n!=0){
            res=res+(n%10)*place;
            place=place*8;
            n=n/10;
        }

        System.out.println(res);
        int temp=res;
        int res1=0;

        while(temp!=0){
            res1=res1+(temp%2)*place;
            place1=place1*10;
            temp=temp/2;


        }
        System.out.println(res1);
    }
}
