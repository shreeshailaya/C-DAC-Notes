mysql> create table Vehicle(vid int NOT NULL AUTO_INCREMENT, Vname varchar(20),
Price int, Descrip varchar(20),PRIMARY KEY(vid));
Query OK, 0 rows affected (2.50 sec)


mysql> create table Customer(
     custid int primary key,
     Cname varchar(20),
     Caddress varchar(20))
     ;
Query OK, 0 rows affected (1.50 sec)


mysql> create table Salesman(
     sid int primary key,
     Sname varchar(20),
     Saddress varchar(20));
Query OK, 0 rows affected (0.73 sec)


mysql> create table cust_vehicle(
     cust_id int,
     vid int,
     sid int,
     buy_price decimal(9,2),
     constraint pk primary key(cust_id,vid),
     constraint fk_sid foreign key(sid) references Salesman(sid)
     on delete set NULL on update cascade,
     constraint fk_vid foreign key(vid) references Vehicle(vid)
     on delete cascade on update cascade);
     
mysql> show tables;
+------------------+
| Tables_in_10june |
+------------------+
| Customer         |
| Salesman         |
| Vehicle          |
| cust_vehicle     |
+------------------+
4 rows in set (0.00 sec)

mysql> select * from Customer;
+--------+--------+----------+
| custid | Cname  | Caddress |
+--------+--------+----------+
|      1 | Nilima | Pimpri   |
|      2 | Ganesh | Pune     |
|      3 | Pankaj | Mumbai   |
+--------+--------+----------+
3 rows in set (0.02 sec)

mysql> select * from Salesman;
+-----+--------+----------+
| sid | Sname  | Saddress |
+-----+--------+----------+
|  10 | Rajesh | Mumbai   |
|  11 | Seema  | Pune     |
|  13 | Rakhi  | Pune     |
+-----+--------+----------+
3 rows in set (0.00 sec)

mysql> select * from Vehicle;
+-----+------------+--------+-----------------+
| vid | Vname      | Price  | Descrip         |
+-----+------------+--------+-----------------+
|   1 | Activa     |  80000 | sdsds           |
|   2 | Santro     | 800000 | dksjjhdfj       |
|   3 | Motor Bike | 100000 |  bike for motor |
+-----+------------+--------+-----------------+
3 rows in set (0.01 sec)

mysql> select * from cust_vehicle;
+---------+-----+------+-----------+
| cust_id | vid | sid  | buy_price |
+---------+-----+------+-----------+
|       1 |   1 |   10 |  75000.00 |
|       1 |   2 |   10 | 790000.00 |
|       2 |   3 |   11 |  80000.00 |
|       3 |   2 |   10 | 800000.00 |
|       3 |   3 |   11 |  75000.00 |
+---------+-----+------+-----------+
5 rows in set (0.00 sec)



### 5 find all customer name,vehicle name,salesman name for all salesman who stays in pune

	mysql> select cname ,vname,sname from  Vehicle v left join cust_vehicle cv on cv.vid=v.vid 		left join Salesman s on s.sid=cv.sid left join Customer c on c.custid=cv.cust_id where 		s.Saddress='pune';
	+--------+------------+-------+
	| cname  | vname      | sname |
	+--------+------------+-------+
	| Ganesh | Motor Bike | Seema |
	| Pankaj | Motor Bike | Seema |
	+--------+------------+-------+
	2 rows in set (0.08 sec)



### 6  find how many customers bought motor bike

	select c.cust_id,v.vname from cust_vehicle c  inner join Vehicle v on c.vid=v.vid where 	v.vid=3;
	+---------+------------+
	| cust_id | vname      |
	+---------+------------+
	|       2 | Motor Bike |
	|       3 | Motor Bike |
	+---------+------------+
	2 rows in set (0.01 sec)


###7 create a view find_discount which displays output


	mysql> create view find_discount as select cname,vname,price,buy_price,price buy_price"Discount" from cust_vehicle cv inner join Vehicle v on cv.vid=v.vid inner join Customer c on c.custid=cv.cust_id;
	Query OK, 0 rows affected (1.09 sec)

	mysql> select * from find_discount;
	+--------+------------+--------+-----------+----------+
	| cname  | vname      | price  | buy_price | Discount |
	+--------+------------+--------+-----------+----------+
	| Nilima | Activa     |  80000 |  75000.00 |  5000.00 |
	| Pankaj | Santro     | 800000 | 800000.00 |     0.00 |
	| Nilima | Santro     | 800000 | 790000.00 | 10000.00 |
	| Pankaj | Motor Bike | 100000 |  75000.00 | 25000.00 |
	| Ganesh | Motor Bike | 100000 |  80000.00 | 20000.00 |
	+--------+------------+--------+-----------+----------+
	5 rows in set (0.09 sec)


