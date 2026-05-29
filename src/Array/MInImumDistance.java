package Array;

import java.sql.SQLOutput;

public class MInImumDistance {
    public static int min(int a,int b){
        return (a>b?a:b);
    }
    public static int array(int arr[],int n) {
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] % 2 == 0) {
                        if (res == -1) {
                            res = j - i;
                        }
                        res = min(res, j - i);
                        break;
                    }
                }
            }
        }
            return res;
        }


    public static void main(String[] args) {

        int arr[]={1,2,3,3,4,5};
        int n=arr.length;
        System.out.println(array(arr,n));
    }



    }

