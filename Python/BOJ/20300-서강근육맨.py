n = int(input())
arr = list(map(int, input().split()))
m = 0

arr.sort()

if n % 2 == 0:
    for i in range(n//2):
        sum = 0
        sum += (arr[i] + arr[n-i-1])
        if sum > m:
            m = sum
else:
    m = arr[n-1]
    for i in range(n//2):
        sum = 0
        sum += (arr[i] + arr[n-i-2])
        if sum > m:
            m = sum

print(m)