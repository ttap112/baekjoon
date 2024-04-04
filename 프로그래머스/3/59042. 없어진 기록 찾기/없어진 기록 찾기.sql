-- 코드를 입력하세요
SELECT b.ANIMAL_ID, b.NAME
from ANIMAL_INS a, ANIMAL_OUTS b
where a.animal_id(+) = b.animal_id
and a.animal_id is null
order by b.animal_id