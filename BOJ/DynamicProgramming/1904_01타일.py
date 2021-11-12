import sys
N=int(sys.stdin.readline())
arr=[0]*1000001
arr[0]=1
arr[1]=2
def func(N):
    if N==1: return arr[0]
    elif N==2: return arr[1]
    else:
        for i in range(2,N+1):
            arr[i]=(arr[i-1]+arr[i-2])%15746
    return arr[N-1]
print(func(N))
