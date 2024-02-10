--MS SQL Server
DELETE FROM Person
WHERE id NOT IN (
    SELECT MIN(id)
    FROM Person
    GROUP BY email
)

--MS SQL Server | MySQL
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

--MySQL (second solution)
DELETE FROM Person
WHERE id NOT IN (
    SELECT id
    FROM (
        SELECT MIN(id) AS id
        FROM Person
        GROUP BY email
    ) as unique_ids
)
