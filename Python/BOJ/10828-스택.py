n = int(input())

stack = [0 for i in range(n)]
size = 0
for i in range(n):
    cmd = input().split()

    if cmd[0] == 'push':
        stack[size] = int(cmd[1])
        size += 1
    elif cmd[0] == 'pop':
        if size != 0:
            print(stack[size - 1])
            stack[size - 1] = 0
            size -= 1
        else:
            print(-1)
    elif cmd[0] == 'size':
        print(size)
    elif cmd[0] == 'empty':
        if size == 0:
            print(1)
        else:
            print(0)
    elif cmd[0] == 'top':
        if size != 0:
            print(stack[size - 1])
        else:
            print(-1)