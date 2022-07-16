// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<A.length;i++) set.add(A[i]);
        if(set.size()==A.length&&A[A.length-1]==A.length) return 1;
        else return 0;
    }
}