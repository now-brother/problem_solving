from collections import deque

n = int(input())
queue = deque([])
if n == 1:
    print(1)
else:
    for i in range(n):
        queue.append(i + 1)
    while True:
        queue.popleft()
        if len(queue) == 1:
            print(queue[0])
            break
        queue.append(queue[0])
        queue.popleft()
        if len(queue) == 1:
            print(queue[0])
            break