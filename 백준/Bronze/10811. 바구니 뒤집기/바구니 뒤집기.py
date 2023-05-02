n,m=map(int, input().split())
total=[i for i in range(1,n+1)]
for _ in range(m):
    i,j=map(int, input().split())
    i-=1
    j-=1
    total[i:j+1]=total[i:j+1][::-1]
for a in total:
    print(a, end=' ')