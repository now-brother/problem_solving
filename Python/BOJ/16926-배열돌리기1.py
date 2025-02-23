from array import array


n, m, r = map(int, input().split())

arrA = []
arrEx = [[0]*m for i in range(n)]

for i in range(n):
    arrA.append(list(map(int, input().split())))

for i in range(r):
    for j in range(n//2):
          arrEx.append()