
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

mysql> create table myempolyee(empno tinyint primary key, fname
varchar(20) not NULL,mname varchar(15), iname varchar(15) not NULL, sal decimal(9,2) check(sal>=1000), doj  TIMESTAMP default CURRENT_TIMESTAMP, passportnum varchar(15) unique, deptid int, constraint fk_deptno foreign key (deptid) references mydept_DBDA(deptid) on delete set NULL on update cascade);
Query OK, 0 rows affected (2.38 sec)





###4


mysql> create table student(sid int primary key, sname varchar(20));
Query OK, 0 rows affected (0.98 sec)


mysql> create table course(cid int primary key, cname varchar(20));
Query OK, 0 rows affected (1.18 sec)



mysql> create table marks (sid int, cid int, marks int, constraint pk primary ke
y (sid,cid), constraint fk_sid foreign key(sid) references student(sid) on delet
e no action  on update cascade, constraint fk_cid foreign key(cid) references course(cid) on delete no action  on update cascade);
Query OK, 0 rows affected (2.84 sec)




