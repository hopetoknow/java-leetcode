SELECT name
FROM Customer
WHERE referee_id IS NULL
OR referee_id != 2

-- Second solution
SELECT name
FROM Customer
WHERE ISNULL(referee_id, 0) != 2

-- Third solution
SELECT name
FROM Customer
WHERE COALESCE(referee_id, 0) != 2
