arr = [0 for i in range(30)]

for i in range(28):
    n = int(input())
    arr[n-1] = n

for i in range(30):
    if arr[i] == 0:
        print(i+1)
