import sys

n = int(sys.stdin.readline())

arrSet = [0] * 20

for i in range(n):
    tempCommand = sys.stdin.readline().split()

    if len(tempCommand) == 1:
        command = tempCommand[0]
        if command == "all":
            arrSet = [1 for j in range(20)]
        elif command == "empty":
            arrSet = [0 for k in range(20)]
    else:
        command, x = tempCommand[0], tempCommand[1]
        if command == "add":
            arrSet[int(x) - 1] = 1
        elif command == "remove":
            arrSet[int(x) - 1] = 0
        elif command == "check":
            if arrSet[int(x) - 1] == 1:
                print(1)
            else:
                print(0)
        elif command == "toggle":
            if arrSet[int(x) - 1] == 1:
                arrSet[int(x) - 1] = 0
            else:
                arrSet[int(x) - 1] = 1
        elif command == "all":
            arrSet = [1 for j in range(20)]
        elif command == "empty":
            arrSet = [0 for k in range(20)]
