# 테이블 조인


/*
 * 1. 테이블 생성
 */


# song table
CREATE TABLE if NOT EXISTS song(
	sid int NOT NULL,
	title varchar(32),
	lyrics varchar(64),
	PRIMARY KEY (sid)
) AUTO_INCREMENT =101;

# girl group table
CREATE TABLE if NOT EXISTS girl_group(
	gid int NOT NULL,
	name varchar(32) NOT NULL,
	debut DATE NOT NULL,
	hit_sond_id int,
	PRIMARY KEY (gid)
)AUTO_INCREMENT 1001;
/*
 *  2. 데이터 입력
 */

# inner join
SELECT r.name, r.debut, l.title, l.lyrics FROM song AS l
	INNER JOIN girl_group AS r
	ON l.sid = r.hit_sond_id;

# left join - song table에 있고 gir_group table에 없는 내용도 선택됨
SELECT r.name, r.debut, l.title, l.lyrics FROM song AS l
	LEFT JOIN girl_group AS r
	ON l.sid = r.hit_sond_id;

# right join
SELECT r.name, r.debut, l.title, l.lyrics FROM song AS l
	RIGHT JOIN girl_group AS r
	ON l.sid = r.hit_sond_id;	# OUTER 생략가능

# Full outer join - MySQL에서는 제공하지 않음
# left join 과 right join 결과를 uion
SELECT r.name, r.debut, l.title, l.lyrics FROM song AS l
	LEFT JOIN girl_group AS r
	ON l.sid = r.hit_sond_id;
UNION
SELECT r.name, r.debut, l.title, l.lyrics FROM song AS l
	RIGHT JOIN girl_group AS r
	ON l.sid = r.hit_sond_id;
	
/*
 * 4. 연습문제
 */
# 2007년도에 대뷔한 걸그룹은?
SELECT * FROM girl_group 
WHERE debut BETWEEN'2007-01-01' AND '2007-12-31';

# 
SELECT r.name, r.debut, l.title FROM song AS l
	JOIN girl_group AS r
	ON l.sid = r.hit_song_id
	WHERE r.debut BETWEEN '2009-01-01'AND '2009-12-31';
	

