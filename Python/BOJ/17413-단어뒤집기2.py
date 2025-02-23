s = input()
ans = ''
i = 0
cnum = 0

while len(ans) <len(s):
    if s[i] == ' ':
        for j in range(i - cnum):
            ans.append(s[i - j - 1])
        cnum = i
        i += 1
    elif s[i] == '<':
        while s[i] != '>':
            ans.append(s[i])
            i += 1
        ans.append(s[i])
        i += 1
        cnum = i
    elif i == len(s) - 1:
        for j in range(i - cnum):
            ans.append(s[i - j - 1])
    else:
        i += 1

print(ans)