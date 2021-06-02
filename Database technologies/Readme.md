# 1/6
## Introduction
### Databases
- Oracle ---> Oracal ---> java
- mysql ---> JAVA
- prostgresSQL 
- SQL Server ---> Microsoft ---> .NET

### NoSQL
- MangoDB
- Caasandra
- Couchbase

### GraphDB
- Neo4j

### MemoryDB(which is present in local memory)
- MemDB
- VoltDB

### SQL(Structurd Query Language) and PLSQL
- SQL is 4GL -  what to do it , undefined language
- It run on queries
- SQL  is unified language
| SQL | NOSQL |
| ---  | --- |
| Structured | Unstructured |
| Table | Collection |
| Secure-finaciala app | Less secure-socialMedia |
| Transation Control | No Transaction Control |

# MySQL
- Every row should be unique in SQL
- So thats why we assign some id
- This ID is called primary key

| ID | Name | Deg |
| ---  | --- | --- |
| 111 | Shree | Manager |
| 222 | Shree | Manager |
| 333 | Revati | Ux Designer |
| 444 | Rajan | Game Designer |

- PrimaryKey is the minimal subset of the coloums that identifies the row uniquely.
- SuperKey is any combination of coloum which is uniquely identify the row eg. 111Shree,111ShreeManager

| Room No | Name  | Location | Size |
| ---  | --- | --- | --- |
| 1 | Lotus | 3rd floor | 14*14 |
| 2 | Jasmin | 1st floor | 12*12 |
| 3 | Jasmin | 3rd floor | 12*12 |

- The other data will change or will same as others row thats why we use unique key.
- Composite key is the if the primary key contain any combination more than one coloum is called composite key.

| Student ID | Course ID  | Marks | Module |
| ---  | --- | --- | --- |
| 121 | 1 | 99 | JAVA |
| 121 | 1 | 99 | DBMS |

- PrimaryKey is studentid+module
- SuperKey studentid+module, studentid+module+courseid
- The smallest super key is primary key
- Candidate Key is any minimal subset whichmay become  primary key

### 


| Empolyee ID | Ename  | - | DeptNo |
| ---  | --- | --- | --- |
| 111 | Shree |   | 10 |
| 222 | Shree |  | 20 |
| 333 | Revati |  | 10 |
| 444 | Rajan |  | 30 |


- Empolyee ID is a primary number is here 

| Dept No | Dname  | Address |
| ---  | --- | --- |
| 10 | HR | Pune |
| 20 | Sals | Mumbai |
| 30 | Purches | Channai |

- Foreign key is the if the data of any coloum is calidated with primary key of other table or same table then it is called primary key
- The rule that make foreign key is referential integrity