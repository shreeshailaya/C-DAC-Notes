1. Display all the processes.

ps -e

2. Print pid,ppid and command for each process.


ps -e -o pid,ppid


3. Create a file named file1 in the current directory, change the permission for file to following
      a. rwx for user rw for group r for other1
      b. rw for user r for group and other
      c. rwx for all
      d. rwx for user r for group and other
      e. rw for user rw for group and r for other
      Use symbols and numeric values both to allocate permissions.


4. Write a shell script to display the contents of file MoreCountries1.

cat countery

bash abc.sh
india
nepal pakistan
mango 


5. Accept name of a file from user and display the contents of file.

echo "Enter the Number"
read num
echo the number is $num
shree@shree:~/Desktop/abc$ bash abc.sh
__________________________________________________________

********************************************
****                                   *****
***                                      ***
**       Welcome to my program            **
*                                          *
********************************************

Enter the Number
4
the number is 4

6. Write a shell script to copy contents of one file into another. Accept file name
   from user.


echo "Enter the name of file to copy"
read nameoffile
touch $nameoffile
cat country > $nameoffile

____________________________________________
Enter the name of file to copy
shree1
shree@shree:~/Desktop/abc$ catshree1
^Cshree@shree:~/Desktop/abc$ cat shree1
india
nepal pakistan




7. Write a shell utility which will print top 10 cpu consuming processes.


 ps -eo pcpu,pid,user,args | head -n 10
 
 _________________________________________________
 
%CPU     PID USER     COMMAND
 0.0       1 root     /sbin/init splash
 0.0       2 root     [kthreadd]
 0.0       3 root     [rcu_gp]
 0.0       4 root     [rcu_par_gp]
 0.0       6 root     [kworker/0:0H-events_highpri]
 0.0       9 root     [mm_percpu_wq]
 0.0      10 root     [rcu_tasks_rude_]
 0.0      11 root     [rcu_tasks_trace]
 0.0      12 root     [ksoftirqd/0]




8. Write a shell utility to print top 10 memory consuming processes.


$ ps -e | head -n 10
____________________________________________
    PID TTY          TIME CMD
      1 ?        00:00:03 systemd
      2 ?        00:00:00 kthreadd
      3 ?        00:00:00 rcu_gp
      4 ?        00:00:00 rcu_par_gp
      6 ?        00:00:00 kworker/0:0H-events_highpri
      9 ?        00:00:00 mm_percpu_wq
     10 ?        00:00:00 rcu_tasks_rude_
     11 ?        00:00:00 rcu_tasks_trace
     12 ?        00:00:00 ksoftirqd/0

9. Write a shell utility to copy top n lines from a file into fileCopy.txt file. Accept number of lines and
     filename  from user.

echo "Type a file name to create"
read file
touch $file
echo "Enter the data"
cat > $file
echo "Enter NEW FILE NAME "
read file1
touch file1
echo "Enter NO of LINE TO COPY"
read no
head -n $no $file > file1
echo "Data in new file"
cat file1
_________________________________________________
Type a file name to create
file
Enter the data
a
b
c
d
e
f
Enter NEW FILE NAME 
file1
Enter NO of LINE TO COPY
2
shree@shree:~/Desktop/abc$ cat file1
a
b



10. Write a shell utility to  Count number of files and directories in your current directory.


 ls | wc -l

9



11. Write a shell utility to print count of files of given extension. Accept extension from user.


echo "Enter the file extentation name"
read name
ls *$name | wc -l

______________________________________________________

Enter the file extentation name
.c
3



