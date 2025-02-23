n = int(input())

ans = [1 for i in range(n + 1)]

for i in range(2, n+1):
    ans[i] = ans[i - 1] + 2 * ans[i - 2]

print(ans[n] % 10007)