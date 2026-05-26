package DSA;

public class IntegerToBinary {
    public static String intToBinary(int n){
        StringBuilder s= new StringBuilder();
        while(n!=0){
            s.insert(0,n%2);
            n/=2;
        }
        return s.toString();
    }
    public static void main(String[] args) {
//        System.out.println(intToBinary(100));
        int n=100;
       int res=0;
       int place=1;
       while(n!=0){
           res=res+(n%2)*place;
           place*=10;
           n/=2;
       }
        System.out.println(res);

    }
}
