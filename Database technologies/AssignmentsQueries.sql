### 3/6/d3

mysql> select * from EMP;

+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
14 rows in set (0.05 sec)



### 1 To list all records with sal > 2000 and comm>200

mysql>  select * from EMP where SAL>2000 or COMM>200;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
+-------+--------+-----------+------+------------+---------+---------+--------+
9 rows in set (0.00 sec)

### 2 To list all record with job=’Clerk’ or sal>2000

mysql> select * from EMP where JOB='Clerk' or SAL > 2000;
+-------+--------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-----------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-----------+------+------------+---------+------+--------+
10 rows in set (0.00 sec)

### 3 To list all the record with sal=1250 or 1100 or 2850

mysql> select * from EMP where SAL=1250 or SAL= 1100 or SAL=2850;
- or 
mysql> select * from EMP where SAL in (1250,1100,2850);

+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7876 | ADAMS  | CLERK    | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
+-------+--------+----------+------+------------+---------+---------+--------+
4 rows in set (0.00 sec)

### 4 To list all employees with sal>1250 and <2850

mysql> select * from EMP where SAL>=1250 and SAL<=2850;
- or 
select * from EMP where SAL between 1250 and 2850;

+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7934 | MILLER | CLERK    | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+----------+------+------------+---------+---------+--------+
7 rows in set (0.00 sec)

### 5 To list all employees with name ends with AS

mysql> select * from EMP where ENAME like "%TH";
+-------+-------+-------+------+------------+--------+------+--------+
| EMPNO | ENAME | JOB   | MGR  | HIREDATE   | SAL    | COMM | DEPTNO |
+-------+-------+-------+------+------------+--------+------+--------+
|  7369 | SMITH | CLERK | 7902 | 1980-12-17 | 800.00 | NULL |     20 |
+-------+-------+-------+------+------------+--------+------+--------+
1 row in set (0.00 sec)

### 6 To list all employees with job starts with C and ends with K

mysql> select * from EMP where JOB like "C%K";
+-------+--------+-------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB   | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7876 | ADAMS  | CLERK | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES  | CLERK | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7934 | MILLER | CLERK | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-------+------+------------+---------+------+--------+
4 rows in set (0.00 sec)

### 7  To list all employees with job contains L at third position and
M at third last position

mysql> select * from EMP where JOB like "__L%M__";
+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
+-------+--------+----------+------+------------+---------+---------+--------+
4 rows in set (0.00 sec)


### 8 To list all the record with sal not equal to 1250 or 1100 or 2850

mysql> select * from EMP where SAL!=1250 and sal!=1100 and sal!=2850;
+-------+--------+-----------+------+------------+---------+--------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+--------+-----------+------+------------+---------+--------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |   NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |   NULL |     20 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |   NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |   NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |   NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |   0.00 |     30 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |   NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |   NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |   NULL |     10 |
+-------+--------+-----------+------+------------+---------+--------+--------+
10 rows in set (0.00 sec)

### 9 To list all employees with salnot >1250 and <2850

mysql> select * from EMP where SAL not in(1250,2850);
+-------+--------+-----------+------+------------+---------+--------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+--------+-----------+------+------------+---------+--------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |   NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |   NULL |     20 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |   NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |   NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |   NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |   0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |   NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |   NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |   NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |   NULL |     10 |
+-------+--------+-----------+------+------------+---------+--------+--------+
11 rows in set (0.00 sec)

### 10 To list all employees with job starts with C , E at 3rd position and  ends with K

mysql> select * from EMP where JOB like 'C_E%K';
+-------+--------+-------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB   | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7876 | ADAMS  | CLERK | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES  | CLERK | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7934 | MILLER | CLERK | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-------+------+------------+---------+------+--------+
4 rows in set (0.00 sec)

### 11 To list all rows with comm is null

mysql> select * from EMP where COMM is null;
+-------+--------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-----------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-----------+------+------------+---------+------+--------+
10 rows in set (0.00 sec)

### 12  To list all employees with sal is null and name starts with ‘S’

mysql> select * from EMP where COMM is NULL and ENAME like "S%";
- Replaced SAL with COMM
+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7369 | SMITH | CLERK   | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7788 | SCOTT | ANALYST | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+
2 rows in set (0.00 sec)


### 13 To list all employees with job contains 5 characters

mysql> select * from EMP where JOB like "_____";
+-------+--------+-------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB   | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7876 | ADAMS  | CLERK | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES  | CLERK | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7934 | MILLER | CLERK | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-------+------+------------+---------+------+--------+
4 rows in set (0.00 sec)


### 14     14. To list all employees with name contain ‘A’ at 1 position and job 
Contains 5 characters

mysql> select * from EMP where ENAME like "A%" and JOB like "_____";
+-------+-------+-------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB   | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+-------+------+------------+---------+------+--------+
|  7876 | ADAMS | CLERK | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
+-------+-------+-------+------+------------+---------+------+--------+
1 row in set (0.00 sec)


***
***
mysql> select ENAME,SAL from EMP;
+--------+---------+
| ENAME  | SAL     |
+--------+---------+
| SMITH  |  800.00 |
| ALLEN  | 1600.00 |
| WARD   | 1250.00 |
| JONES  | 2975.00 |
| MARTIN | 1250.00 |
| BLAKE  | 2850.00 |
| CLARK  | 2450.00 |
| SCOTT  | 3000.00 |
| KING   | 5000.00 |
| TURNER | 1500.00 |
| ADAMS  | 1100.00 |
| JAMES  |  950.00 |
| FORD   | 3000.00 |
| MILLER | 1300.00 |
+--------+---------+
14 rows in set (0.00 sec)

### 1  Retrieve the details (Name, Salary and dept no) of the emp who are working in department code 20, 30 and 40.

mysql> select ENAME,SAL,DEPTNO from EMP where DEPTNO=20 or DEPTNO=30 or DEPTNO=40;
+--------+---------+--------+
| ENAME  | SAL     | DEPTNO |
+--------+---------+--------+
| SMITH  |  800.00 |     20 |
| ALLEN  | 1600.00 |     30 |
| WARD   | 1250.00 |     30 |
| JONES  | 2975.00 |     20 |
| MARTIN | 1250.00 |     30 |
| BLAKE  | 2850.00 |     30 |
| SCOTT  | 3000.00 |     20 |
| TURNER | 1500.00 |     30 |
| ADAMS  | 1100.00 |     20 |
| JAMES  |  950.00 |     30 |
| FORD   | 3000.00 |     20 |
+--------+---------+--------+
11 rows in set (0.00 sec)



### 2  Display the total salary of all employees . Total salary will be calculated as sal+comm+sal*0.10

