--MS SQL Server
SELECT tweet_id
FROM Tweets
WHERE LEN(content) > 15

--MySQL
SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15
