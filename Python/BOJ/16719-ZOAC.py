string = list(input())

if len(string) == 1:
    print(string[0])
    exit(0)

dic = []

for i in range(len(string)):
    dic.append((string[i], i))
dic = sorted(dic)

ans = [0 for _ in range(len(string))]
