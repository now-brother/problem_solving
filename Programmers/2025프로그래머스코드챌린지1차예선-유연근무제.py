def solution(schedules, timelogs, startday):
    answer = 0
    
    new_schedules = []
    for schedule in schedules:
        hour = schedule // 100
        minute = schedule % 100
        minute = (minute + 10) % 60
        hour += (schedule % 100 + 10) // 60  # 60분 초과 시 시간 증가
        new_schedules.append(hour * 100 + minute)
        
    checks = [0] * len(timelogs)
    for day in range(7):
        today = (startday + day) % 7
        if today in {0, 6}:
            continue
        for i in range(len(timelogs)):
            if timelogs[i][day] <= new_schedules[i]:
                checks[i] += 1
                if checks[i] == 5:
                    answer += 1
    
    return answer