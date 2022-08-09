def findPrimeSeries(num):
    flag = None
   
    for i in range(1, num+1):
        if i>1:
            for j in range(2, i):
                if (i%j) == 0:
                    break
            else:
                yield i
        



for i in findPrimeSeries(7):
    print(i)