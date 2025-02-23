n = int(input())

cnt1 = 0
cnt2 = 0
coin = [5, 2]
t = n // 5

for i in (coin):
    while n >= i:
        n -= i
        cnt1 += 1

cnt2 = cnt1
if n == 0:
    print(cnt1)
else:
    for i in range(t):
        n = n + ((i + 1) * 5)
        cnt2 = cnt1 - (i + 1)
        while n > 1:
            n -= 2
            cnt2 += 1
        if n == 0:
            break
    if n == 0:
        print(cnt2)
    else:
        print(-1)

    