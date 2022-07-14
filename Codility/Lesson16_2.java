package Algorithms.Codility;
class Solution {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int answer=0;
        int rope_length=0;
        for(int i = 0 ; i<A.length; i++){
            if(A[i]<K){
                rope_length+=A[i];
                if(rope_length<K) continue;
            }
            else rope_length=A[i];        
            if(rope_length>=K){
                answer++;
                rope_length=0;
            }
        }
        return answer;
    }
}