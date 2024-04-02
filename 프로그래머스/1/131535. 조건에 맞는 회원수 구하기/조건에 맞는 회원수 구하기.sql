-- 코드를 입력하세요
SELECT count(age)
from user_info
where to_char(joined,'yyyy') LIKE '2021%' 
and age >= 20 and age <=29