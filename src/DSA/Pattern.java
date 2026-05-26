package DSA;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + i + j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        int n1 = 4;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        int n2 = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\t");

        }
        System.out.println();
        System.out.println();
        System.out.println();
        int n3 = 4;

        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= n3; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        int n4 = 4;
        for (int i = 1; i <= n4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int n5 = 4;
        for (int i = 0; i <= n5; i++) {
            for (int j = 0; j <= n5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int n6 = 5;

        for (int i = 1; i < n6; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }

            }
            System.out.println();


        }
        System.out.println();
        System.out.println();
        System.out.println();
        int n7=5;
        for(int i=1;i<=n7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int n8=4;

        for(int i=0;i<n8;i++){
            for(int j=0;j<i;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
        for(int i=0;i<n8;i++){
            for(int j=0;j<n8-i;j++){
                System.out.print("*" + " ");

            }

            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        int n9=4;
        for(int i=1;i<=n9;i++){
            for(int j=1;j<=n9-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* " );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int a=65;
        int N=4;
        for(int i=1;i<=N;i++ ){
            for(int j=1;j<=i;j++){
                System.out.print((char) a++ + " ");

            }
            System.out.println();
            a=65;
        }
        System.out.println();
        System.out.println();
        System.out.println();

        int a1=65;
        int N1=5;
        for(int i=1;i<=N1;i++ ){
            for(int j=1;j<=N1-i;j++){
                System.out.print((char) a1++ + " ");

            }
            System.out.println();
            a1=65;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int n12=6;
        int stairs=2;

        for(int i=1;i<=n12;i++){
           for(int j=1;j<=stairs;j++){
               System.out.print("* ");
           }
            System.out.println();
           if(i%2==0){
               stairs+=2;
           }
        }
        System.out.println();
        System.out.println();
        System.out.println();

        int n13=5;
        for(int i=1;i<=n13;i++){
            for(int j=1;j<=i;j++){
                if(i==j){
                    System.out.print("* ");
                }
                if((i+j)==(n13-1)){
                    System.out.print("* ");

                }
                System.out.println();

            }
        }






    }}
