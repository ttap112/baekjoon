-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.name
from ANIMAL_INS a, ANIMAL_OUTS b
where a.ANIMAL_ID = b.ANIMAL_ID
and b.datetime < a.datetime
order by a.datetime