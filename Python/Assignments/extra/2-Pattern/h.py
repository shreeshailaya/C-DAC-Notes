for i in range(5,-0,-1):
    if i%2 == 0 :
            print('0 ', end='')
    else :
        print('1 ', end='')
    for j in range(i-1):
        if i%2 == 0 and j%2 != 0 :
            print('0 ', end='')
        elif i%2 != 0 and j%2 == 0  :
            print('0 ', end='')
        else:
            print('1 ', end='')

    print()
