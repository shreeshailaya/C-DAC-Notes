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



### 5



### 6
select c.cust_id,v.vname from cust_vehicle c  inner join Vehicle v on c.vid=v.vid where v.vid=3;
+---------+------------+
| cust_id | vname      |
+---------+------------+
|       2 | Motor Bike |
|       3 | Motor Bike |
+---------+------------+
2 rows in set (0.01 sec)




