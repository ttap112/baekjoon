-- 코드를 입력하세요
SELECT NAME, count(NAME) as count
from ANIMAL_INS
where name is not null
group by name
having count(name) >=2
order by name