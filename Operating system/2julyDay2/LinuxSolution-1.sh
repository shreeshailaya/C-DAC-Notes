1. Display only the day of system date.

$date +%a
   $date +%A

2. Display only the month of system date.
 $date +%b
   $date +%B

3. Execute the command to check hidden files.
 $ls -a

4. Execute command ls -l and study it in details again.
$touch f1

5. Create file f1 of size 0 bytes.
 Study ls in details

6. Create file f11 f12 f13 of size 0 bytes using single command.
 $touch f11 f12 f13

7. List all the files in your current directory.
 $ls

8. Create file Country and store names of 5 countries.Use cat command.
 $cat > Country
   India
   :
   :
   ctrl+d  to exit

9. Display contents of file Country.
 $cat Country

10. Create another file by name MoreCountries and store 5 more country names.
 $cat MoreCountries
     enter names here
     :
     :
     ctrl+d to exit

11. Display contents of MoreCountries.
 $cat MoreCountries

12. Copy contents of file Country in another file by name NewCountry.
 $cp Country NewCountry

13. See directory listing and check all file names you have created..
 $ls

14. Rename file Country to NewCountry and check in directory listing if file by name Country exsists.
 $mv Country NewCountry
    File country should not exsist.

15. Move contents of file MoreCountries in MoreCountries1. Check director listing..
 $mv MoreCountries MoreCountries1 
    $ls

16. Delete file f12.
 $rm f1

17. Delete file f11 and f13 using single command.
 $rm f11 f13

18. Clear the screen..
 $clear

19. Try cal command with all options..
 $cal
    $cal -y
    $cal -2
    $cal -3
    $cal -s

20. Try date comman with all options.
 $date
    $date +%a
    $date +%A
    $date +%b
    $date +%B

21. Diaplay contents of both the files NewCountry and MoreCountries1 using single command.
 $cat NewCountry MoreCountries1

22. Add 2 more country names in file NewCountry.
 $cat >> NewCountry

23. Copy contents of file NewCountry at the end of MoreCountries1.
 $cat NewCountry >> MoreCountries1

24. Execute command whoami.
 $whoami

25. Execute man command for ls.
 $man ls

26. Create directory CDAC.
 $mkdir CDAC

27. Change directory to CDAC.
 $cd CDAC

28. Execute command pwd and see the path.
 $pwd

29. Create files Trainers, Students and Admin with some meaningful entries under directory CDAC.
 $cat>Trainers
     enter some meaningful names
    ctrl+d
   
    $cat>Students   
     enter some meaningful names
    ctrl+d

    $cat>Admin 
     enter some meaningful names
    ctrl+d

30. Check directory listing.
 $ls

31. Change your directory one level back.
 $cd ..

32. Check output of pwd and ls commands.
 $pwd       (check the path)
    $ls

33. Create 2 directories eDAC and eDBDA under directory CDAC.
 $mkdir CDAC/eDAC
    $mkdir CDAC/eDBDA
       or
    $cd CDAC
    $mkdir eDAC
    $mkdir eDBDA

34. Using relative path create file DAC-Subject with names of 3 subjects and file DBDA-Subject with names of 3 subjects
 Considering we are one level back of CDAC directory commands are under directories eDAC and eDBDA respectively.
 
    $cat>CDAC/eDAC/DAC-Subject
     Java
     Web Programming
     Software Engineering
     ctrl+d
     


    $cat>CDAC/eDBDA/DBDA-Subject
     Python
     Cloud Computing
     Hadoop
     ctrl+d
