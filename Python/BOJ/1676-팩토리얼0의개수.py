num = int(input())
ans = 0
numP = 1
for i in range(num,1,-1):
    numP = numP * i

numP = str(numP)
while(str(numP[-1])==str(0)):
    ans += 1
    numP = numP[:-1]

print(ans)