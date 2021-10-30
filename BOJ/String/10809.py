str=input()
my_list=list(str)
for i in range(0,26):
    my_str=chr(97+i)
    index=-1
    for j in range(0,len(my_list)):
        if(my_str==my_list[j]):
            index=j
            break;
    print(index, end=" ")