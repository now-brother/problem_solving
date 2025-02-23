import sys

n, m = map(int, sys.stdin.readline().split())

dic = {}

for i in range(n):
    pokemon = str(sys.stdin.readline().strip())
    dic[i + 1] = pokemon
    dic[pokemon] = i + 1

for i in range(m):
    question = sys.stdin.readline().strip()

    if question.isdigit():
        print(dic[int(question)])
    else:
        print(dic[question])
