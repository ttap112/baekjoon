-- 코드를 입력하세요
SELECT to_number(to_char(START_DATE,'mm')) as MONTH, CAR_ID, count(*) as RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
 WHERE CAR_ID IN (SELECT CAR_ID
                    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                   WHERE TO_CHAR(START_DATE, 'YYYYMM') BETWEEN '202208' AND '202210'
                   GROUP BY CAR_ID
                  HAVING COUNT(CAR_ID) >= 5)
   AND TO_CHAR(START_DATE, 'YYYYMM') BETWEEN '202208' AND '202210'
 GROUP BY to_number(to_char(START_DATE,'mm')), CAR_ID
HAVING COUNT(*) <> 0
 ORDER BY 1, 2 DESC
              
              