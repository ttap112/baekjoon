ret = int(input())
for i in range(ret):
    while_num, while_str = input().split()
    while_num = int(while_num)
    lenght = len(while_str)
    for j in range(lenght):
        print(while_str[j] * while_num, end='')
    print("")