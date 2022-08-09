import csv
line_reader = []
def myFun():
    with open('data.csv', 'r') as csv_file:
        reader = csv.reader(csv_file)
        
        for i in reader:
            #print(i['name'])
            yield i


a = myFun()
for i in a:
    print(i[0])



            
'''
print(line_reader[1])
for i in line_reader:
    print(i[0])

'''