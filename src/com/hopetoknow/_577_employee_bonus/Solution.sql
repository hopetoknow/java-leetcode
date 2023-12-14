SELECT
    name,
    bonus
FROM Employee
LEFT JOIN Bonus ON Employee.empId = Bonus.empId
WHERE
    Bonus < 1000
    OR Bonus IS NULL
