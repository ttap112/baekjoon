t,s=map(int, input().split()) #t= 시간 s= 1 술 0 술 ㄴㄴ
if t<=11:
    print(280)
elif t<=16 and s==1:
    print(280)
elif t<=16 and s==0:
    print(320)
else:
    print(280)
