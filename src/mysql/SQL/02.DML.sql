# 데이터 조작
/*
* 2.update
* UPDATE 테이블명
		SET 필드명=값[, 필드명=값, 필드명=값,...]
		WEHRE 조건;
 */
UPDATE city SET `Name` = '수원', population=1200000
WHERE ID = 2340;
SELECT * FROM city WHERE district = 'Kyonggi';

# 3. insert
/*
* INSERT INTO 테이블명 [(필드명)]
*		VALUES (필드값)[, (필드값)]
*/
INSERT INTO city(`Name`,countrycode,district, population) 
	VALUES ('속초','KOR','Kang-won',100000);
SELECT *FROM city WHERE district = 'Kang-won';

INSERT INTO city
	VALUES (DEFAULT, '속초','KOR','Kang-won',100000);
SELECT *FROM city WHERE district = 'Kang-won';

INSERT INTO city		// auto increment 속성에 임의의값을 줄수 있다.
	VALUES (5000, '속초','KOR','Kang-won',100000);
SELECT *FROM city WHERE district = 'Kang-won';

# 여러건의 데이터 입력
# 경기도에 화성시와 의정부시 추가
INSERT INTO city
	VALUES 
	(DEFAULT, '화성', 'KOR', 'Kyonggi','500000'),
	(DEFAULT, '의정부', 'KOR', 'Kyonggi','500000');
SELECT *FROM city WHERE district = 'Kyonggi';.

# 대량 데이터 삽입
# 국내 도시로만 이루어진 새로운 테이블을 생성
CREATE TABLE if NOT EXISTS koreanCity LIKE city;
INSERT INTO koreanCity
	SELECT *FROM city WHERE countrycode='KOR';
	
/*
* 4. DELETE
*  DELETE FROM table 조건;
*/
DELETE FROM city WHERE id =4080; 
DELETE FROM city WHERE id >=4080 AND id <=5000;
DELETE FROM city WHERE id BETWEEN 4080 AND 500
	