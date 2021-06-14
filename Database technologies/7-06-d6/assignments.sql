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





