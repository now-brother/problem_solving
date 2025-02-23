n, m = map(int, input().split())

set = dict()

for i in range(n):
    inputStr = input()

    set[inputStr] = 1

arrAns = []
for i in range(m):
    inputStr = input()
    if inputStr in set:
        arrAns.append(inputStr)

arrAns = sorted(arrAns)

print(len(arrAns))
for i in arrAns:
    print(i)