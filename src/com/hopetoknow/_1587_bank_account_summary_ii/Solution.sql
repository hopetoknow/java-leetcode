--MS SQL Server | MySQL
SELECT
    name,
    SUM(amount) as balance
FROM Users
INNER JOIN Transactions ON Users.account = Transactions.account
GROUP BY Users.account
HAVING SUM(amount) > 10000
