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

--MS SQL Server (second solution)
SELECT *
FROM Patients
WHERE
    PATINDEX('DIAB1%', conditions) > 0
    OR PATINDEX('% DIAB1%', conditions) > 0
