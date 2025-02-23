n, w = map(int, input().split())
arr = []
count = 0

for i in range(n):
    arr.append(int(input()))

for i in range(n - 1):
    if arr[i] < arr[i + 1]:
        if w//arr[i] > 0:     
            count = w//arr[i]
            w -= (count * arr[i])
    elif arr[i] > arr[i + 1]:
        w += (count * int(arr[i]))
        count = 0

w += count * arr[n - 1]

print(w)
