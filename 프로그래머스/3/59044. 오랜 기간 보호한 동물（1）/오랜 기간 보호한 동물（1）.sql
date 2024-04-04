select name, datetime
from
(
SELECT a.NAME, a.DATETIME
from animal_ins a, animal_outs b
where a.ANIMAL_ID = b.ANIMAL_ID(+)
and b.animal_id is null
order by a.datetime)
where rownum <=3; 