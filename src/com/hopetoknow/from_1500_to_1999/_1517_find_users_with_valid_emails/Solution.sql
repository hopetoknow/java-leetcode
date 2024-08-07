--MS SQL Server
SELECT *
FROM Users 
WHERE
    mail LIKE '[a-zA-Z]%@leetcode.com'
    AND mail NOT LIKE '%[^a-zA-Z0-9_.-]%@leetcode.com'

--MS SQL Server (second solution)
SELECT *
FROM Users
WHERE
    mail  LIKE '[a-zA-Z]%@leetcode.com'
    AND LEFT(mail, LEN(mail) - 13) NOT LIKE '%[^0-9a-zA-Z_.-]%'

--MySQL
SELECT *
FROM Users
WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$'
