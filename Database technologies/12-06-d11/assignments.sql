### 1

mysql> delimiter //
mysql> create procedure empi1()
     begin
     select count(*)
     from EMP
     where deptno=30;
     end //
Query OK, 0 rows affected (0.29 sec)

mysql> call empi1();

+----------+
| count(*) |
+----------+
|        6 |
+----------+
1 row in set (0.05 sec)

Query OK, 0 rows affected (0.05 sec)

### 2 

	create procedure insert_data(in empno int, in ename varchar(20), in job varchar(20), in 	mgr int, in hdate Date,in sal int, in comm int, in deptno int )
	begin 
	insert into EMP values(empno,ename,job,mgr,hdate,sal,comm,deptno);
	end //
	
mysql> call insert_data(11,"Shree","xyz",22,"1997-08-07",5000,55,30)//
Query OK, 1 row affected (0.16 sec)


### 3
	create procedure drop_data(in deNo int)
	begin 
	Delete from EMP where empno=deNo;
	end //
	
### 4

	create procedure sal_compare(in isal int)
	begin 
	select empno,ename,e.deptno,dname,sal from EMP e inner join DEPT d on e.deptno=d.deptno where sal>isal;
	end //
mysql> call sal_compare(2000)
    -> //
+-------+-------+--------+------------+---------+
| empno | ename | deptno | dname      | sal     |
+-------+-------+--------+------------+---------+
|  7566 | JONES |     20 | RESEARCH   | 2975.00 |
|  7698 | BLAKE |     30 | SALES      | 2850.00 |
|  7782 | CLARK |     10 | ACCOUNTING | 2450.00 |
|  7788 | SCOTT |     20 | RESEARCH   | 3000.00 |
|  7839 | KING  |     10 | ACCOUNTING | 5000.00 |
|  7902 | FORD  |     20 | RESEARCH   | 3000.00 |
+-------+-------+--------+------------+---------+
6 rows in set (0.04 sec)

Query OK, 0 rows affected (0.04 sec)

### 5

create procedure print_upto(in no int)
begin
declare x int default 0;
while x<no DO
	set x=x+1;
	select x;
end while;
end //


### 6 
create procedure check_sm_city(in padress varchar(20))
begin
declare cset int default 0;
declare pvname varchar(20);
declare pcity varchar(20);
declare salescur cursor for select Sname,Saddress from Salesman where Saddress=padress;
open salescur;
lable1:loop
	fetch salescur into pvname,pcity;
	if cset=1 then
		leave lable1;
	end if;
	select pvname,pcity;
	end loop;
	close salescur;
end //  

mysql> call check_sm_city("Pune")
    -> //
+--------+-------+
| pvname | pcity |
+--------+-------+
| Seema  | Pune  |
+--------+-------+
1 row in set (0.13 sec)

+--------+-------+
| pvname | pcity |
+--------+-------+
| Rakhi  | Pune  |
+--------+-------+
1 row in set (0.13 sec)




