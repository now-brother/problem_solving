n=int(input())
answer = []

for i in range(n):
    a = 0
    stack = []
    arr = list(input())
    for j in range(len(arr)):
        if arr[j] == '(':
            stack.append(arr[j])
        else:
            if len(stack) == 0:
                answer.append('NO')
                a = 1
                break
            else:
                stack.pop()
    if a == 0:
        if stack:
            answer.append("NO")
        else:
            answer.append("YES")

for i in answer:
    print(i)
