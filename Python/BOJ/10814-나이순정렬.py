import sys

n = int(sys.stdin.readline())

dataInput = []

for _ in range(n):
    age, name = sys.stdin.readline().split()
    age = int(age)
    dataInput.append((age, name))

dataInput.sort(key = lambda x : x[0])

for i in dataInput:
    print(i[0], i[1])