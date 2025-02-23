n = int(input())
string = input()
arr = []

for i in range(n):
    arr.append(ord(string[i]))

sum = 0
for i in range(n):
   x = arr[i]
   y = (x - 96) * (31**i)
   sum += y
print(sum % 1234567891)