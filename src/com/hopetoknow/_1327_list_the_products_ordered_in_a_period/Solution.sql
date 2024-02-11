--MS SQL Server | MySQL
SELECT
    product_name,
    SUM(unit) AS unit
FROM Products
JOIN Orders ON Products.product_id = Orders.product_id
WHERE order_date LIKE '2020-02-__'
GROUP BY product_name
HAVING SUM(unit) >= 100
