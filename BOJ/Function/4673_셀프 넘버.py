my_sum=0
N=1
number=1
my_list=[]
def my_function(number):
        my=list(str(number))
        my_list=list(map(int,my))
        my_sum=number+sum(my_list)
        return my_sum
for i in range (1, 10001):
    my_list.append(my_function(i))
my_list2= set(range(1,10001))
my_list=set(my_list)
new_list=my_list2-my_list
new_list=list(new_list)
new_list.sort()
for i in range(0, len(new_list)):
    print(new_list[i])