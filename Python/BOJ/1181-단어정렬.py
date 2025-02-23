n = int(input())

arr = []
for i in range(n):
    arr.append(input())

setArr = set(arr)
arr = list(setArr)

arr.sort()
arr.sort(key = len)

for i in range(len(arr)):
    print(arr[i])