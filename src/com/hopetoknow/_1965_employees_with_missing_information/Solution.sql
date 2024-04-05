--MS SQL Server | MySQL
SELECT employee_id
FROM Employees
WHERE employee_id NOT IN (
    SELECT employee_id
    FROM Salaries
)
UNION
SELECT employee_id
FROM Salaries
WHERE employee_id NOT IN (
    SELECT employee_id
    FROM Employees
)
ORDER BY employee_id

--MS SQL Server (second solution) | MySQL (second solution)
SELECT Employees.employee_id
FROM Employees
LEFT JOIN Salaries ON Employees.employee_id = Salaries.employee_id
WHERE salary IS NULL
UNION
SELECT Salaries.employee_id
FROM Salaries
LEFT JOIN Employees ON Salaries.employee_id = Employees.employee_id
WHERE name IS NULL
ORDER BY employee_id
