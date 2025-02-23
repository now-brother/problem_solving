n, k = map(int, input().split())

arr = list(map(int, input().split()))
arrMinus = []

for i in range(n - 1):
    arrMinus.append(arr[i + 1]-arr[i])

sum = 0
arrMinus.sort()
for i in range(n - k):
    sum += arrMinus[i]

print(sum)
