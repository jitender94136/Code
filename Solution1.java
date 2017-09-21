import java.util.Scanner;

/**
 * Solution1
 */
public class Solution1 {

    public Solution1 () {
        
    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] a = new int[2];
        compare(a0,b0,a);
        compare(a1,b1,a);
        compare(a2,b2,a);
        return a;
    }

    static void compare(int a, int b, int s[]) {
        if(a > b) 
            s[0]++;
        else if(a < b)
            s[1]++;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }

    
}