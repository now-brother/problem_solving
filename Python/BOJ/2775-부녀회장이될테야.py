T = int(input())

arr = [[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]]

i = 0
j = 0
sum = 0
arr1 = []
while True:
    if j == 14:
        arr.append(arr1)
        i += 1
        j = 0
        arr1 = []
        sum = 0
    if i == 14:
        break
    sum += arr[-1][j]
    arr1.append(sum)
    j += 1

for i in range(T):
    k = int(input())
    n = int(input())
    print(arr[k][n - 1])    