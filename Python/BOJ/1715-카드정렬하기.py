import heapq

n = int(input())
arr = []

for i in range(n):
    arr.append(int(input()))

heapq.heapify(arr)
ans = 0

while len(arr) >= 2:
    num1 = heapq.heappop(arr)
    num2 = heapq.heappop(arr)
    ans += (num1 + num2)
    heapq.heappush(arr, (num1 + num2))
    
print(ans)
