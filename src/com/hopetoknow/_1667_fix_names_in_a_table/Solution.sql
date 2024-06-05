--MS SQL Server
SELECT
    user_id,
    CONCAT(
        UPPER(LEFT(name, 1)),
        LOWER(SUBSTRING(name, 2, LEN(name)))
    ) AS name
FROM Users
ORDER BY user_id

--MySQL
SELECT
    user_id,
    CONCAT(
        UPPER(LEFT(name, 1)),
        LOWER(SUBSTRING(name, 2))
    ) AS name
FROM Users
ORDER BY user_id


--MySQL (second solution)
SELECT
    user_id,
    CONCAT(
        UPPER(LEFT(name, 1)),
        LOWER(RIGHT(name, LENGTH(name) - 1))
    ) AS name
FROM Users
ORDER BY user_id
