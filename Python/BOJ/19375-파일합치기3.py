import heapq

t = int(input())

for i in range(t):
    k = int(input())
    arr = list(map(int, input().split()))
    heapq.heapify(arr)
    ans = 0
    while True:
        num1 = heapq.heappop(arr)
        num2 = heapq.heappop(arr)
        ans += (num1 + num2)
        heapq.heappush(arr, (num1 + num2))
        if len(arr) == 1:
            print(ans)
            break
