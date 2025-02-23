n, m = map(int, input().splie())
num_list = []
ans = 0

num_list = list(map(int, input().split()))

for i in range(m):
    sum = 0
    for j in num_list:
        sum += int(num_list[j])
    avg = int(sum // len(num_list))

    if num_list[i] > avg:
        print(avg)