###8 find all customer name,vehicle name, salesman name, discount earn by all customer

	mysql> SELECT cv.cust_id,cname,cv.vid,vname,cv.sid,s.sname,price-Buy_price 'Discount' 
		FROM cust_vehicle cv inner join Customer c on cv.cust_id=c.custid 
		inner join Vehicle v on cv.vid=v.vid 
		inner join Salesman s on cv.sid=s.sid WHERE price - Buy_price > 0;
	+---------+--------+-----+------------+------+--------+----------+
	| cust_id | cname  | vid | vname      | sid  | sname  | Discount |
	+---------+--------+-----+------------+------+--------+----------+
	|       1 | Nilima |   2 | Santro     |   10 | Rajesh | 10000.00 |
	|       1 | Nilima |   1 | Activa     |   10 | Rajesh |  5000.00 |
	|       2 | Ganesh |   3 | Motor Bike |   11 | Seema  | 20000.00 |
	|       3 | Pankaj |   3 | Motor Bike |   11 | Seema  | 25000.00 |
	+---------+--------+-----+------------+------+--------+----------+
	4 rows in set (0.03 sec)

###9 create view my_hr to display empno,ename,job,comm for all employees who earn commission


	mysql> CREATE VIEW my_hr as SELECT empno,ename,job,comm FROM EMP 
	WHERE comm is not null and comm>0;
	Query OK, 0 rows affected (0.31 sec)

	mysql> select * from my_hr;
	+-------+--------+----------+---------+
	| empno | ename  | job      | comm    |
	+-------+--------+----------+---------+
	|  7499 | ALLEN  | SALESMAN |  300.00 |
	|  7521 | WARD   | SALESMAN |  500.00 |
	|  7654 | MARTIN | SALESMAN | 1400.00 |
	+-------+--------+----------+---------+
	3 rows in set (0.05 sec)

	
###10 create view mgr30 to display all employees from department 30

	mysql>  CREATE VIEW mgr30
	    ->        as 
	    ->        SELECT*
	    ->        FROM EMP
	    ->        WHERE deptno = 30;
	Query OK, 0 rows affected (0.22 sec)

	mysql> select * from mgr30;
	+-------+--------+----------+------+------------+---------+---------+--------+
	| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
	+-------+--------+----------+------+------------+---------+---------+--------+
	|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
	|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
	|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
	|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
	|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
	|  7900 | JAMES  | CLERK    | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
	+-------+--------+----------+------+------------+---------+---------+--------+
	6 rows in set (0.00 sec)


###11 insert 3 employees in view mgr30 check whether insertion is possible  

mysql> INSERT mgr30 values (5000,'Suresh','MANAGER',7698,'1984-06-10',9000,0,30);

        INSERT mgr30 values (5001,'Ganesh','MANAGER',7698,'1984-06-10',9000,0,30);
        INSERT mgr30 values (7942,'Mahesh','MANAGER',7698,'1984-06-10',9000,0,30);
   
   
   

###12. insert 3 records in dept and display all records from dept

	INSERT dept values (50,'ADMIN','PUNE');
	INSERT dept values (60,'R&D','DELHI');
 	INSERT dept values (70,'HR','MUMBAI');
 	
###13. use rollback command check what happens
	mysql> rollback;
  
###14. insert row in emp with empno 100

###15. insert row in emp with empno 101

###16. insert row in emp with empno 102

###17. add savepoint A

###18. insert row in emp with empno 103

###19. insert row in emp with empno 104

###20. insert row in emp with empno 105

###21. add savepoint B

###22. delete emp with empno 100

###23. delete emp with emp no 104

###24. rollback upto svaepoint B

###25. check what all records will appear in employee table

###26. rollback upto A

###26. rollback upto A

###27. check what all records will appear in employee table28. commit all changes

###28. commit all changes

###29. check what all records will appear in employee table30. check whether you can roll back the contents.

###30. check whether you can roll back the contents.

