import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        solve(arr);
    }

    public static void solve(int arr[]) {
         long max = 0;
         long min = Long.MAX_VALUE;
         for(int j = 0; j < arr.length; j++) {
                long sum = 0;
                for(int i = 0; i < arr.length; i++) {
                                if(j != i) {
                                       sum += arr[i];               
                                }
                }

                if(sum > max) 
                            max = sum;
                if(sum < min)   
                            min = sum;
                           
        }
        System.out.println(min+" "+max);        
    }
}
