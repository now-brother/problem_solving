import sys

n, m = map(int, input().split())

arrN = list(map(int, input().split()))
arrSum = [0 for i in range(n)]

for i in range(n):
    if i == 0:
        arrSum[i] = arrN[i]
    else:
        arrSum[i] = arrSum[i - 1] + arrN[i]

for _ in range(m):
    i, j = map(int, sys.stdin.readline().split())
    
    if i == 1:
        print(arrSum[j - 1])
    else:
        print(arrSum[j - 1] - arrSum[i - 2])