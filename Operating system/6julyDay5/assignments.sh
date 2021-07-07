1

shree@shree:~/Desktop/abc$ tar -xf shree.tar 
shree@shree:~/Desktop/abc$ ls
abc.sh  b.c  country  file   fruits      newfruits  shree1
a.c     c.c  dj       file1  nameoffile  shree      shree.tar


2

shree@shree:~/Desktop/abc$ zip -r dj.zip dj
  adding: dj/ (stored 0%)
  adding: dj/abc.sh (deflated 67%)
  adding: dj/a.c (stored 0%)
  adding: dj/b.c (stored 0%)


shree@shree:~/Desktop/abc$ unzip dj.zip
Archive:  dj.zip
   creating: dj/
  inflating: dj/abc.sh               
 extracting: dj/a.c                  
 extracting: dj/b.c     
 
 
 3
 shree@shree:~/Desktop/abc$ uniq fruits
apple
banana
mango
pineapple
grapes


4

shree@shree:~/Desktop/abc$ uniq -c  fruits
      3 apple
      1 banana
      2 mango
      1 pineapple
      1 grapes


5
echo "Enter file name"
read file
cat $file


shree@shree:~/Desktop/abc$ bash abc.sh
Enter file name
fruits
cat: fruits: Permission denied
shree@shree:~/Desktop/abc$ bash abc.sh
Enter file name
newfruits
mango 
banabna 
apple




6



echo Enter coloum no to sort
read no

case $no in
	1) sort  empolyee
	  ;;
	2) sort -k2  empolyee 
	  ;;  
	3) sort -k3  empolyee  
	  ;;
	*) echo wrong
	  ;;
esac




shree@shree:~/Desktop/abc$ bash abc.sh
Enter coloum no to sort
1
1425 Ravi 15.65
1450 Raju 21.86
4320 Anuja 26.27
6830 Sita 36.15
shree@shree:~/Desktop/abc$ bash abc.sh
Enter coloum no to sort
2
4320 Anuja 26.27
1450 Raju 21.86
1425 Ravi 15.65
6830 Sita 36.15
shree@shree:~/Desktop/abc$ 1
3
^Cshree@shree:~/Desktop/abc$ bash abc.sh
Enter coloum no to sort
3
1425 Ravi 15.65
1450 Raju 21.86
4320 Anuja 26.27

7

echo Enter 2 no

read a
read b

echo "
	1.add 
	2.sub
	3.multi
"
read no
case $no in
	1) x=$((a+b))
	echo $x
	  ;;
	2) x=$((a-b))
	echo $x
	  ;;  
	3) x=$((a*b))
	echo $x 
	  ;;
	*) echo wrong
	  ;;
esac
	  


8


echo "enter string"
read str
str1=$( echo "$str" | rev )
if [ $str == $str1 ]
  then
echo "palindrome"
else
echo "not palindrome"
fi


9

echo Enter source and destinatation
read src 
read des

if [ -f $src ]
then 
	sudo cp -R $src /"$dec"
	
elif  [ -d $str ]
then
	sudo cp -R $src $des
fi
	  

 
 
 1
 echo Enter the no 
read no 
i=1
while [ $i -le 10 ]
do
	k=$((i*no))
	echo $k
	i=$((i+1))
done	



2
for a in 15 16 17 18 19 20
do 
  echo $a
 done
  
  
  
3

i=1
until [ $i -ge 6 ] 
do
	echo $i
	i=$((i+1))
done


4

i=1
until [ $i -ge 20 ] 
do
	
	echo $i
	i=$((i+2))
done


5


echo "enter number"
read num

fact=1

while [ $num -gt 1 ]
do
fact=$((fact * num))
num=$((num - 1))
done
echo $fact
echo number is factorial


6


read m
read n
count=1
until [ $m -ge $n ]
do 
echo $m
m=$((m+2))
count=$((count+1))
done
echo count is
echo $count



