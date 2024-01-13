DELETE FROM Person
WHERE id NOT IN (
    SELECT MIN(id)
    FROM Person
    GROUP BY email
)

-- Second solution
DELETE FROM Person
WHERE id NOT IN (
    SELECT id
    FROM (
        SELECT
            id,
            ROW_NUMBER() OVER (PARTITION BY email ORDER BY id) AS row_number
        FROM Person
    ) AS email_row_numbers
    WHERE row_number = 1
)
