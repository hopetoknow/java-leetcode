--MS SQL Server
SELECT
    sell_date,
    COUNT(sell_date) AS num_sold,
    STRING_AGG(product, ',') WITHIN GROUP (ORDER BY product) AS products
FROM (
    SELECT
        DISTINCT sell_date,
        product
    FROM Activities
) AS distinct_products
GROUP BY sell_date

--MYSQL
SELECT
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(DISTINCT product) AS products
FROM Activities
GROUP BY sell_date
