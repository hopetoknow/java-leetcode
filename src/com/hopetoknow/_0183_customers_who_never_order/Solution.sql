--MS SQL Server | MySQL
SELECT name AS customers
FROM Customers
LEFT JOIN Orders ON Customers.id = Orders.customerId
WHERE customerId IS NULL

--MS SQL Server (second solution) | MySQL (second solution)
SELECT name AS customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
)

--MySQL (third solution)
SELECT name AS customers
FROM Customers
WHERE NOT EXISTS (
    SELECT 1
    FROM Orders
    WHERE customerId = Customers.id
)