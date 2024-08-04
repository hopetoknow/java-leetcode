--MS SQL Server | MySQL
SELECT
    firstName,
    lastName,
    city,
    state
FROM Person
LEFT JOIN Address ON Person.personId = Address.personId

--MySQL (second solution)
SELECT
    firstName,
    lastName,
    city,
    state
FROM Person
NATURAL LEFT JOIN Address
