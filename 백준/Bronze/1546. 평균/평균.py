n=int(input())
score=list(map(int, input().split()))
m=max(score)
total=0
for i in score:
    s=i/m*100
    total+=s
print(total/n)