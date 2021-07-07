1. Using positional parameter display contents of file. File name is given as command line argument.

 cat $1 


2. Write a script to copy the contents of file1 to file2 using positional parameters.

 cat $1 $2
cp $1 $2
 bash abc.sh shree1 xxx
 
3. Write a script to copy contents of 2 files in one file and see the result using cat. Use positional

 
a=$1
b=$2
c=$3
cp $1 $3
cat $2 >> $3
cat $3 


4. Write a shell utility to copy top n lines from a file into fileCopy.txt file. Pass number of lines and file
    name as command line arguments.
    
    
no=$1
file=$2
touch fileCopy.txt
cat $2 | head -n $1 > fileCopy.txt


