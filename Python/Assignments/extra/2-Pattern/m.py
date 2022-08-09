n=int(input('Enter a Number'))
alpha="abcdefghijklmnopqrstuvwxyz"
s=""

l=[]

for i in range(n):
    s="-".join(alpha[i:n])

    l.append(s[::-1]+s[1:])

length=len(l[0])

for i in range(n-1,0,-1):
    print(l[i].center(length,"-"))
    
for i in range(n):
    print(l[i].center(length,"-"))    
