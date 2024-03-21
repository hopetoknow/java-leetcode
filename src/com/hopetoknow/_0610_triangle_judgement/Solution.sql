--MS SQL Server | MySQL
SELECT
    *,
    CASE
        WHEN x + y > z AND y + z > x AND x + z > y THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle

--MySQL (second solution)
SELECT
    *,
    IF(x + y > z AND y + z > x AND x + z > y, 'Yes', 'No') AS triangle
FROM Triangle
