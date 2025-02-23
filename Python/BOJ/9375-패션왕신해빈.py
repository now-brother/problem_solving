from unicodedata import category


test_case = int(input())

for i in range(test_case):
    n = int(input())
    category = dict()
    for j in range(n):
        a, b = map(str, input().split())
        if b not in category:
            category[b] = 2
        else:
            category[b] += 1
    
    ans = 1 
    for v in category.values():
        ans = ans * v
    
    print(ans - 1)
