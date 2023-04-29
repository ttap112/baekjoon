total=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]
rept=1
while rept<=28:
    a=int(input())
    total.remove(a)
    rept+=1
print(total[0])
print(total[1])