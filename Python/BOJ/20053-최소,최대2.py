n = int(input())

for i in range(n):
    a = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    print(arr[0],arr[a-1])
