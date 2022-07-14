// you can also use imports, for example:
// import java.util.*;
package Algorithms.Codility;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int answer=0;
        if((Y-X)%D==0) answer=(Y-X)/D;
        else answer=(int)Math.ceil((Y-X)/D)+1;
        
        return answer;
    }
}