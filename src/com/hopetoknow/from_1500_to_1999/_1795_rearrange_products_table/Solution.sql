--MS SQL Server | MySQL
SELECT
    product_id,
    'store1' AS store,
    store1 AS price
FROM Products
WHERE store1 IS NOT NULL
UNION ALL
SELECT
    product_id,
    'store2',
    store2
FROM Products
WHERE store2 IS NOT NULL
UNION ALL
SELECT
    product_id,
    'store3',
    store3
FROM Products
WHERE store3 IS NOT NULL

--MS SQL Server (second solution)
SELECT
    product_id,
    store,
    price
FROM Products
UNPIVOT
(
	price
	FOR store IN
    (store1, store2, store3)
) AS unpivoted_products
