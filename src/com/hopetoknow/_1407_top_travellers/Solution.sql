--MS SQL Server | MySQL
SELECT
    name,
    CASE
        WHEN SUM(distance) IS NOT NULL THEN SUM(distance)
        ELSE 0
    END AS travelled_distance
FROM Users
LEFT JOIN Rides ON Users.id = Rides.user_id
GROUP BY
    Users.id,
    name
ORDER BY
    travelled_distance DESC,
    name ASC

--MS SQL Server (second solution) | MySQL (second solution)
SELECT
    name,
    COALESCE(SUM(distance), 0) AS travelled_distance
FROM Users
LEFT JOIN Rides ON Users.id = Rides.user_id
GROUP BY
    Users.id,
    name
ORDER BY
    travelled_distance DESC,
    name
