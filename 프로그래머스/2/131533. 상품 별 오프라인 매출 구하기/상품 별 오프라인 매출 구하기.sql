-- 코드를 입력하세요
SELECT product_code, sum(PRICE*SALES_AMOUNT) as SALES
from PRODUCT a, OFFLINE_SALE b
where a.PRODUCT_ID = b.PRODUCT_ID
group by product_code
order by sales desc, PRODUCT_CODE asc