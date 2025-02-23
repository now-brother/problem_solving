n = int(input())
sum = 0
arr_ans = []
ans = 0
arr = list(map(int, input().split()))

arr.sort()

for i in range(n):
    sum += arr[i]
    arr_ans.append(sum)

for i in range(n):
    ans += arr_ans[i]

print(ans)