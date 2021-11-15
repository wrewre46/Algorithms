N=int(input())

def star(N):
    if N == 1:
        return ['*']
    Stars=star(N//3)
    L=[]
    for S in Stars:
        L.append(S*3)
    for S in Stars:
        L.append(S+' '*(N//3)+S)
    for S in Stars:
        L.append(S*3)
    return L

print('\n'.join(star(N)))