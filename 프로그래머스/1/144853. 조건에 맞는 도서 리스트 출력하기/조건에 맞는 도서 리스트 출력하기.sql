-- 코드를 입력하세요
SELECT book_id, to_char(published_date,'yyyy-mm-dd') as published_date
from book
where to_char(published_date,'yyyy') LIKE '2021%'
and category = '인문'
order by published_date
