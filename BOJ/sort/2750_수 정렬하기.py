N = int(input())
ascending_sort=[]
for i in range(0, N):
    ascending_sort.append(int(input()))

def buble_sort(array):
    for i in range(0, len(array)):
        for j in range(i+1, len(array)):
            if array[i]>=array[j]:
                temp=array[i]
                array[i]=array[j]
                array[j]=temp
    return array
buble_sort(ascending_sort)
for i in range (0, len(ascending_sort)):
    print(ascending_sort[i])