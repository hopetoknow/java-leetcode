--MS SQL Server | MySQL
SELECT
    employee_id,
    department_id
FROM Employee
WHERE employee_id IN (
    SELECT employee_id
    FROM Employee
    GROUP BY employee_id
    HAVING COUNT(employee_id) = 1
)
UNION
SELECT
    employee_id,
    department_id
FROM Employee
WHERE primary_flag = 'Y'

--MS SQL Server (second solution) | MySQL (second solution)
SELECT
    employee_id,
    department_id
FROM Employee
WHERE
    employee_id IN (
        SELECT employee_id
        FROM Employee
        GROUP BY employee_id
        HAVING COUNT(employee_id) = 1
    )
    OR primary_flag = 'Y'
