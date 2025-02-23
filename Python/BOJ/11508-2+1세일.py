n = int(input())
price = []
sum = 0

for i in range(n):
    price.append(int(input()))

price.sort()

for i in range(n//3):
    sum += price.pop()
    sum += price.pop()
    price.pop()

for i in range(len(price)):
    sum += price[i]

print(sum)