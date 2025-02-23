# n = int(input(),8)

# print('{:#b}'.format(n)[2:])

n = list(map(int, list(input())))
sum = 0
arr = []
for i in range(len(n)):
    sum += ((8**i)*n[len(n)-i-1])

while sum > 0:
    if sum % 2 == 1:
        sum = sum // 2
        arr.append(1)
    else:
        sum = sum // 2
        arr.append(0)

arr.reverse()

print(''.join(map(str, arr)))
