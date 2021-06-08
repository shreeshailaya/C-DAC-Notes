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


