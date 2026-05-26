package DSA;

public class ForLoops {
    public static void main(String[] args) {
        int n=20;
        int sum=0;
//        for(int i=1;i<=n;i++){
//            if(i%2!=0) System.out.println(i);
//        }
//        for(int i=1;i<=n;i++){
//            sum=sum+i;
//            //System.out.println(sum);
//        }
//        System.out.println(sum);
        int battery=10;
        int count=0;

        while(battery<100){
            battery+=10;
            count++;


        }
        System.out.println(count );
    }
}
