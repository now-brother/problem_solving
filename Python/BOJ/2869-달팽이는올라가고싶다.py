a, b, v = map(int, input().split())

last_day_goal = v-b
one_day_climb = a-b

if last_day_goal % one_day_climb == 0:
    print(last_day_goal // one_day_climb)
else:
    print(last_day_goal//one_day_climb + 1)