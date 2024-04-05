-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.ANIMAL_TYPE, a.NAME
from ANIMAL_INS a, ANIMAL_OUTS b
where a.ANIMAL_ID = b.ANIMAL_ID
and  SEX_UPON_INTAKE LIKE 'Intact%' and SEX_UPON_OUTCOME not LIKE 'Intact%'

order by a.ANIMAL_ID