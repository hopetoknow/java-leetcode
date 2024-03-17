--MS SQL Server | MySQL
SELECT e1.name AS Employee
FROM Employee AS e1
INNER JOIN Employee AS e2 ON e1.managerId = e2.id
WHERE e1.salary > e2.salary

--MS SQL Server (second solution) | MySQL (second solution)
SELECT name AS Employee
FROM Employee AS e
WHERE salary > (
    SELECT salary
    FROM Employee
    WHERE id = e.managerId
)
