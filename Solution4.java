import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    static int[] solve(int[] grades){
        // Complete this function
        int result[] = new int[grades.length];
        int j = 0;
        for (int grade : grades) {
                    if(grade < 38) {
                        result[j++] = grade;
                        continue;
                    }
                    int rem = grade % 5;
                    
                    if(rem > 0 && (5-rem) < 3 ) {
                           grade = grade + 5 - rem;
                    }  
                    result[j++] = grade;
                           
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
