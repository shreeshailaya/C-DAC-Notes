x = 0
lst = []
for row in range(6):
    for col in range(5):
        if row == 0:
            x = x+1*row+1
            lst.append(x)
            print(str(x).zfill(2), end=' ')
        if row == 1:
            print(str(lst[-col-1]).zfill(2), end=' ')
        if row == 2:
            x = x+1*row+1-1
            lst.append(x)
            print(str(x).zfill(2), end=' ')
        if row == 3:
            print(str(lst[-col-1]).zfill(2), end=' ')
        if row == 4:
            x = x+1*row+1-1-1
            lst.append(x)
            print(str(x).zfill(2), end=' ')
        if row == 5:
            print(str(lst[-col-1]).zfill(2), end=' ')
    
    
    x = 0
    print()
