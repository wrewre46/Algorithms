package Algorithms.Codility;


class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        if(A.length==0) return 0;
        if(A.length==1) return 1;
        int answer=1;
        int end=B[0];

        for(int i = 1 ; i<A.length;i++){
            if(A[i]>end){
                answer++;
                end=B[i];
            }
        }
        

        return answer;

    }
}