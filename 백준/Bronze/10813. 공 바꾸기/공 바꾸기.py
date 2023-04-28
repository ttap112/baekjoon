n,m=map(int, input().split()) 

b=[i for i in range(n+1)]




for i in range(m):
    
    a,j=map(int, input().split())
    
   
    
    
    b[a],b[j] = b[j],b[a]
    
    
    
for i in range(1, n + 1):
    
    print(b[i], end=' ')
