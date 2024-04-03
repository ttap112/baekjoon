-- 코드를 입력하세요
SELECT i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, round(avg(REVIEW_SCORE),2) as REVIEW_SCORE
from rest_info i, rest_review r
where i.rest_id = r.rest_id
and i.address LIKE '서울%'
group by i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS
order by review_score desc, favorites desc
