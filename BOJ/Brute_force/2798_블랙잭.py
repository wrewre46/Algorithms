N, M = map(int,input().split())
num_list=list(map(int,input().split()))
max=0
sum=0
for i in range(0,N):
    for j in range(1,N):
        for k in range(2,N):
            if(i!=j and i!=k and j!=k):
                sum=num_list[i]+num_list[j]+num_list[k]
                if(max<=sum<=M):
                    max=sum
                  
print(max)