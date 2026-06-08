import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Calculator {
  
    int power(int n, int p) throws Exception {
       
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        
      
        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        Calculator myCalculator = new Calculator();
        
        while (T-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
