n, k = map(int, input().split())
arr = []
a = 0
coin = 0

for i in range(n):
    arr.append(int(input()))

arr.sort(reverse = True)

while True:
    if k == 0:
        break
    while int(arr[a]) <= k:
        k -= arr[a]
        coin += 1
    a += 1

print(coin)
