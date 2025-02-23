n = int(input())

arrT = list(map(int, input().split()))

t, p = map(int, input().split())

ansT = 0

while(arrT):
    if arrT[0] == 0:
        del[arrT[0]]
    elif arrT[0] <= t:
        del(arrT[0])
        ansT += 1
    else:
        if arrT[0]%t == 0:
            ansT += arrT[0]//t
            del(arrT[0])
        else:
            ansT += arrT[0]//t + 1
            del(arrT[0])

print(ansT)
print(n//p, n%p)