def solution(video_len, pos, op_start, op_end, commands):
    answer = ''
    posM, posS = map(int, pos.split(':'))
    video_lenM, video_lenS = map(int, video_len.split(":"))
    op_startM, op_startS = map(int, op_start.split(":"))
    op_endM, op_endS = map(int, op_end.split(":"))

    if (op_startM<posM==op_endM and posS<op_endS) or \
            (op_startM<posM<op_endM) or \
            (op_startM==posM==op_endM and op_startS<=posS<op_endS) or \
            (op_startM==posM<op_endM and op_startS<=posS):
                posM, posS = op_endM, op_endS
    
    for c in commands:
        if c == "prev":
            if (posS-10 < 0) and (posM>=1): 
                posM -= 1
                posS = 60+(posS-10)
            else:
                posS = max(0, posS-10)
        if c == "next":
            if (posS+10 >= 60) and (posM<video_lenM): posM += 1
            
            if posM == video_lenM:
                posS = min((posS+10) % 60, video_lenS)
            else:
                posS = (posS+10) % 60
        if (op_startM<posM==op_endM and posS<op_endS) or \
                (op_startM<posM<op_endM) or \
                (op_startM==posM==op_endM and op_startS<=posS<op_endS) or \
                (op_startM==posM<op_endM and op_startS<=posS):
                    posM, posS = op_endM, op_endS
        
    answer = str(posM).zfill(2)+":"+str(posS).zfill(2)
    
    return answer