--MS SQL Server | MySQL
SELECT *
FROM patients
WHERE
    conditions LIKE 'DIAB1%'
    OR conditions LIKE '% DIAB1%'

--MySQL (second solution)
SELECT *
FROM Patients
WHERE conditions REGEXP '\\bDIAB1'
