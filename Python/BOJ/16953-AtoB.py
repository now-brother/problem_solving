a,b = map(int, input().split())
count = 0

while b > a:
    if b % 2 == 1:
        b -= 1
        b = b / 10
        count += 1
    else:
        b = b / 2
        count += 1

if a == b:
    print(count+1)
else:
    print(-1)
