SELECT
    contest_id,
    ROUND(COUNT(user_id) * 100 / CAST((SELECT COUNT(user_id) FROM Users) AS FLOAT), 2) AS percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id
