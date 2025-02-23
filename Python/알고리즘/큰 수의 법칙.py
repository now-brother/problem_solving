n, m, k = map(int, input().split())
arr = list(map(int, input().split()))
k1 = 0
ans = 0

arr.sort(reverse = True)

for i in range(m):
    if k1 < k:
        ans += arr[0]
        k1 += 1
    else:
        ans += arr[1]
        k1 = 0

print(ans)
