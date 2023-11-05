SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) BETWEEN 9 AND 19
GROUP BY HOUR
ORDER BY HOUR ASC;

# 쿼리 작성과정
# SELECT * FROM ANIMAL_OUTS;
# ---
# SELECT *, HOUR(DATETIME) AS HOUR FROM ANIMAL_OUTS;
# ---
# SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT FROM ANIMAL_OUTS GROUP BY HOUR(DATETIME);
# ---
# SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT FROM ANIMAL_OUTS 
# GROUP BY HOUR(DATETIME) ORDER BY HOUR(DATETIME) ASC;
# ---
# SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT 
# FROM ANIMAL_OUTS 
# WHERE HOUR(DATETIME) BETWEEN 9 AND 19
# GROUP BY HOUR(DATETIME) 
# ORDER BY HOUR(DATETIME) ASC;