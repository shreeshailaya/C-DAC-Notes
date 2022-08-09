for row in range(8):
    for col in range(row):
        if col == 0:
            continue
        print(str(2**col)+' ', end='')

    print()