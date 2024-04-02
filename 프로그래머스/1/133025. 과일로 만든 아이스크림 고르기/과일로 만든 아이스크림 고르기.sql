-- 코드를 입력하세요
SELECT f.FLAVOR
from first_half f, icecream_info i
where f.flavor = i.flavor
and total_order >= 3000
and INGREDIENT_TYPE = 'fruit_based'