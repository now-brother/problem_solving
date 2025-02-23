import sys

n = int(sys.stdin.readline())

arr = []
for i in range(n): 
    a, b = map(int, sys.stdin.readline().split())
    arr.append((a, b))

arr.sort()
arr.sort(key = lambda x:x[0])

for i in range(n):
    print(arr[i][0], end = ' ')
    print(arr[i][1])