n = int(input())
arr1 = []
stack = []
ans = []
Print = []

for _ in range(n):
    arr1.append(int(input()))

a = 1

for i in range(n):
    while a < (n + 1):
        stack.append(a)
        Print.append('+')
        if stack:
            for j in range(len(stack)):
                if stack[j] == arr1[i]:
                    ans.append(stack.pop())
                    Print.append('-')
                    break
        if Print[-1] == '-':
            break
        a += 1
        if stack:
            for j in range(len(stack)):
                if stack[j] == arr1[i]:
                    ans.append(stack.pop())
                    Print.append('-')
                    break
        if Print[-1] == '-':
            break
    if a == (n + 1):
        break

if a == n + 1:
    for i in range(len(stack)):
        ans.append(stack.pop())

print(ans)
print(arr1)

if ans == arr1:
    for i in Print:
        print(i)
else:
    print('NO')