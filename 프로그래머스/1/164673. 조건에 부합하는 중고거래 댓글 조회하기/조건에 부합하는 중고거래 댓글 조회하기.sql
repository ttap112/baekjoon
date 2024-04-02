-- 코드를 입력하세요
SELECT b.title, b.BOARD_ID, r.reply_id, r.writer_id
, r.contents, to_char(r.created_date,'YYYY-MM-DD') as created_date
from used_goods_board b, USED_GOODS_REPLY r
where b.BOARD_ID = r.BOARD_ID
and to_char(b.CREATED_DATE,'YYYY-MM') LIKE '2022-10%'
order by r.CREATED_DATE, b.title