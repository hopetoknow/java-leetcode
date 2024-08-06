SELECT
    project_id,
    ROUND(AVG(CAST(experience_years AS DECIMAL)), 2) AS average_years
FROM Project
INNER JOIN Employee ON Project.employee_id = Employee.employee_id
GROUP BY project_id
