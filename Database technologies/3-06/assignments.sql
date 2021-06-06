

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


