num = int(input())
arr_tip = []
tip_max = 0

for i in range(num):
    arr_tip.append(int(input()))

arr_tip.sort(reverse = True)

for i in range(num):
    if int(arr_tip[i]) - int(i) >= 0:
        tip_max += int(arr_tip[i]) - i
    else:
        break

print(tip_max) 