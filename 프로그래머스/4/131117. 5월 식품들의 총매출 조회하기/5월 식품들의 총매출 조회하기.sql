-- 코드를 입력하세요
SELECT a.PRODUCT_ID, PRODUCT_NAMe, sum(PRICE*AMOUNT) as TOTAL_SALES
from FOOD_PRODUCT a, FOOD_ORDER b
where a.PRODUCT_ID = b.PRODUCT_ID
and to_char(PRODUCE_DATE,'yyyy-mm') = '2022-05'
group by a.PRODUCT_ID, PRODUCT_name
order by TOTAL_SALES desc, PRODUCT_ID asc