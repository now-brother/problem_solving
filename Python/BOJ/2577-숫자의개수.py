a = int(input())
b = int(input())
c = int(input())

ans = a * b * c

arr = str(ans)
arr2 = []

for i in range(len(arr)):
    arr2.append(int(arr[i]))

ansArr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

for i in range(len(arr)):
    ansArr[arr2[i]] += 1

for i in range(10):
    print(ansArr[i])