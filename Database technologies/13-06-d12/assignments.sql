### 1 
delimiter //
drop procedure if exists minMaxAvg;
create procedure minMaxAvg(in deptno1 int)
begin
select * from EMP;
end //
