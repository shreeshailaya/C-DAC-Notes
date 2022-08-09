def checkVowels(string):
    vowelsset = set('aeiou')
    myset = set()
    for i in string:
        if i in vowelsset:
            myset.add(i)
        else:
            pass

    if len(myset) == len(vowelsset):
        return True
    else:
        return False


s = input('Enter the String => ')

result = checkVowels(s)
if result == True:
    print('String Accepted')
else:
    print('Sorry String not accepted')