--MS SQL Server
SELECT w1.id
FROM Weather w1
INNER JOIN Weather w2 ON DATEDIFF(day, w2.recordDate, w1.recordDate) = 1
    AND w1.temperature > w2.temperature

--MySQL
SELECT w1.id
FROM Weather AS w1
INNER JOIN Weather AS w2 ON DATEDIFF(w1.recordDate, w2.recordDate)  = 1
    AND w1.temperature > w2.temperature

--MySQL (second solution)
SELECT w1.id
FROM Weather w1
INNER JOIN Weather w2 ON SUBDATE(w1.recordDate, 1) = w2.recordDate
    AND w1.temperature > w2.temperature
