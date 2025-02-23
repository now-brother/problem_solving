num_list = []
for i in range(10) :
    num_list.append(int(input()))
rest_list = []
for i in num_list:
    rest_list.append(i%42)
rest_set = set(rest_list)
print(len(rest_set))