mysql> select ENAME,JOB,SAL,COMM,SAL+ifnull(COMM,1)+SAL*0.10"Total SAl" from EMP;
+--------+-----------+---------+---------+-----------+
| ENAME  | JOB       | SAL     | COMM    | Total SAl |
+--------+-----------+---------+---------+-----------+
| SMITH  | CLERK     |  800.00 |    NULL |  881.0000 |
| ALLEN  | SALESMAN  | 1600.00 |  300.00 | 2060.0000 |
| WARD   | SALESMAN  | 1250.00 |  500.00 | 1875.0000 |
| JONES  | MANAGER   | 2975.00 |    NULL | 3273.5000 |
| MARTIN | SALESMAN  | 1250.00 | 1400.00 | 2775.0000 |
| BLAKE  | MANAGER   | 2850.00 |    NULL | 3136.0000 |
| CLARK  | MANAGER   | 2450.00 |    NULL | 2696.0000 |
| SCOTT  | ANALYST   | 3000.00 |    NULL | 3301.0000 |
| KING   | PRESIDENT | 5000.00 |    NULL | 5501.0000 |
| TURNER | SALESMAN  | 1500.00 |    0.00 | 1650.0000 |
| ADAMS  | CLERK     | 1100.00 |    NULL | 1211.0000 |
| JAMES  | CLERK     |  950.00 |    NULL | 1046.0000 |
| FORD   | ANALYST   | 3000.00 |    NULL | 3301.0000 |
| MILLER | CLERK     | 1300.00 |    NULL | 1431.0000 |
+--------+-----------+---------+---------+-----------+
14 rows in set (0.01 sec)



### 3  List the Name and job of the emp who have joined before 1 jan 1986 and whose salary range is between 1200and 2500. Display the columns with user defined Column headers. 

mysql> select * from EMP where HIREDATE<"1986-01-01" and SAL between 1200 and 2500;
+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7934 | MILLER | CLERK    | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+----------+------+------------+---------+---------+--------+
6 rows in set (0.03 sec)



### 4  List the empno, name, and department number of the emp works under manager with id 7698.

mysql> select EMPNO, ENAME, DEPTNO from EMP where EMPNO=7698;
+-------+-------+--------+
| EMPNO | ENAME | DEPTNO |
+-------+-------+--------+
|  7698 | BLAKE |     30 |
+-------+-------+--------+
1 row in set (0.00 sec)

### 5  List the name, job, and salary of the emp who are working in departments 10 and 30.

mysql> select ENAME,JOB,SAL,DEPTNO from EMP where DEPTNO=10 or DEPTNO=30;
+--------+-----------+---------+--------+
| ENAME  | JOB       | SAL     | DEPTNO |
+--------+-----------+---------+--------+
| ALLEN  | SALESMAN  | 1600.00 |     30 |
| WARD   | SALESMAN  | 1250.00 |     30 |
| MARTIN | SALESMAN  | 1250.00 |     30 |
| BLAKE  | MANAGER   | 2850.00 |     30 |
| CLARK  | MANAGER   | 2450.00 |     10 |
| KING   | PRESIDENT | 5000.00 |     10 |
| TURNER | SALESMAN  | 1500.00 |     30 |
| JAMES  | CLERK     |  950.00 |     30 |
| MILLER | CLERK     | 1300.00 |     10 |
+--------+-----------+---------+--------+
9 rows in set (0.00 sec)

### 6
mysql> select ENAME,DEPTNO,CONCAT(ENAME,"     ",DEPTNO)"Emp Info" from EMP;
+--------+--------+---------------+
| ENAME  | DEPTNO | Emp Info      |
+--------+--------+---------------+
| SMITH  |     20 | SMITH     20  |
| ALLEN  |     30 | ALLEN     30  |
| WARD   |     30 | WARD     30   |
| JONES  |     20 | JONES     20  |
| MARTIN |     30 | MARTIN     30 |
| BLAKE  |     30 | BLAKE     30  |
| CLARK  |     10 | CLARK     10  |
| SCOTT  |     20 | SCOTT     20  |
| KING   |     10 | KING     10   |
| TURNER |     30 | TURNER     30 |
| ADAMS  |     20 | ADAMS     20  |
| JAMES  |     30 | JAMES     30  |
| FORD   |     20 | FORD     20   |
| MILLER |     10 | MILLER     10 |
+--------+--------+---------------+
14 rows in set (0.00 sec)

### 7  Display the emp details who do not have manager. 

mysql> select * from EMP where JOB not like"MANAGER";
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
11 rows in set (0.03 sec)

### 8 Write a query which will display name, department no and date of joining of all employee who were joined  January 1, 1981 and March 31, 1983. Sort it based on date of joining (ascending).

mysql> select ename,deptno,hiredate from EMP where hiredate between '1981-01-01' and '1983-03-31'  order by hiredate;
+--------+--------+------------+
| ename  | deptno | hiredate   |
+--------+--------+------------+
| ALLEN  |     30 | 1981-02-20 |
| WARD   |     30 | 1981-02-22 |
| JONES  |     20 | 1981-04-02 |
| BLAKE  |     30 | 1981-05-01 |
| CLARK  |     10 | 1981-06-09 |
| TURNER |     30 | 1981-09-08 |
| MARTIN |     30 | 1981-09-28 |
| KING   |     10 | 1981-11-17 |
| JAMES  |     30 | 1981-12-03 |
| FORD   |     20 | 1981-12-03 |
| MILLER |     10 | 1982-01-23 |
| SCOTT  |     20 | 1982-12-09 |
| ADAMS  |     20 | 1983-01-12 |
+--------+--------+------------+
13 rows in set (0.00 sec)

### 9 Display the employee details where the job contains word ‘AGE’ anywhere in the Job

mysql> select * from EMP where REGEXP_LIKE(job,'^.*AGE');
+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE | MANAGER | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7782 | CLARK | MANAGER | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
+-------+-------+---------+------+------------+---------+------+--------+
3 rows in set (0.21 sec)

### 10 List the details of the employee , whose names start with ‘A’ and end with ‘S’ or whose names contains N as the second or third character, and ending with either ‘N’ or ‘S’.

mysql> select * from EMP where REGEXP_LIKE(ename,'^A.*S$|(^.N|^..N).*(N$|S$)');
+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7876 | ADAMS | CLERK   | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+
2 rows in set (0.05 sec)

### 11 List the names of the emp having ‘_’ character in their name.

***
***

### Single row functions

## 1. To list all employees and their email, to generate email use 2 to 5  characters from ename
Concat it with 2 to 4 characters in job and then concat it with ‘@mycompany.com’

