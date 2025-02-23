from collections import deque

n, k = map(int, input().split())

arr = deque([])
answer = deque([])
num = 2

for i in range(n - 1):
    arr.append(i + 2)

while arr:
    num = arr[0]
    lenArr = len(arr)
    for i in range(lenArr // num):
        if arr[num * i] == num * (i + 1):
            answer.append(num * (i + 1))
            del arr[num * i]
            arr.appendleft(num * (i + 1))
    for i in range(lenArr // num):
        arr.popleft()

print(answer[k - 1])