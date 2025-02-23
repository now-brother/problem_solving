n = int(input())
arr = []

for i in range(n):
    arr.append(int(input()))

arr.sort()
max = (arr[0] * n)

for i in range(n):
    if max < (arr[i] * (n - i)):
        max = (arr[i] * (n - i))

print(max)