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

