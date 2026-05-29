package Array;

import java.util.Scanner;

public class LinearSearch_3 {
    static void linearSearch(int arr[],int target){
        int n=8;
        for(int i=1;i<=n;i++){
            if(arr[i]==target){
                System.out.println( "the index of the array is:" + i);
                break;
            }
        }
        return;

    }
    static boolean linearsearch_1(int arr[],int target) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return true;
            }
            }return false;


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,8,9,0,9};
//        linearSearch(arr,9);
        System.out.println(linearsearch_1(arr,11));

    }
}
