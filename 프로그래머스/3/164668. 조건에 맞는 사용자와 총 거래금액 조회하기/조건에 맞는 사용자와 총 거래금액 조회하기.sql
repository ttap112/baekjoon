-- 코드를 입력하세요
SELECT USER_ID, NICKNAME,sum(PRICE) as TOTAL_SALES
from USED_GOODS_BOARD a, USED_GOODS_USER b
where a.WRITER_ID = b.USER_ID
and a.status = 'DONE'
having sum(price) >= 700000
group by USER_ID, NICKNAME
order by sum(PRICE) asc