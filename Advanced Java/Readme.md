# Advanced Java

## 9/8

#### JDBC

#### Role of JDBC Driver

#### JDBC Driver-jar file

#### Generation of JDBC Drivers

#### Steps for connecting JDBC

* loading driver
* establishing connection
* creating statement or prepered statement

#### Statement

#### Prepered Statement

#### Stored Procedure

#### Callable Statement

## 10/8

#### Callable Statement

* Stored procedure is stored in db as db object
* It is used for frequently needed task
* Block of PL/SQL
* Callable Statement used to call stored procedure
* Supply required parameter and excute
* There are three parameter of strored procedure
  * in
  * out
  * inOut
* It seperate out java and sql

```sql
CREATE PROCEDURE `getSalary` (in empno int, out sal float)
BEGIN
	select salary into sal from emp where empid=empno;
END $$
delimiter;


```

```java


```

#### Scrollable and updatable result set

### Servlet

* It is a java class
* Used for generating dynamic html
* Host the servlet in the in the enviroment of web service
* Web server is accept the request and send the request
* Servelet is present in web server
* Generating dynamic html cannont be done by web server
