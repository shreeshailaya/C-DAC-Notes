print('Enter 10 Numbers')
lst = []
for i in range(10):
    ele = int(input('' +str(i+1)+ ' => '))
    lst.append(ele)

small = lst[0]
big = lst[0]

for i in lst:
    if i < small:
        small = i
    if i > big:
        big = i

print('Minimum Number is : - '+str(small), 'Maximum Number is : -  ' +str(big))