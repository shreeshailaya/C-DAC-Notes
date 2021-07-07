1. Print the present working directory.


shree@shree:~/Desktop/abc$ pwd
/home/shree/Desktop/abc

2. From working direcory show the contents of root directory.


shree@shree:~/Desktop/abc$ ls /
bin    etc             lib     lost+found  proc  snap    tmp      vmlinuz.old
boot   home            lib32   media       root  srv     usr
cdrom  initrd.img      lib64   mnt         run   sys     var
dev    initrd.img.old  libx32  opt         sbin  System  vmlinuz

3. Change directory to root.

shree@shree:~/Desktop/abc$ cd /


4. Change back to your home directory.

shree@shree:/$ cd 

5. Create directories C and Java and create 3 files with extension .c in C dirctory. Also create 2 files
    with .java extension in directory Java.

shree@shree:~/Desktop/abc$ mkdir c java
shree@shree:~/Desktop/abc$ touch c/a.c
shree@shree:~/Desktop/abc$ touch c/b.c
shree@shree:~/Desktop/abc$ touch c/c.c 
shree@shree:~/Desktop/abc$ touch java/a.java 
shree@shree:~/Desktop/abc$ touch java/b.java


6. Move all .c files to cprograms directory under current directory and java files to Java directory.


shree@shree:~/Desktop/abc$ touch c.java
shree@shree:~/Desktop/abc$ mv c.java java
shree@shree:~/Desktop/abc$ ls java
a.java  b.java  c.java


7. Create another directory temp.


shree@shree:~/Desktop/abc$ mkdir temp


8. Move all .c files in directory temp.


shree@shree:~/Desktop/abc$ mv c/* temp
shree@shree:~/Desktop/abc$ ls temp
a.c  b.c  c.c


9. Copy all files starting with name file in the directory copy_file.


shree@shree:~/Desktop/abc$ touch copy_file
shree@shree:~/Desktop/abc$ mv copy_file temp


10. Remove all .c files from your current directory

shree@shree:~/Desktop/abc$ ls
a  c  d.c  f.c  java  m.c  shree  temp
shree@shree:~/Desktop/abc$ rm *.c
shree@shree:~/Desktop/abc$ ls
a  c  java  shree  temp


11. Remove directory which is not empty.

shree@shree:~/Desktop/abc$ rm -r java
shree@shree:~/Desktop/abc$ ls
a  c  shree  temp


12. Create hard link for any file and check the effect using ls command.


shree@shree:~/Desktop/abc$ ln -s a asoft
shree@shree:~/Desktop/abc$ ls
a  asoft  c  shree  temp
shree@shree:~/Desktop/abc$ ls - 
ls: cannot access '-': No such file or directory
shree@shree:~/Desktop/abc$ ls -l
total 12
-rw-rw-r-- 1 shree shree   34 Jul  3 13:00 a
lrwxrwxrwx 1 shree shree    1 Jul  3 14:55 asoft -> a
drwxrwxr-x 2 shree shree 4096 Jul  3 14:42 c
-rw-rw-r-- 1 shree shree    0 Jul  3 12:33 shree
drwxrwxr-x 2 shree shree 4096 Jul  3 14:45 temp
shree@shree:~/Desktop/abc$ cat asoft
shree 
shail
om 
shubham
rajendra
shree@shree:~/Desktop/abc$ cat >> a
hello world added for checking soft link
shree@shree:~/Desktop/abc$ cat a
shree 
shail
om 
shubham
rajendra
hello world added for checking soft link
shree@shree:~/Desktop/abc$ cat asoft
shree 
shail
om 
shubham
rajendra
hello world added for checking soft link


13/14 13. Create soft link for any file and check the effect using ls command.
14. Find all the files whose name starts with hello in current directory.
      e.g hello1,hello2, hellofile etc.


shree@shree:~/Desktop/abc$ ls
a  asoft  c  hello1  hello2  hello3  shree  temp
shree@shree:~/Desktop/abc$ ls hello*
hello1  hello2  hello3



15. Count number of entries in your current directory.


shree@shree:~/Desktop/abc$ ls | wc -l
8


16. Find the empty files


17. Count total number of C files in current directory.

shree@shree:~/Desktop/abc$ ls
a  a.c  asoft  b.c  c  c.c  shree  temp
shree@shree:~/Desktop/abc$ ls *.c | wc -l
3


18. Count all the directories present in current directory.


shree@shree:~/Desktop/abc$ ls -d */
c/  temp/
shree@shree:~/Desktop/abc$ ls -d */ | wc -l
2


