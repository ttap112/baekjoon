-- 코드를 입력하세요
SELECT '/home/grep/src/'||a.BOARD_ID||'/'||FILE_ID||FILE_NAME||FILE_EXT as FILE_PATH
from USED_GOODS_BOARD a, USED_GOODS_FILE b
where a.BOARD_ID = b.BOARD_ID
and views = (select max(VIEWS) from USED_GOODS_BOARD)
order by file_id desc
