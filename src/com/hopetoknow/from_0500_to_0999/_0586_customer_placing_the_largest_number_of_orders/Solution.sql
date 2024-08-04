--MS SQL Server
SELECT customer_number
FROM (
    SELECT TOP 1
        customer_number,
        COUNT(customer_number) AS amount
    FROM Orders
    GROUP BY customer_number
    ORDER BY amount DESC
) AS top_customer

--MS SQL Server (second solution) | MySQL
SELECT TOP 1 customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC

--MySQL (second solution)
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1
