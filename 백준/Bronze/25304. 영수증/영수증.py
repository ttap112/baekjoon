x=int(input())
n=int(input())
d=0
for i in range(1,n+1) :
    a,b=map(int, input().split())
    d+=a*b
print("Yes" if d == x else "No")