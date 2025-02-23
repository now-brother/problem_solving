n = int(input())
arr_range = list(map(int, input().split()))
arr_gasst = list(map(int, input().split()))
ans = 0

cost = arr_gasst[0]
for i in range(n-1):
    if cost > arr_gasst[i]:
        cost = arr_gasst[i]
    ans += int(cost*arr_range[i])

print(ans)