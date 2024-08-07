--MS SQL Server | MySQL
SELECT
    employee_id,
    CASE
        WHEN name NOT LIKE 'M%'AND employee_id % 2 = 1 THEN salary
        ELSE 0
    END AS bonus
FROM Employees
ORDER BY employee_id

--MySQL (second solution)
SELECT
    employee_id,
    IF(
        employee_id % 2 = 0
        OR LEFT(name, 1) = 'M',
        0,
        salary
    ) AS bonus
FROM
    employees
ORDER BY employee_id

--MySQL (third solution)
SELECT
    employee_id,
    salary * (employee_id % 2) * (name NOT LIKE 'M%') AS bonus
FROM employees
ORDER BY employee_id
