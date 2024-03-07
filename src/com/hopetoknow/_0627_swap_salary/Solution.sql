--MS SQL Server | MySQL
UPDATE Salary
SET sex = (
    CASE sex
        WHEN 'm' THEN 'f'
        ELSE 'm'
    END
)

--MS SQL Server (second solution) | MySQL (second solution)
UPDATE salary
SET sex = CHAR(ASCII('f') + ASCII('m') - ASCII(sex))

--MySQL (third solution)
UPDATE salary
SET sex = IF(sex = 'm','f','m')
