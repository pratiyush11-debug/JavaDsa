package Array;

import java.util.Scanner;

public class CountElementLessThanX {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
