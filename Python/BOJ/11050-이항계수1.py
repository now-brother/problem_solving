n, k = map(int, input().split())

ans = 1
notans = 1
for i in range(k):
    ans = ans * (n - i)
    notans = notans * (i + 1)

print(ans // notans)