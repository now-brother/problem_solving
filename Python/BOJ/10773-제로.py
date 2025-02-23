n = int(input())

arr = []

for i in range(n):
    num = int(input())
    if num == 0:
        del(arr[-1])
    else:
        arr.append(num)

sum = 0

for i in arr:
    sum += i

print(sum)