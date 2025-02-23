n, k = map(int, input().split())
arr = []
for i in range(n):
    arr.append(i + 1)
cnt = 0
answer = []
while arr:
    stack = []
    for i in range(len(arr)):
        stack.append(arr[i])
        cnt += 1
        if cnt == k:
            a = stack.pop()
            answer.append(a)
            cnt = 0
    arr = stack
k = ', '.join(map(str, answer))
print('<' + k + '>')
