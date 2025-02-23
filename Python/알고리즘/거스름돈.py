n = int(input())
cnt = 0

coin = [500, 100, 50, 10]

for i in (coin):
    while n >= i:
        n -= i
        cnt += 1

print(cnt)
    
