a, b = map(str, input().split())
a2 = []
b2 = []

for i in range(3):
    a2.append(a[2-i])

for i in range(3):
    b2.append(b[2-i])

a3 = 100 * int(a2[0]) + 10 * int(a2[1]) + int(a2[2])
b3 = 100 * int(b2[0]) + 10 * int(b2[1]) + int(b2[2])

if a3 > b3:
    print(a3)
else:
    print(b3)