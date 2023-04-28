list_len,ranges=map(int,input().split())
baseket=[0]*list_len
for first in range(ranges):
    start,end,ball=map(int, input().split())
    for lenlist in range(start-1,end):
        baseket[lenlist]=ball
for ending in baseket :
    print(ending, end=' ')