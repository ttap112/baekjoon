-- 코드를 입력하세요
SELECT to_number(to_char(DATETIME,'hh24')) as HOUR, count(*) as COUNT
from ANIMAL_OUTS
where to_char(DATETIME,'hh24:mi') between '09:00' and '19:59'
group by to_char(DATETIME,'hh24')
order by hour