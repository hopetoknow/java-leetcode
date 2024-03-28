--MS SQL Server | MySQL
SELECT name AS customers
FROM Customers
LEFT JOIN Orders ON Customers.id = Orders.customerId
WHERE customerId IS NULL
