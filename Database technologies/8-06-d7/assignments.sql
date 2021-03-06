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




