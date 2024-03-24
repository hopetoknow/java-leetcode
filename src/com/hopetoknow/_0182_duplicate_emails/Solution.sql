--MS SQL Server | MySQL
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1

--MS SQL Server (second solution) | MySQL (second solution)
SELECT DISTINCT p1.email
FROM Person p1
INNER JOIN Person p2 ON
    p1.email = p2.email
    AND p1.id != p2.id
