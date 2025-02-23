
from collections import deque

n=int(input())
queue = deque()
answer = []
count = 0

for i in range(n):
    arr = []
    arr=input().split()
    if arr[0] == 'push':
        queue.append(int(arr[1]))
        count += 1
    elif arr[0] == 'pop':
        if len(queue) == 0:
            answer.append(queue.popleft())
            if count != 0:
                count =- 1
        else:
            answer.append(-1)
    elif arr[0] == 'size':
        answer.append(count)
        
    elif arr[0] == 'empty':
        if len(queue) == 0:
            answer.append(1)
        else:
            answer.append(0)
    elif arr[0] == 'front':
        if len(queue) == 0:
            answer.append(-1)
        else:
            answer.append(queue[0])
    elif arr[0] == 'back':
        if len(queue) == 0:
            answer.append(-1)
        else:
            answer.append(queue[-1])

for i in answer:
    print(i)    
