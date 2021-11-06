from collections import Counter 
import sys
N = int(sys.stdin.readline())
num_list=[]
for i in range(0,N):
    num_list.append(int(sys.stdin.readline()))
num_list.sort()
#산술 평균
print(int(round(sum(num_list)/N)))
#중앙값
print(num_list[int(N/2)]) 
#최빈값
mode_dict = Counter(num_list) 
modes = mode_dict.most_common() #1   
if len(num_list) > 1 : 
   if modes[0][1] == modes[1][1]: #2
    mod = modes[1][0]
   else : 
        mod = modes[0][0]
else : 
    mod = modes[0][0] #3

print(mod)

 #범위
print(num_list[N-1]-num_list[0])