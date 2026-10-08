# Write your MySQL query statement below
Select e.name as Employee from Employee e inner join Employee m on m.id=e.managerId where e.salary> m.salary;
