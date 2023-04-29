n =[]
for _ in range(10):
    a=int(input())
    a = a % 42
    n.append(a)
b = set(n)
print(len(b))