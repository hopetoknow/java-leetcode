SELECT
    name,
    SUM(amount) as balance
FROM Users
INNER JOIN Transactions ON Users.account = Transactions.account
GROUP BY name
HAVING SUM(amount) > 10000
