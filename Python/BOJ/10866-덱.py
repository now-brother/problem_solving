from collections import deque

n = int(input())

queue = deque()
answer = []

for i in range(n):
    arr = input().split()
    
    if arr[0] == 'push_front':
        queue.appendleft(arr[1])
    elif arr[0] == 'push_back':
        queue.append(arr[1])
    elif arr[0] == 'pop_front': 
        if queue:
            answer.append(queue.popleft())
        else:
            answer.append(-1)
    elif arr[0] == 'pop_back':
        if queue:
            answer.append(queue.pop())
        else:
            answer.append(-1)
    elif arr[0] == 'size':
        answer.append(len(queue))
    elif arr[0] == 'empty':
        if queue:
            answer.append(0)
        else:
            answer.append(1)
    elif arr[0] == 'front':
        if queue:
            answer.append(queue[0])
        else:
            answer.append(-1)
    elif arr[0] == 'back':
        if queue:
            answer.append(queue[-1])
        else:
            answer.append(-1)

for i in answer:
    print(i)