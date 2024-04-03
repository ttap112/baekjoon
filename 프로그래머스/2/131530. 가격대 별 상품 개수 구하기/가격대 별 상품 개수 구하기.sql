-- 코드를 입력하세요
SELECT trunc(price,-4), count(product_id) as PRODUCTS
from PRODUCT
group by trunc(price,-4)
order by trunc(price,-4)