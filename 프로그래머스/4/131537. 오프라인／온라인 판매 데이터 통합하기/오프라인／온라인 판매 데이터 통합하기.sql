select to_char(a.SALES_DATE,'yyyy-mm-dd') as SALES_DATE, 
a.PRODUCT_ID, a.USER_ID, a.SALES_AMOUNT
from ONLINE_SALE a
where to_char(a.sales_date,'yyyy-mm') = '2022-03'

union

select to_char(b.SALES_DATE,'yyyy-mm-dd') as SALES_DATE, 
b.PRODUCT_ID, null as USER_ID, b.SALES_AMOUNT
from OFFLINE_SALE b
where to_char(b.sales_date,'yyyy-mm') = '2022-03'
order by sales_date, product_id, user_id