# Write your MySQL query statement below
select 
    d.name as Department , 
    e.name as Employee , 
    e.salary as Salary
from (
    select
        name,
        salary,
        departmentId,
        DENSE_RANK() over(
            partition by departmentId
            order by salary desc
        ) as salary_rank
        from Employee
)e
Join Department as d
    on e.departmentId = d.id
where e.salary_rank <= 3;