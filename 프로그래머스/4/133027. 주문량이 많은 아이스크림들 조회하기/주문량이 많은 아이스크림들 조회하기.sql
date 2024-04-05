select flavor
from 
(select a.flavor, sum(a.total_order+b.total_order) as total          
from first_half a, july b
where a.flavor = b.flavor
group by a.flavor
order by total desc) a
where rownum <= 3