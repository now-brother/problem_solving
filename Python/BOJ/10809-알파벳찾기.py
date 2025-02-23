arr = input()
ans = [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1]
alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

for i in range(len(arr)):
    for j in range(26):
        if arr[i] == alphabet[j]:
            if ans[j] == -1:
                ans[j] = i
            break

for i in ans:
    print(i, end = ' ')