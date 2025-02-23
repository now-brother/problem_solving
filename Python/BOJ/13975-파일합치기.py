from collections import deque
t = int(input())

for i in range(t):
    k = int(input())
    arr = list(map(int, input().split()))
    queue = deque()
    for j in range(k):
        queue.append(arr[j])  
    ans = 0
    while True:
        sum = 0
        sum += queue[0]
        sum += queue[1]
        queue.append(queue[0]+queue[1])
        ans += queue[-1]
        queue.popleft()
        if len(queue) == 1:
            print(ans)
            break
        queue.popleft()
        if len(queue) == 1:
            print(ans)
            break