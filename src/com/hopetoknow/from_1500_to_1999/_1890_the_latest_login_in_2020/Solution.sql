--MS SQL Server | MySQL
SELECT
    user_id,
    MAX(time_stamp) AS last_stamp
FROM Logins
WHERE time_stamp >= '2020-01-01' AND time_stamp < '2021-01-01'
GROUP BY user_id

--MS SQL Server (second solution) | MySQL (second solution)
SELECT
    user_id,
    MAX(time_stamp) AS last_stamp
FROM Logins
WHERE time_stamp BETWEEN '2020-01-01' AND '2020-12-31 23:59:59'
GROUP BY user_id

--MS SQL Server (third solution) | MySQL (third solution)
SELECT
    user_id,
    MAX(time_stamp) AS last_stamp
FROM Logins
WHERE YEAR(time_stamp) = 2020
GROUP BY user_id
