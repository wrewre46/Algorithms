package Algorithms.Codility;


class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer;
        int[] dp = new int[A.length];
        for(int i =0; i<dp.length; i++){
            dp[i]=Integer.MIN_VALUE;
        }
        dp[0]=A[0];
        for (int curr = 0; curr < A.length; curr++) {
            for (int k = 1; k < 7; k++) {
                int next = curr + k;
                if (next >= A.length)
                    break;
                int sum = dp[curr] + A[next];
                dp[next] = Math.max(sum, dp[next]);
            }
        }
        answer=dp[dp.length-1];
        return answer;
    }
}