def solution(bandage, health, attacks):
    timeMax = attacks[-1][0]
    healthMax = health
    success = 0
    for i in range(timeMax + 1):
        if i == attacks[0][0]:
            health -= attacks[0][1]
            if health <= 0:
                return -1
            attacks.pop(0)
            success = 0
        else:
            success += 1
            if health == healthMax:
                continue
            else:
                if success == bandage[0]:
                    success = 0
                    health += (bandage[1] + bandage[2])
                else:
                    health += bandage[1]
                
                if health > healthMax:
                    health = healthMax

    return health

if __name__ == "__main__":
    bandage = [5, 1, 5]	
    health = 30
    attacks = [[2, 10], [9, 15], [10, 5], [11, 5]]	

    print(solution(bandage, health, attacks))