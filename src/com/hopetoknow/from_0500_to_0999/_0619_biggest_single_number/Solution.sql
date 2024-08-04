--MS SQL Server | MySQL
SELECT MAX(num) AS num
FROM
    (
        SELECT num
        FROM MyNumbers
        GROUP BY num
        HAVING COUNT(num) = 1
    ) AS single_numbers

--MS SQL Server (second solution)
SELECT COALESCE(
    (
        SELECT TOP 1 num
        FROM MyNumbers
        GROUP BY num
        HAVING COUNT(num) = 1
        ORDER BY num DESC
    ),
    NULL
) AS num

--MySQL (second solution)
SELECT
    CASE
        WHEN COUNT(num) = 1 THEN num
        ELSE NULL
    END AS num
FROM MyNumbers
GROUP BY num
ORDER BY num DESC
LIMIT 1
