# 2009년도에 데뷔한 걸그룹 정보를 조회
SELECT * FROM girl_group
WHERE debut BETWEEN '2009-01-01' and '2009-12-31';

# 2009년도에 데뷔한 걸그룹의 히트송은?
SELECT l.name, l.debut, r.title  FROM girl_group l
JOIN song AS r
ON r.sid = l.hit_song_id
WHERE debut BETWEEN '2009-01-01' and '2009-12-31';

#대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?
SELECT continent, COUNT(*) noc, ROUND (SUM(gnp)) sumGnp, ROUND(AVG(gnp)) avgGnp FROM country
GROUP BY continent;

#아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
SELECT l.Continent '대륙명', l.Name '국가명', r.District '도시명', r.Population '인구수' FROM country AS l
	JOIN city r
	ON l.Code = r.CountryCode
	WHERE l.Continent = 'asia'
	ORDER BY r.population desc
	LIMIT 10;

#아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
SELECT l.District '도시명', l.Population '인구수', r.`Language` '언어' FROM city  AS l  
	JOIN countrylanguage r
	ON l.CountryCode = r.CountryCode
	WHERE r.IsOfficial = 'T'
	ORDER BY l.population DESC
	LIMIT 10
	;