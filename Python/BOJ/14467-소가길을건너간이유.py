n = int(input())
num1 = 0
num2 = 0
arr = []
ans = []
count = 0

for i in range(n):
    arr.append([])
    num1, num2 = map(int, input().split())
    arr[i].append(num1)
    arr[i].append(num2)

for i in range(10):
    for j in range(n):  
        if int(arr[j][0]) == i + 1:
            ans.append(arr[j])
    
for i in range(n-1):
    if ans[i][0] == ans[i + 1][0]:
        if ans[i][1] != ans[i+1][1]:
            count += 1

print(count)