select empno,ename,concat(concat(concat(ename,substr(job,2,3),concate(job,2,2)),’ @mycompany.com’) email from EMP;


### 2 List all employees who joined in September.

mysql> SELECT * from EMP where monthname(hiredate) like 'SEPTEMBER';
+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
+-------+--------+----------+------+------------+---------+---------+--------+
2 rows in set (0.00 sec)


### 3 List the empno, name, and department number of the emp who have experience of 18 or more years and sort them based on their experience.

mysql> SELECT empno,ename,deptno from EMP where year(current_date)-year(hiredate)>=18;
+-------+--------+--------+
| empno | ename  | deptno |
+-------+--------+--------+
|  7369 | SMITH  |     20 |
|  7499 | ALLEN  |     30 |
|  7521 | WARD   |     30 |
|  7566 | JONES  |     20 |
|  7654 | MARTIN |     30 |
|  7698 | BLAKE  |     30 |
|  7782 | CLARK  |     10 |
|  7788 | SCOTT  |     20 |
|  7839 | KING   |     10 |
|  7844 | TURNER |     30 |
|  7876 | ADAMS  |     20 |
|  7900 | JAMES  |     30 |
|  7902 | FORD   |     20 |
|  7934 | MILLER |     10 |
+-------+--------+--------+
14 rows in set (0.03 sec)


### 4 Display the employee details who joined on 3rd of any month or any year

mysql> SELECT * from EMP where dayofmonth(hiredate)=3;
+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7900 | JAMES | CLERK   | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7902 | FORD  | ANALYST | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+
2 rows in set (0.00 sec)


### 5 display all employees who joined between years 1981 to 1983.

mysql> SELECT * from EMP  where year(hiredate) between 1981 and 1983;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
13 rows in set (0.00 sec)

###____________________________________________________________________________________________________________________

### 4/6/d4

### 1 Display the Highest, Lowest, Total & Average salary of all employee. Label the columns Maximum, Minimum, Total and Average respectively for each Department. Also round the result to the nearest whole number.

mysql> select min(SAL)"Minimum",max(SAL)"Maximum",sum(SAL)"TOTAL",avg(SAL)"Average" from EMP;
 
 OR
 
 SELECT sal,max(sal) "maximum",min(sal)"minimum",floor(sum(sal))"total", floor(avg(sal)) "Average" 
FROM emp;
+---------+---------+----------+-------------+
| Minimum | Maximum | TOTAL    | Average     |
+---------+---------+----------+-------------+
|  800.00 | 5000.00 | 29025.00 | 2073.214286 |
+---------+---------+----------+-------------+
1 row in set (0.02 sec)

### 3  Display Department no and number of managers working in that department. Label the column as ?Total Number of Managers? for each department.

mysql> SELECT deptno,count(mgr)"Total no of managers for each dept" FROM EMP  GROUP BY deptno;
+--------+------------------------------------+
| deptno | Total no of managers for each dept |
+--------+------------------------------------+
|     20 |                                  5 |
|     30 |                                  6 |
|     10 |                                  2 |
+--------+------------------------------------+
3 rows in set (0.23 sec)

### 4 Get the Department number, and sum of Salary of all non managers WHERE the sum is greater than 7000.


mysql> SELECT deptno,sum(sal) FROM EMP WHERE job !='MANAGER' GROUP BY deptno HAVING sum(sal)>7000;
+--------+----------+
| deptno | sum(sal) |
+--------+----------+
|     20 |  7900.00 |
+--------+----------+
1 row in set (0.02 sec)


### Q-2 -1 To find all managers with salary >1500

mysql> SELECT * FROM EMP  WHERE  sal >1500 and job='MANAGER';
+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE | MANAGER | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7782 | CLARK | MANAGER | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
+-------+-------+---------+------+------------+---------+------+--------+
3 rows in set (0.02 sec)


### 2 list all employees with salary >=1250 and <= 3000

mysql> SELECT * FROM EMP 
    -> WHERE sal>=1360 and sal<=3000;
+-------+--------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+--------+----------+------+------------+---------+--------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7566 | JONES  | MANAGER  | 7839 | 1981-04-02 | 2975.00 |   NULL |     20 |
|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850.00 |   NULL |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2450.00 |   NULL |     10 |
|  7788 | SCOTT  | ANALYST  | 7566 | 1982-12-09 | 3000.00 |   NULL |     20 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |   0.00 |     30 |
|  7902 | FORD   | ANALYST  | 7566 | 1981-12-03 | 3000.00 |   NULL |     20 |
+-------+--------+----------+------+------------+---------+--------+--------+
7 rows in set (0.00 sec)

### 3 list all employees with salary >1250 and < 3000

mysql> SELECT * FROM EMP
    -> WHERE sal > 1250 and sal < 3000;
+-------+--------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+--------+----------+------+------------+---------+--------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7566 | JONES  | MANAGER  | 7839 | 1981-04-02 | 2975.00 |   NULL |     20 |
|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850.00 |   NULL |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2450.00 |   NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |   0.00 |     30 |
|  7934 | MILLER | CLERK    | 7782 | 1982-01-23 | 1300.00 |   NULL |     10 |
+-------+--------+----------+------+------------+---------+--------+--------+
6 rows in set (0.02 sec)

### 4 list all employees with salary either equal to 3000 or 1250 or 2500

mysql> SELECT * FROM EMP
    -> WHERE sal=3000 or sal=1250 or sal=2500;
+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7788 | SCOTT  | ANALYST  | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7902 | FORD   | ANALYST  | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
+-------+--------+----------+------+------------+---------+---------+--------+
4 rows in set (0.00 sec)

### 5 list all employee with name=SMITH

mysql> SELECT * FROM EMP 
    -> WHERE ename="SMITH";
+-------+-------+-------+------+------------+--------+------+--------+
| EMPNO | ENAME | JOB   | MGR  | HIREDATE   | SAL    | COMM | DEPTNO |
+-------+-------+-------+------+------------+--------+------+--------+
|  7369 | SMITH | CLERK | 7902 | 1980-12-17 | 800.00 | NULL |     20 |
+-------+-------+-------+------+------------+--------+------+--------+
1 row in set (0.09 sec)

### 6 list all employees with name starting with S

mysql> SELECT * FROM EMP 
    -> WHERE ENAME LIKE"S%";
+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7369 | SMITH | CLERK   | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7788 | SCOTT | ANALYST | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+
2 rows in set (0.10 sec)


### 7 list all employees with name ending with S

mysql> SELECT * FROM EMP
    -> WHERE ename LIKE "%s";
+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7876 | ADAMS | CLERK   | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES | CLERK   | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
+-------+-------+---------+------+------------+---------+------+--------+
3 rows in set (0.00 sec)

### 8 list all employees with name contains I at 2nd position

mysql> SELECT * FROM EMP WHERE ename LIKE "_I%";
+-------+--------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-----------+------+------------+---------+------+--------+
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-----------+------+------------+---------+------+--------+
2 rows in set (0.00 sec)

### 9  list all employees with name starts with A ends witn N and someWHERE in between L is there

mysql> SELECT * FROM EMP WHERE ename LIKE "A%L%N";
+-------+-------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+-------+----------+------+------------+---------+--------+--------+
|  7499 | ALLEN | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
+-------+-------+----------+------+------------+---------+--------+--------+
1 row in set (0.00 sec)

### 10 list all employees with name starts with A and B at 3 rd position and P at second last position

mysql> SELECT * FROM EMP  WHERE ename LIKE "A_B%P%";
Empty set (0.01 sec)


### 11 List all employees with name starts with either A or starts with S or starts with W

mysql> SELECT * FROM EMP WHERE ename LIKE "A%" OR ename LIKE "S%" OR ename LIKE "W%";
+-------+-------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+-------+----------+------+------------+---------+--------+--------+
|  7369 | SMITH | CLERK    | 7902 | 1980-12-17 |  800.00 |   NULL |     20 |
|  7499 | ALLEN | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7521 | WARD  | SALESMAN | 7698 | 1981-02-22 | 1250.00 | 500.00 |     30 |
|  7788 | SCOTT | ANALYST  | 7566 | 1982-12-09 | 3000.00 |   NULL |     20 |
|  7876 | ADAMS | CLERK    | 7788 | 1983-01-12 | 1100.00 |   NULL |     20 |
+-------+-------+----------+------+------------+---------+--------+--------+
5 rows in set (0.00 sec)

### 12 find max sal and min sal for each job

mysql> select max(sal),min(sal),job from EMP group by job;
+----------+----------+-----------+
| max(sal) | min(sal) | job       |
+----------+----------+-----------+
|  1300.00 |   800.00 | CLERK     |
|  1600.00 |  1250.00 | SALESMAN  |
|  2975.00 |  2450.00 | MANAGER   |
|  3000.00 |  3000.00 | ANALYST   |
|  5000.00 |  5000.00 | PRESIDENT |
+----------+----------+-----------+
5 rows in set (0.53 sec)

### 13 find how many employess have not received commission

mysql> SELECT * FROM EMP WHERE COMM is NULL;
+-------+--------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-----------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-----------+------+------------+---------+------+--------+
10 rows in set (0.02 sec)

### 14 ind sum of sal of all employees working in dept no 10

mysql> SELECT SUM(sal) FROM EMP WHERE deptno=10;
+----------+
| SUM(sal) |
+----------+
|  8750.00 |
+----------+
1 row in set (0.00 sec)

### 15 find maximum salary,average sal for each job in every department

mysql> select max(sal),avg(sal) from EMP group by DEPTNO;
+----------+-------------+
| max(sal) | avg(sal)    |
+----------+-------------+
|  3000.00 | 2175.000000 |
|  2850.00 | 1566.666667 |
|  5000.00 | 2916.666667 |
+----------+-------------+
3 rows in set (0.57 sec)


### 16

mysql> select max(sal),avg(sal),deptno from EMP group by DEPTNO;
+----------+-------------+--------+
| max(sal) | avg(sal)    | deptno |
+----------+-------------+--------+
|  3000.00 | 2175.000000 |     20 |
|  2850.00 | 1566.666667 |     30 |
|  5000.00 | 2916.666667 |     10 |
+----------+-------------+--------+
3 rows in set (0.00 sec)

### 17 find sum salary for every department if sum is > 3000


mysql> select sum(sal),deptno from EMP group by deptno having sum(sal)>3000;
+----------+--------+
| sum(sal) | deptno |
+----------+--------+
| 10875.00 |     20 |
|  9400.00 |     30 |
|  8750.00 |     10 |
+----------+--------+
3 rows in set (0.03 sec)


### 18 list all department which has minimum 5 employees

mysql>  SELECT count(*) FROM EMP GROUP BY deptno HAVING count(*)<=5;
+----------+
| count(*) |
+----------+
|        5 |
|        3 |
+----------+
2 rows in set (0.00 sec)

### 19 count how many employees earn salary more than 2000 in each job

mysql> SELECT COUNT(*) FROM EMP WHERE sal>2000 GROUP BY job;
+----------+
| COUNT(*) |
+----------+
|        3 |
|        2 |
|        1 |
+----------+
3 rows in set (0.03 sec)

### 20 list all names and jobs so that the length of name should be 15 if it is smaller then add spaces to left.

mysql> SELECT lpad(ename,15,'*'),lpad(job,15,'*')  FROM EMP;
+--------------------+------------------+
| lpad(ename,15,'*') | lpad(job,15,'*') |
+--------------------+------------------+
| **********SMITH    | **********CLERK  |
| **********ALLEN    | *******SALESMAN  |
| ***********WARD    | *******SALESMAN  |
| **********JONES    | ********MANAGER  |
| *********MARTIN    | *******SALESMAN  |
| **********BLAKE    | ********MANAGER  |
| **********CLARK    | ********MANAGER  |
| **********SCOTT    | ********ANALYST  |
| ***********KING    | ******PRESIDENT  |
| *********TURNER    | *******SALESMAN  |
| **********ADAMS    | **********CLERK  |
| **********JAMES    | **********CLERK  |
| ***********FORD    | ********ANALYST  |
| *********MILLER    | **********CLERK  |
+--------------------+------------------+
14 rows in set (0.00 sec)


### 21 display min sal,max sal, average sal for all employees working under same manager

mysql> SELECT mgr,min(sal), max(sal),avg(sal) FROM EMP  GROUP BY mgr;
+------+----------+----------+-------------+
| mgr  | min(sal) | max(sal) | avg(sal)    |
+------+----------+----------+-------------+
| 7902 |   800.00 |   800.00 |  800.000000 |
| 7698 |   950.00 |  1600.00 | 1310.000000 |
| 7839 |  2450.00 |  2975.00 | 2758.333333 |
| 7566 |  3000.00 |  3000.00 | 3000.000000 |
| NULL |  5000.00 |  5000.00 | 5000.000000 |
| 7788 |  1100.00 |  1100.00 | 1100.000000 |
| 7782 |  1300.00 |  1300.00 | 1300.000000 |
+------+----------+----------+-------------+
7 rows in set (0.42 sec)



### 22 find sum of total earnings(sal+comm), average of sal+comm for all employees who earn sal > 2000 and work in either dept no 10 or 20

mysql> SELECT sum(sal+COALESCE(comm,0)),avg(sal+coalesce(comm,0))  FROM EMP WHER
E sal>2000 
+---------------------------+---------------------------+
| sum(sal+COALESCE(comm,0)) | avg(sal+coalesce(comm,0)) |
+---------------------------+---------------------------+
|                  16425.00 |               3285.000000 |
+---------------------------+---------------------------+
1 row in set (0.02 sec)


### 23 list all employees who joined in FEB 1981 and salary is >1500 and < 2500

mysql> SELECT * FROM EMP  WHERE sal between 1501 and 2401 and (year(hiredate)=1981 and month(hiredate)=2);
+-------+-------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+-------+----------+------+------------+---------+--------+--------+
|  7499 | ALLEN | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
+-------+-------+----------+------+------------+---------+--------+--------+
1 row in set (0.01 sec)


### 24  list all employees joined in either aug or may or dec

mysql> SELECT ename,hiredate FROM EMP WHERE month(hiredate) in (5,8,12);
+-------+------------+
| ename | hiredate   |
+-------+------------+
| SMITH | 1980-12-17 |
| BLAKE | 1981-05-01 |
| SCOTT | 1982-12-09 |
| JAMES | 1981-12-03 |
| FORD  | 1981-12-03 |
+-------+------------+
5 rows in set (0.00 sec)


### 25 display name and hiredate in dd/mm/yy format for all employees whose job is clerk and they earn some commission

mysql> SELECT ename , date_format(hiredate,'DD/MM/YY')  FROM EMP  WHERE job='CLERK' and (Comm is not null or comm!=0); 
Empty set (0.00 sec)


mysql> select job, comm from EMP where job like 'clerk';
+-------+------+
| job   | comm |
+-------+------+
| CLERK | NULL |
| CLERK | NULL |
| CLERK | NULL |
| CLERK | NULL |
+-------+------+
4 rows in set (0.00 sec)


### 26 list empcode,empno,name and job for each employee. (note :empcode is 3 to 5 characters FROM name and last 2 characters of job)

mysql>  SELECT substr(ename,3,5) ||substr(job,length(job)-2,length(job))empcode,ename,job
    ->   FROM EMP;
+---------+--------+-----------+
| empcode | ename  | job       |
+---------+--------+-----------+
|       0 | SMITH  | CLERK     |
|       0 | ALLEN  | SALESMAN  |
|       0 | WARD   | SALESMAN  |
|       0 | JONES  | MANAGER   |
|       0 | MARTIN | SALESMAN  |
|       0 | BLAKE  | MANAGER   |
|       0 | CLARK  | MANAGER   |
|       0 | SCOTT  | ANALYST   |
|       0 | KING   | PRESIDENT |
|       0 | TURNER | SALESMAN  |
|       0 | ADAMS  | CLERK     |
|       0 | JAMES  | CLERK     |
|       0 | FORD   | ANALYST   |
|       0 | MILLER | CLERK     |
+---------+--------+-----------+
14 rows in set, 29 warnings (0.24 sec)








###____________________________________________________________________________________________________________________

### 5/6/d5

### 1 Display name and hiredate in dd/mm/yy format for all employees whose job is clerk and they earn some commission.
mysql> SELECT  ename, date_format(hiredate,'dd/mm/yy')  FROM EMP WHERE job='CLERK' and comm is not null;
Empty set (0.00 sec)


### 2 List empcode,empno,name and job for each employee. (note :empcode is 3 to 5 characters FROM name and last 2 characters of job)

mysql> SELECT concat(substr(ename,3,3),substr(job,length(job)-1,2)) ecode,  empno,ename 
    -> FROM EMP;
+-------+-------+--------+
| ecode | empno | ename  |
+-------+-------+--------+
| ITHRK |  7369 | SMITH  |
| LENAN |  7499 | ALLEN  |
| RDAN  |  7521 | WARD   |
| NESER |  7566 | JONES  |
| RTIAN |  7654 | MARTIN |
| AKEER |  7698 | BLAKE  |
| ARKER |  7782 | CLARK  |
| OTTST |  7788 | SCOTT  |
| NGNT  |  7839 | KING   |
| RNEAN |  7844 | TURNER |
| AMSRK |  7876 | ADAMS  |
| MESRK |  7900 | JAMES  |
| RDST  |  7902 | FORD   |
| LLERK |  7934 | MILLER |
+-------+-------+--------+
14 rows in set (0.03 sec)


### 3 display thousand separator and $ symbol for commission if it is null then display it as 0 for all employees whose name starts with A and ends with N


mysql> SELECT empno,comm,CONCAT('$',format(ifnull(comm,0),2)) FROM EMP WHERE ename REGEXP ( '^A.*N$');
+-------+--------+--------------------------------------+
| empno | comm   | CONCAT('$',format(ifnull(comm,0),2)) |
+-------+--------+--------------------------------------+
|  7499 | 300.00 | $300.00                              |
+-------+--------+--------------------------------------+
1 row in set (0.26 sec)


### 4 Display empid,name,sal,comm,remark Remark should base on following conditions comm >= 600 "excellent Keep it up" if it < 600 or not null "good" otherwise "Need improvement"

mysql> SELECT empno,ename,sal,comm,case when comm>=600 then 'excellent Keep it up' when comm>=600 or not NULL then 'good'  else "Need improvement" end "Remark" FROM EMP;
+-------+--------+---------+---------+----------------------+
| empno | ename  | sal     | comm    | Remark               |
+-------+--------+---------+---------+----------------------+
|  7369 | SMITH  |  800.00 |    NULL | Need improvement     |
|  7499 | ALLEN  | 1600.00 |  300.00 | Need improvement     |
|  7521 | WARD   | 1250.00 |  500.00 | Need improvement     |
|  7566 | JONES  | 2975.00 |    NULL | Need improvement     |
|  7654 | MARTIN | 1250.00 | 1400.00 | excellent Keep it up |
|  7698 | BLAKE  | 2850.00 |    NULL | Need improvement     |
|  7782 | CLARK  | 2450.00 |    NULL | Need improvement     |
|  7788 | SCOTT  | 3000.00 |    NULL | Need improvement     |
|  7839 | KING   | 5000.00 |    NULL | Need improvement     |
|  7844 | TURNER | 1500.00 |    0.00 | Need improvement     |
|  7876 | ADAMS  | 1100.00 |    NULL | Need improvement     |
|  7900 | JAMES  |  950.00 |    NULL | Need improvement     |
|  7902 | FORD   | 3000.00 |    NULL | Need improvement     |
|  7934 | MILLER | 1300.00 |    NULL | Need improvement     |
+-------+--------+---------+---------+----------------------+
14 rows in set (0.03 sec)

### 5 Display empid, name, deptno and department name by using following conditions. dept 10 then "Hr" if 20 then "Admin" if 30 then "accounts" otherwise purchase.

mysql> SELECT empno,ename,case deptno when 10 then 'HR'
    -> when 20 then 'Admin' when 30 then 'accounts'
    -> else 'purchase' end "dname"
    -> FROM EMP;
+-------+--------+----------+
| empno | ename  | dname    |
+-------+--------+----------+
|  7369 | SMITH  | Admin    |
|  7499 | ALLEN  | accounts |
|  7521 | WARD   | accounts |
|  7566 | JONES  | Admin    |
|  7654 | MARTIN | accounts |
|  7698 | BLAKE  | accounts |
|  7782 | CLARK  | HR       |
|  7788 | SCOTT  | Admin    |
|  7839 | KING   | HR       |
|  7844 | TURNER | accounts |
|  7876 | ADAMS  | Admin    |
|  7900 | JAMES  | accounts |
|  7902 | FORD   | Admin    |
|  7934 | MILLER | HR       |
+-------+--------+----------+
14 rows in set (0.00 sec)


### 6 list all employees with sal>smith sal

mysql> SELECT * FROM EMP where sal > (SELECT sal FROM EMP WHERE ename='smith');
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+
13 rows in set (0.05 sec)

### 7 list all employees who are working in smiths department

mysql> SELECT * FROM EMP WHERE deptno = (SELECT deptno FROM EMP WHERE ename='SMITH');
+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7369 | SMITH | CLERK   | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7788 | SCOTT | ANALYST | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7876 | ADAMS | CLERK   | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7902 | FORD  | ANALYST | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+
5 rows in set (0.02 sec)

### 8 list all employees with salary > either Smith's salary or alan's sal

mysql> SELECT * FROM EMP WHERE sal in (SELECT sal FROM EMP WHERE ename in ('SMITH','ALLEN'));
+-------+-------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+-------+----------+------+------------+---------+--------+--------+
|  7369 | SMITH | CLERK    | 7902 | 1980-12-17 |  800.00 |   NULL |     20 |
|  7499 | ALLEN | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
+-------+-------+----------+------+------------+---------+--------+--------+
2 rows in set (0.00 sec)

### 9 list all employees who earn more than average sal of dept 10

mysql> SELECT *  FROM EMP WHERE sal > (SELECT avg(sal) FROM EMP WHERE deptno=10);
+-------+-------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+-----------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER   | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7788 | SCOTT | ANALYST   | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
+-------+-------+-----------+------+------------+---------+------+--------+
4 rows in set (0.00 sec)


### 10 list all employees who earn more than average sal of Alan department

mysql> SELECT * FROM EMP WHERE sal >(SELECT avg(sal) FROM EMP WHERE deptno= (SELECT deptno FROM EMP WHERE ename='ALLEN'));
+-------+-------+-----------+------+------------+---------+--------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+-------+-----------+------+------------+---------+--------+--------+
|  7499 | ALLEN | SALESMAN  | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7566 | JONES | MANAGER   | 7839 | 1981-04-02 | 2975.00 |   NULL |     20 |
|  7698 | BLAKE | MANAGER   | 7839 | 1981-05-01 | 2850.00 |   NULL |     30 |
|  7782 | CLARK | MANAGER   | 7839 | 1981-06-09 | 2450.00 |   NULL |     10 |
|  7788 | SCOTT | ANALYST   | 7566 | 1982-12-09 | 3000.00 |   NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000.00 |   NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000.00 |   NULL |     20 |
+-------+-------+-----------+------+------------+---------+--------+--------+
7 rows in set (0.00 sec)


### 11 list all employees who are working in sales department

mysql> show tables;
+--------------------+
| Tables_in_knowitdb |
+--------------------+
| BONUS              |
| DEPT               |
| DUMMY              |
| EMP                |
| SALGRADE           |
+--------------------+
5 rows in set (0.02 sec)

mysql> select * from DEPT;
+--------+------------+----------+
| DEPTNO | DNAME      | LOC      |
+--------+------------+----------+
|     10 | ACCOUNTING | NEW YORK |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+
4 rows in set (0.05 sec)


mysql> SELECT * FROM EMP WHERE deptno =(SELECT deptno FROM DEPT WHERE dname='sales');
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

### 12 list all employees who earn more than average salary of their own department

mysql> SELECT * FROM EMP e WHERE sal > (SELECT avg(sal) FROM EMP d WHERE e.deptno=d.deptno);
+-------+-------+-----------+------+------------+---------+--------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+-------+-----------+------+------------+---------+--------+--------+
|  7499 | ALLEN | SALESMAN  | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7566 | JONES | MANAGER   | 7839 | 1981-04-02 | 2975.00 |   NULL |     20 |
|  7698 | BLAKE | MANAGER   | 7839 | 1981-05-01 | 2850.00 |   NULL |     30 |
|  7788 | SCOTT | ANALYST   | 7566 | 1982-12-09 | 3000.00 |   NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000.00 |   NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000.00 |   NULL |     20 |
+-------+-------+-----------+------+------------+---------+--------+--------+
6 rows in set (0.00 sec)


### 13 list all employees who earn sal < than their managers salary

mysql>  SELECT * FROM EMP e WHERE sal < (SELECT sal FROM EMP m WHERE m.mgr=e.mgr);
ERROR 1242 (21000): Subquery returns more than 1 row


### 14 .list all employees who are earning more than average salary of their job.

mysql> SELECT * FROM EMP e WHERE sal > (SELECT avg(sal) FROM EMP m WHERE m.job=e.job);
+-------+--------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+--------+----------+------+------------+---------+--------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7566 | JONES  | MANAGER  | 7839 | 1981-04-02 | 2975.00 |   NULL |     20 |
|  7698 | BLAKE  | MANAGER  | 7839 | 1981-05-01 | 2850.00 |   NULL |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |   0.00 |     30 |
|  7876 | ADAMS  | CLERK    | 7788 | 1983-01-12 | 1100.00 |   NULL |     20 |
|  7934 | MILLER | CLERK    | 7782 | 1982-01-23 | 1300.00 |   NULL |     10 |
+-------+--------+----------+------+------------+---------+--------+--------+
6 rows in set (0.00 sec)



###____________________________________________________________________________________________________________________

### 7/6/d6


### 1 create table mydept_DAC(deptid number primary key,  dname varchar(20) not null unique, dloc varchar(20)  )

mysql> create table mydept_DBDA(deptid int  primary key, dname varchar(20) unique not NULL, dloc varchar(20));
Query OK, 0 rows affected (3.10 sec)

mysql> insert into mydept_DBDA values(30,'Purchase','Mumbai')
    -> ;
Query OK, 1 row affected (0.41 sec)

mysql> select * from mydept_DBDA;
+--------+----------+--------+
| deptid | dname    | dloc   |
+--------+----------+--------+
|     30 | Purchase | Mumbai |
+--------+----------+--------+
1 row in set (0.02 sec)


mysql> show databases
    -> ;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| knowitdb           |
| myDB               |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
6 rows in set (0.12 sec)



### 2 Create table myemployee with following d
empno number fname ,mname,lname varchar data sal floating number ,date of joining,passportnum varchar data, and dept no which will refer deptno from mydept_DAC tables dept no column.

mysql> create table myempolyee(empno tinyint primary key, fname
varchar(20) not NULL,mname varchar(15), iname varchar(15) not NULL, sal decimal(9,2) check(sal>=1000), doj  TIMESTAMP default CURRENT_TIMESTAMP, passportnum varchar(15) unique, deptid int, constraint fk_deptno foreign key (deptid) references mydept_DBDA(deptid) on delete set NULL on update cascade);
Query OK, 0 rows affected (2.38 sec)



###3 Create following tables Student, Course  And Marks
Student (sid,sname) ---------------- sid ---primary
keyCourse(cid,cname)-------------- cid ---primary key
Marks(studid,courseid,marks) Sample data for marks table studid,courseid,marks
1    1    99
1    3    98
2    1    95
2    2    97


mysql> create table student(sid int primary key, sname varchar(20));
Query OK, 0 rows affected (0.98 sec)


mysql> create table course(cid int primary key, cname varchar(20));
Query OK, 0 rows affected (1.18 sec)



mysql> create table marks (sid int, cid int, marks int, constraint pk primary ke
y (sid,cid), constraint fk_sid foreign key(sid) references student(sid) on delet
e no action  on update cascade, constraint fk_cid foreign key(cid) references course(cid) on delete no action  on update cascade);
Query OK, 0 rows affected (2.84 sec)


insert into marks(1,1,99);
insert into marks(1,3,98);
insert into marks(2,1,95);
insert into marks(2,2,97);
 
### 4. Create empty table emp10 with table structure same as emp table.

create table emp10 as(
select * from emp where 1=2;)


### 5. create following tables and solve following uestions product(pid(PK),pname,price,qty,cid(FK),sid(FK)) salesman (sid(PK),sname,address) category(cid(PK),cnam,descritpion)

create table category(
 cid int primary key,
 cname varchar(20),
 description varchar(20));

create table salesman(
 sid int primary key,
 sname varchar(20),
 address varchar(20));

create table product(
 pid int primary key,
 pname varchar(20) not null,
 qty int ,
 cid int, 
 sid int, 
 constraint fk_cid foreign key(cid) references category(cid) on delete set null on update set null,
constraint fk_sid foreign key(sid) references salesman(sid) on delete set null on update set null );



### 6. create following tables and solve following question faculty(fid,fname,sp.skill1,sp.skill2) courses(cid,cname,rid,fid) room(roomid,rname,rloc) faculty fid fname spskill1 spskill2
10 Seeta  a    b
11 Geetax    z
12 Neeta  a    x
13 Ram    a    b


### 7.  coursescid cname rid fid
121    DBDA 100 10
131    DAC 101
141    DTISS
151    DIOT 105 12


### 8. Room
roomid rname rloc
100    jasmin 1st floor
101    Rose 2nd floor
105    Lotus 1st floor
103    Mogra 1st floor

create table room(
 rid int primary key,
 rname varchar2(20),
 rloc varchar2(20));

create table faculty(
 fid int primary key,
 fname varchar2(20) not null,
 spskill1 varchar2(20),
 spskill1 varchar2(20));

create table course(
cid int primary key,
cname varchar(20) not null,
rid int, 
fid int, 
constraint fk_cid foreign key(cid) references room(rid) on delete cascade on update cascade,
constraint fk_fid foreign key(fid) references faculty(fid) on delete cascade on update cascade );






###____________________________________________________________________________________________________________________

### 8/6/d7

### 1. insert one row in mydept table 
	
	mysql> insert into mydept_DAC values(30,'Purchase','Mumbai');
	
	mysql> select * from mydept_DBDA;
	+--------+----------+--------+
	| deptid | dname    | dloc   |
	+--------+----------+--------+
	|     30 | Purchase | Mumbai |
	+--------+----------+--------+
	1 row in set (0.16 sec)

    
###2. Update employee sal    increase sal of each employee by 15 % sal +comm, change the job to manager and mgr to 7777 for all employees in deptno 10.

	mysql> update emp
	set sal=sal*1.15+ifnull(comm,0),job='MANAGER',mgr=7777
	where deptno =10;
    
###3.change job of smith to senior clerk 

	mysql> update empset job='Senior Clerk' where ename='SMITH';


###4.Increase salary of all employees by 15% if they are earning some commission

	mysql>update emp set sal=1.15*sal where com is not null;
 
 
###5. delete all employees working in alans department
    
	mysql> delete from emp where deptno=(select deptno from emp where ename='ALLEN');
    
###6. change salary of Alan to the salary of Miller.

	mysql> update emp set sal=(select sal from (select * from emp) e where name='MILLER')	where 		ename='ALLEN';
###7. change salary of all emplees who working in Walls department to the salary of Miller.


	mysql> update emp set sal=(select sal from (select * from emp) e where ename='MILLER')
	where deptno=(select deptno   
	from emp
	where ename='WALL');
	

###8. display employee name and department
	mysql> select ename,deptno from emp;
	

###9. display empno,name,department name and grade (use emp,dept and salgrade table)

	mysql> select emapno,ename,dname,grade from emp e inner join dept d on e.deptno=d.deptno inner 			join salgrade s on e.sal between s.losal and s.hisal;
	
###10. list all employees number,name, mgrno and manager name

	mysql> select e.empno,e.ename,m.empno "mgr int",m.ename "mgr name"
		from emp e inner join emp m on e.mgr=m.empno;


###11.Solve following using alter table
add primary key constraint on emp,dept,salgrade
emp ----  empno
dept--- deptno
salgrade--- grade


	mysql> alter table emp
		add constraint pk_empno primary key(empno)

	mysql> alter table dept
		add constraint pk_deptno primary key(deptno)

	mysql> alter table salgrade
		add constraint pk_grade primary key(grade)


###12. add foreign key constarint in emp from dept table column is deptno 

	mysql> ALTER TABLE deptno 
	ADD CONSTRAINT fk_deptno
	FOREIGN KEY(deptno)
	REFERENCES deptno(deptno)

###13. add new column in emp table  netsal with constraint default 1000
	mysql> ALTER TABLE emp
 	ADD netsal decimal(9,2) default 1000
   
   
   
   
###14.list all employees with sal < rajan's sal and salary > revati's sal
	mysql slect * from emp  where sal between (select sal from emp where ename='rajan') and 	(select 
	sal from emp where ename='revati');
	
###15. list all employees who are working in purchase department

	mysql> select * from emp  where deptno =(select deptno  from dept  where dname='purchase');







###____________________________________________________________________________________________________________________

### 9/6/d8

### 1-3 create following tables and solve following questions

    1. faculty(fid,fname,sp.skill1,sp.skill2)
    2. courses(cid,cname,rid,fid)
    3. room(roomid,rname,rloc)


faculty
fid  fname    spskill1 		spskill2
10   Amol	database	JAVA
11   Asha	JAVA		MySQL
12   Kiran	CPP		Database
13   Seeta	MySQL		database

courses 
cid   cname   rid  fid
121    DBDA   100   10 
131    DAC    101   
141    DTISS  
151    DIOT   105   12 

Room 
roomid rname  rloc
100    jasmin  1st floor
101    Rose    2nd floor
105    Lotus   1st floora
103    Mogra   1st floor 




	mysql> create table faculty(fid int primary key,
		-> fname varchar(20),
		-> skill varchar(10),
		-> skill2 varchar(10));
	Query OK, 0 rows affected (6.17 sec)


	mysql> create table courses(cid int primary key, cname varchar(20),
		-> rid int, fid int, 
		-> constraint fk_fid foreign key(fid) references faculty(fid)
		-> on delete no action on update cascade);
	Query OK, 0 rows affected (1.22 sec)


	mysql> create table room(roomid int,
	    -> rname varchar(20),
	    -> rloc varchar(20));
	Query OK, 0 rows affected (1.52 sec)

	mysql> insert into faculty values(10,"AMOL","database","java");
	Query OK, 1 row affected (0.24 sec)

	mysql> insert into faculty values(11,"Asha","java","MySQL");
	Query OK, 1 row affected (0.29 sec)

	mysql> insert into faculty values(12,"Kiran","CPP","Database");
	Query OK, 1 row affected (0.10 sec)

	mysql> insert into faculty values(13,"Seeta","MYSQL","Database");
	Query OK, 1 row affected (0.12 sec)

	mysql> insert into courses(cid,cname,rid) values(131,"DAC",101);
	Query OK, 1 row affected (0.16 sec)

	mysql> insert into courses(cid,cname) values(141,"DTISS");
	Query OK, 1 row affected (0.11 sec)

	mysql> insert into courses values(151,"DIOT",105,12);
	Query OK, 1 row affected (0.12 sec)

	mysql> insert into room values(100,"Jasmin","1st floor");
	Query OK, 1 row affected (0.15 sec)

	mysql> insert into room values(101,"Rose","2nd floor");
	Query OK, 1 row affected (0.14 sec)

	mysql> insert into room values(105,"Lotus","1st floor");
	Query OK, 1 row affected (0.09 sec)

	mysql> insert into room values(103,"Mogra","1st floor");
	Query OK, 1 row affected (0.25 sec)

	mysql> show tables;
	+-------------------+
	| Tables_in_DB9JUNE |
	+-------------------+
	| courses           |
	| faculty           |
	| room              |
	+-------------------+
	3 rows in set (0.00 sec)

	mysql> select * from courses;
	+-----+-------+------+------+
	| cid | cname | rid  | fid  |
	+-----+-------+------+------+
	| 121 | DBDA  |  100 |   10 |
	| 131 | DAC   |  101 | NULL |
	| 141 | DTISS | NULL | NULL |
	| 151 | DIOT  |  105 |   12 |
	+-----+-------+------+------+
	4 rows in set (0.00 sec)

	mysql> select * from faculty;
	+-----+-------+----------+----------+
	| fid | fname | skill    | skill2   |
	+-----+-------+----------+----------+
	|  10 | AMOL  | database | java     |
	|  11 | Asha  | java     | MySQL    |
	|  12 | Kiran | CPP      | Database |
	|  13 | Seeta | MYSQL    | Database |
	+-----+-------+----------+----------+
	4 rows in set (0.00 sec)

	mysql> select * from room;
	+--------+--------+-----------+
	| roomid | rname  | rloc      |
	+--------+--------+-----------+
	|    100 | Jasmin | 1st floor |
	|    101 | Rose   | 2nd floor |
	|    105 | Lotus  | 1st floor |
	|    103 | Mogra  | 1st floor |
	+--------+--------+-----------+
	4 rows in set (0.00 sec)



### 4 list all courses for which no room is assigned and  all rooms  which are available

	select cname,roomid from room r left join courses c on r.roomid=c.rid; 

	mysql> select cname,rid,fid,roomid from courses c inner join room r on c.rid=r.roomid;
	+-------+------+------+--------+
	| cname | rid  | fid  | roomid |
	+-------+------+------+--------+
	| DBDA  |  100 |   10 |    100 |
	| DAC   |  101 | NULL |    101 |
	| DIOT  |  105 |   12 |    105 |
	+-------+------+------+--------+
	3 rows in set (0.02 sec)


### 5 list all faculties who are not allocated to any course and rooms which are not  allocated to any course


	mysql> select f.fid,f.fname,NULL"roomid",NULL"rname"
		from faculty f, room r
		where not exists(select *
		from courses c 
		where c.fid=f.fid)
		union
		select NULL, NULL,r.rname,r.roomid
		from faculty f ,room r
		where not exists (select *
		from courses c
		where c.rid=r.roomid);
		
	+------+-------+--------+-------+
	| fid  | fname | roomid | rname |
	+------+-------+--------+-------+
	|   13 | Seeta | NULL   |  NULL |
	|   11 | Asha  | NULL   |  NULL |
	| NULL | NULL  | Mogra  |   103 |
	+------+-------+--------+-------+
	3 rows in set (0.35 sec)


	mysql> select c.cid, f.fid, f.fname, r.roomid, r.rname  from faculty f left join courses c on 		f.fid= c.fid  right join room r on c.rid = r.roomid;
	+------+-------+--------+--------+
	| fid  | fname | roomid | rname  |
	+------+-------+--------+--------+
	|   10 | AMOL  |    100 | Jasmin |
	| NULL | NULL  |    101 | Rose   |
	|   12 | Kiran |    105 | Lotus  |
	| NULL | NULL  |    103 | Mogra  |
	+------+-------+--------+--------+
	4 rows in set (0.02 sec)


### 6 list all rooms which are allocated or not allocated to any courses

	mysql> select r.roomid, r.rname,c.cname,c.rid from room r left join courses c on
	 r.roomid=c.rid;
	+--------+--------+-------+------+
	| roomid | rname  | cname | rid  |
	+--------+--------+-------+------+
	|    100 | Jasmin | DBDA  |  100 |
	|    101 | Rose   | DAC   |  101 |
	|    105 | Lotus  | DIOT  |  105 |
	|    103 | Mogra  | NULL  | NULL |
	+--------+--------+-------+------+
	4 rows in set (0.00 sec)


### 7 list all rooms which are  not allocated to any courses

	mysql> select roomid,rname  from room r  where not exists( select * from courses
	 c where r.roomid=c.rid);
	+--------+-------+
	| roomid | rname |
	+--------+-------+
	|    103 | Mogra |
	+--------+-------+
	1 row in set (0.12 sec)


### 8 display courses and faculty assigned to those courses whose special skill is database

	mysql> select * from courses c inner join faculty f on c.fid=f.fid where skill='database' or 		skill2='database';
	+-----+-------+------+------+-----+-------+----------+----------+
	| cid | cname | rid  | fid  | fid | fname | skill    | skill2   |
	+-----+-------+------+------+-----+-------+----------+----------+
	| 121 | DBDA  |  100 |   10 |  10 | AMOL  | database | java     |
	| 151 | DIOT  |  105 |   12 |  12 | Kiran | CPP      | Database |
	+-----+-------+------+------+-----+-------+----------+----------+
	2 rows in set (0.04 sec)


	mysql> select c.cname, f.fname, f.skill, f.skill2 from courses c  inner join faculty f on 		c.fid=f.fid;
	+-------+-------+----------+----------+
	| cname | fname | skill    | skill2   |
	+-------+-------+----------+----------+
	| DBDA  | AMOL  | database | java     |
	| DIOT  | Kiran | CPP      | Database |
	+-------+-------+----------+----------+
	2 rows in set (0.08 sec)


### 9 	display time table -it should contain course details , faculty and room details
total 17

	mysql> select cid,cname,rid,rname,f.fid,fname from room r inner join courses c on 		c.rid=r.roomid inner join faculty f on c.fid=f.fid;
		+-----+-------+------+--------+-----+-------+
		| cid | cname | rid  | rname  | fid | fname |
		+-----+-------+------+--------+-----+-------+
		| 121 | DBDA  |  100 | Jasmin |  10 | AMOL  |
		| 151 | DIOT  |  105 | Lotus  |  12 | Kiran |
		+-----+-------+------+--------+-----+-------+
		2 rows in set (0.06 sec)

### 10 create following tables with given constraints
product---- qty >0, price default 20.00,pname not null and unique
And Insert Data like following.

prodid pname  		qty  price     catid  sid
123     lays  		30   30.00      1     12
111     pepsi 	 	40   50.00      4     11
134     nachos	  	50   50.00      1    12
124     dairy milk 	40   60.00      2    14 
124     pringles  	40   60.00      1    14 

saleman ----- sname -----not null
sid    sname    city    
11     Rahul    Pune
12     Kirti    Mumbai
13     Prasad   Nashik
14     Arnav    Amaravati 

category   ----  cname  unique and not null 
cid   cname     description
1     chips        very crunchy
2     chocolate    very chocolaty
3     snacks       yummy
4     cold drinks  thanda thanda cool cool

### 11 List all products with category chips

	mysql> select * 
		from product p inner join category c on p.cid=c.cid
		where cname='chips';

###12 display all products sold by kirti.

	mysql> select * 
	from product p inner join salesman s on p.sid=s.sid
	where sname='kirti';

###13.display all salesman who do not sold any product

	mysql> select sid,sname
		from salesman s
		where not exists (select * from product p
		          where p.sid=s.sid );

###14.display all category for which no product is there
	mysql>select cid,cname
		from category c
		where not exists (select * from product
		          where p.cid=c.cid );
		          
###15.display all products with no category assigned
	mysql> select *
		from product 
		where cid is null;
		
###16.list all salesman who stays in city with name starts with P or N
	mysql> select *
	from salesman 
	where address REGEXP ‘^p|^N’;

###17.Add new column in salesman table by name credit limit
	mysql> alter table salesman
		add creadit_limit decimal(9,2); 



###____________________________________________________________________________________________________________________

### 10/6/d9

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





###____________________________________________________________________________________________________________________

### 11/6/d10

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





###____________________________________________________________________________________________________________________

### 12/6/d11

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






###____________________________________________________________________________________________________________________

### 13/6/d12




###____________________________________________________________________________________________________________________

### 14/6/d13



MANGODB
