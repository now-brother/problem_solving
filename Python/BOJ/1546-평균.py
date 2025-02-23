N = int(input())

score = list(map(int, input().split()))
score.sort(reverse = True)
highScore = score[0]
newScore = []
for i in range(N):
    newScore.append(score[i]/highScore*100)

sum = 0
for i in range(N):
    sum += newScore[i]

print(sum / N)