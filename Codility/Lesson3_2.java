package Algorithms.Codility;
import java.util.*;


class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer=0;
        if(A.length<1) return 1;
        Arrays.sort(A);
        for(int i =0 ;i<A.length;i++){
            if(A[i]!=i+1){
                answer=i+1;
                return answer;
            }
        }
        return A[A.length-1]+1;
    }
}
