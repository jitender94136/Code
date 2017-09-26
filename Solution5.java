import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {


    public static void solve(int s, int t, int a, int b, int m, int n, int apples[], int oranges[]) {
                            int countApples = 0;
                            int countOranges = 0;
                            for (int appleDistance : apples) {
                                        if( appleDistance + a >= s && appleDistance+a <=t) {
                                                    countApples++;
                                        }
                            }
                            for (int i = 0; i < oranges.length; i++) {
                                        int  orangeDistance = oranges[i];
                                        if(orangeDistance + b  <= t && orangeDistance+b >= s){
                                                    countOranges++;
                                        }
  
                            }
                            System.out.println(countApples);
                            System.out.println(countOranges);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        solve(s,t,a,b,m,n,apple,orange);
    }
}
