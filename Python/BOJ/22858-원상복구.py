from collections import deque

n, k = map(int, input().split())
arrK = list(map(int, input().split()))
arrD = list(map(int, input().split()))

for i in range(k):
    arrExample = []
    for j in range(n):
        arrExample.append(0)

    for l in range(n):
        arrExample[arrD[l] - 1] = arrK[l]
    
    arrK = arrExample

print(*arrExample)    