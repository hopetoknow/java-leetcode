--MS SQL Server | MySQL
WITH red_salespersons AS (
    SELECT SalesPerson.sales_id
    FROM SalesPerson
    LEFT JOIN Orders ON SalesPerson.sales_id = Orders.sales_id
    LEFT JOIN Company ON Orders.com_id = Company.com_id
    WHERE Company.name = 'RED'
)

SELECT name
FROM SalesPerson
WHERE NOT EXISTS (
    SELECT 1
    FROM red_salespersons
    WHERE SalesPerson.sales_id = red_salespersons.sales_id
)

--MySQL (second solution)
