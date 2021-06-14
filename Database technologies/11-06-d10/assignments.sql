### 1 Write a procedure to print vehicle greater then and equal to 80000, and call that procedure.

	mysql>      DELIMITER && 
	mysql> CREATE PROCEDURE get_Bike ()  
	    -> BEGIN  
	    ->  SELECT * FROM Vehicle WHERE price=80000; 
	    ->  SELECT COUNT(vid) AS Total_Vehicle FROM Vehicle; 
	    -> END &&  
	Query OK, 0 rows affected (0.42 sec)

	mysql> DELIMITER ;
	mysql> call get_Bike;
	+-----+--------+-------+---------+
	| vid | Vname  | Price | Descrip |
	+-----+--------+-------+---------+
	|   1 | Activa | 80000 | sdsds   |
	+-----+--------+-------+---------+
	1 row in set (0.13 sec)

	+---------------+
	| Total_Vehicle |
	+---------------+
	|             3 |
	+---------------+
	1 row in set (0.28 sec)

	Query OK, 0 rows affected (0.28 sec)


###2 Pass address to procedure and check whether the same address is available or not.

mysql> delimiter &&
mysql> CREATE PROCEDURE get_Customer (IN address varchar(20))  
    -> BEGIN  
    ->     SELECT * FROM Customer where Caddress=address;  
    ->     SELECT COUNT(custid) AS Total_Student FROM Customer;    
    -> END &&

	mysql> call get_Customer('Pune');
	+--------+--------+----------+
	| custid | Cname  | Caddress |
	+--------+--------+----------+
	|      2 | Ganesh | Pune     |
	+--------+--------+----------+
	1 row in set (0.04 sec)

	+---------------+
	| Total_Student |
	+---------------+
	|             3 |
	+---------------+
	1 row in set (0.04 sec)

	Query OK, 0 rows affected (0.04 sec)


###3

a)Write a procedure that displays the following information of all emp Empno,Name,job,Salary,Status,deptno
Note: - Status will be (Greater, Lesser or Equal) respective to average salary of their own department. Display an error message Emp  table is empty if there is no matching
record.

b) Write code to use this procedure.


	mysql> delimiter //
	mysql> create procedure getempinfo()
	    -> begin
	    -> select empno,ename,job,sal,deptno,
	    -> case when sal>(select avg(sal) from EMP p
	    -> where p.deptno=e.deptno) then 'Greater'
	    -> when sal<(select avg(sal) from EMP  p
	    -> where p.deptno=e.deptno) then 'Lesser'
	    -> when sal=(select avg(sal) from EMP p
	    -> where p.deptno=e.deptno) then 'Equal'
	    -> else 'Empty' end "Status"
	    -> from EMP e;
	    -> end//
	Query OK, 0 rows affected (0.22 sec)

	mysql> delimiter ;
	mysql> call getempinfo();
	+-------+--------+-----------+---------+--------+---------+
	| empno | ename  | job       | sal     | deptno | Status  |
	+-------+--------+-----------+---------+--------+---------+
	|  7369 | SMITH  | CLERK     |  800.00 |     20 | Lesser  |
	|  7499 | ALLEN  | SALESMAN  | 1600.00 |     30 | Lesser  |
	|  7521 | WARD   | SALESMAN  | 1250.00 |     30 | Lesser  |
	|  7566 | JONES  | MANAGER   | 2975.00 |     20 | Greater |
	|  7654 | MARTIN | SALESMAN  | 1250.00 |     30 | Lesser  |
	|  7698 | BLAKE  | MANAGER   | 2850.00 |     30 | Greater |
	|  7782 | CLARK  | MANAGER   | 2450.00 |     10 | Lesser  |
	|  7788 | SCOTT  | ANALYST   | 3000.00 |     20 | Greater |
	|  7839 | KING   | PRESIDENT | 5000.00 |     10 | Greater |
	|  7844 | TURNER | SALESMAN  | 1500.00 |     30 | Lesser  |
	|  7876 | ADAMS  | CLERK     | 1100.00 |     20 | Lesser  |
	|  7900 | JAMES  | CLERK     |  950.00 |     30 | Lesser  |
	|  7902 | FORD   | ANALYST   | 3000.00 |     20 | Greater |
	|  7934 | MILLER | CLERK     | 1300.00 |     10 | Lesser  |
	|  5000 | Suresh | MANAGER   | 9000.00 |     30 | Greater |
	+-------+--------+-----------+---------+--------+---------+
	15 rows in set (0.02 sec)

	Query OK, 0 rows affected (0.02 sec)



