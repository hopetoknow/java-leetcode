--MS SQL Server | MySQL
SELECT
    product_name,
    SUM(unit) AS unit
FROM Products
JOIN Orders ON Products.product_id = Orders.product_id
WHERE order_date LIKE '2020-02-__'
GROUP BY product_name
HAVING SUM(unit) >= 100

--MS SQL Server (second solution) | MySQL (second solution)
SELECT
    product_name,
    SUM(unit) AS unit
FROM Products
JOIN Orders ON Products.product_id = Orders.product_id
WHERE YEAR(order_date) = '2020' AND MONTH(order_date) = '02'
GROUP BY product_name
HAVING SUM(unit) >= 100
