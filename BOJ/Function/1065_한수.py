N=int(input())
count=0
def Hansu(number,count):
    Count=0
    my_list=[]
    my_list=list(str(number))
    my_list=list(map(int,my_list))
    if(len(my_list)<3):
        count+=1
    else:
        number=my_list[0]-my_list[1]
        for i in range(0,len(my_list)-1):
            if(number==(my_list[i]-my_list[i+1])):
                A=True
            else:
                A=False
                break
        if(A==True):
            count+=1
    return count
sum=0
for i in range(0,N):
    sum+=Hansu(i+1,count)
print(sum)