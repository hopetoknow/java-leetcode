SELECT MAX(num) AS num
FROM
    (
        SELECT num
        FROM MyNumbers
        GROUP BY num
        HAVING COUNT(num) = 1
    ) AS single_numbers

-- Second solution
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
