arr = input()
ans = []
n = 0
count_A = 0 

for i in range(len(arr)):
    if arr[i] == 'X':
        count_A += 1
    else:
        while count_A >= 4:
            ans.append('AAAA')
            count_A -= 4
        if count_A == 2:
            ans.append('BB')
            count_A = 0
        elif count_A == 0:
            count_A = 0
        else:
            print(-1)
            exit(0)
        ans.append('.')    
while count_A > 0:
    if count_A >= 4:
        ans.append('AAAA')
        count_A -= 4
    elif count_A >=2 and count_A < 4:
        ans.append('BB')
        count_A -=2
    else:
        print(-1)
        exit(0)
print(''.join(ans))