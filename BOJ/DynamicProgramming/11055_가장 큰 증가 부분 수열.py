import sys
N = int(sys.stdin.readline())
num_list=list(map(int,input().split()))
dp=num_list[:]
for i in range(0,N):
    for j in range(0, i):
        if num_list[i]>num_list[j]:
            dp[i]=max(dp[i],dp[j]+num_list[i])
print(dp)
print(max(dp))

# 풀이
# 1 100 2 50 60 3 5 6 7 8 에서 num_list[i]의 값이 50일 경우
# 1 100 2 에서 50보다 작은 수가 있는지 체크 
# num_list[i]가 50일 때 dp[1, 101, 3, 50, 60, 3, 5, 6, 7, 8 ]
# dp[i]의 값은 50, 50+1, 50+1+2 값 중에 가장 큰 값이 된다.
