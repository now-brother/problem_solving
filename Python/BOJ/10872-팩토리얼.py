n = int(input())

if n == 0:
    print(1)
else:
    ans = 1
    for i in range(n,1,-1):
        ans = ans * i
    
    print(ans)