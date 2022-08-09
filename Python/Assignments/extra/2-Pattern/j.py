for row in range(5):
    for col in range(7):
        if col == 0 or col == 6 or (row < 3 and col == row+1) or (row == 1 and col == 4) or (col == 5 and row == 0):
            print('* ', end='')
        else:
            print('  ', end='')
    print()