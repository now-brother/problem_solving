import sys

n, k = map(int, sys.stdin.readline().split())

arr = []
for i in range(n):
    arr.append(i + 1)

ans = []
i = 0
cnt = 1

print('<', end = '')
while arr:
    if i >= len(arr):
        i = 0
    if cnt == k:
        print(arr[i],end='')
        del(arr[i])
        cnt = 0
        i -= 1
        if len(arr) != 0:
            print(',',end = ' ')

    i += 1
    cnt += 1

print('>')