19. Consider following data file having roll-no, name and marks.
    5 amit 59
    1 babita 90
    3 chandan 89
    4 daya 69
    2 edwina 74
    sort the data on column 1 , 2 and 3.
    Store the data in different files and see the result.


shree@shree:~/Desktop/abc$ touch info
shree@shree:~/Desktop/abc$ rm info
shree@shree:~/Desktop/abc$ touch info.txt
shree@shree:~/Desktop/abc$ cat > info.txt
5 amit 59
1 babita 90 
3 chandan 89
4 daya 69
2 edwina 74
shree@shree:~/Desktop/abc$ cat info.txt
5 amit 59
1 babita 90
3 chandan 89
4 daya 69
2 edwina 74
shree@shree:~/Desktop/abc$ sort info.txt
1 babita 90
2 edwina 74
3 chandan 89
4 daya 69
5 amit 59

20. Create file with names of 10 countries.
    1. try head command
    2. try tail command
    3. display 6th and 7th country from your file.


shree@shree:~/Desktop/abc$ cat > ctry
INDIA 
PAKISTAN
BANGLADESH
PERU
USA
UAE
NORTHK 
SOUTHk
BHUTHAN
TAIWAN
shree@shree:~/Desktop/abc$ cat ctry
INDIA 
PAKISTAN
BANGLADESH
PERU
USA
UAE
NORTHK
SOUTHk
BHUTHAN
TAIWAN

shree@shree:~/Desktop/abc$ head -3 ctry
INDIA 
PAKISTAN
BANGLADESH


shree@shree:~/Desktop/abc$ head -n  +3 ctry
INDIA 
PAKISTAN
BANGLADESH


shree@shree:~/Desktop/abc$ head -n 7 ctry
INDIA 
PAKISTAN
BANGLADESH
PERU
USA
UAE
NORTHK


shree@shree:~/Desktop/abc$ tail -n 3 ctry
SOUTHk
BHUTHAN
TAIWAN


shree@shree:~/Desktop/abc$ tail -4 ctry | head -2
NORTHK
SOUTHk


21. create following data file

1231  Amitabh   1000000
2561  Shridevi  28905
1653  ShahRukh  62645
3823  Hritik    745218
5183  Dipika    56123
-Sort in descending order of name
-Add 4 more entries in above file
-Store sorted data in file by name NewActors
-Display line numbers for file (hint nl)
-Display first 2 lines of sorted data
-Display last 3 lines of sorted data
-Display line 3 4 5 of sorted data



shree@shree:~/Desktop/abc$ sort  -r data
1231 ABHITAB 100000
5183 Dioika 56123
3823 Hritik 745218
1653 Shahrukhkhan 62645
2561 SHRIDEVI 28905


shree@shree:~/Desktop/abc$ cat >> data
1 shree 54
2 akshay 55
3 jyoti 22
4 ram 87
shree@shree:~/Desktop/abc$ cat data
1231 ABHITAB 100000
2561 SHRIDEVI 28905
1653 Shahrukhkhan 62645
3823 Hritik 745218
5183 Dioika 56123
1 shree 54
2 akshay 55
3 jyoti 22
4 ram 87



shree@shree:~/Desktop/abc$ sort data > newActor
shree@shree:~/Desktop/abc$ ls newActor
newActor
shree@shree:~/Desktop/abc$ cat newActor
1231 ABHITAB 100000
1653 Shahrukhkhan 62645
1 shree 54
2561 SHRIDEVI 28905
2 akshay 55
3823 Hritik 745218
3 jyoti 22
4 ram 87
5183 Dioika 56123



4****


shree@shree:~/Desktop/abc$ nl data
     1	1231 ABHITAB 100000
     2	2561 SHRIDEVI 28905
     3	1653 Shahrukhkhan 62645
     4	3823 Hritik 745218
     5	5183 Dioika 56123
     6	1 shree 54
     7	2 akshay 55
     8	3 jyoti 22
     9	4 ram 87


shree@shree:~/Desktop/abc$ sort data | head -n +2 data
1231 ABHITAB 100000
2561 SHRIDEVI 28905



shree@shree:~/Desktop/abc$ sort data | tail -n 3 data
2 akshay 55
3 jyoti 22
4 ram 87


shree@shree:~/Desktop/abc$ cat data
1231 ABHITAB 100000
2561 SHRIDEVI 28905
1653 Shahrukhkhan 62645
3823 Hritik 745218
5183 Dioika 56123
1 shree 54
2 akshay 55
3 jyoti 22
4 ram 87
shree@shree:~/Desktop/abc$ sort data | tail -7  | head -3
1 shree 54
2561 SHRIDEVI 28905
2 akshay 55



