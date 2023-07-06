# 날짜 시간 조작

/*
* 1. 테이블 생성
*/

CREATE TABLE if NOT EXISTS dateTable (
	id INT PRIMARY KEY AUTO_INCREMENT, 
	`date` DATE DEFAULT (CURRENT_DATE), 
	`datetime` DATETIME DEFAULT (CURRENT_TIMESTAMP)
);

/*
* 2. 데이터 입력
*/
INSERT INTO datetable VALUES(DEFAULT, DEFAULT,DEFAULT);
INSERT INTO datetable(id) VALUES(DEFAULT);

INSERT INTO datetable(`date`,`datetime`) VALUES
('2023-03-03', '2023-03-08 11:25:00'),
('2023-12-24', '2023-12-24 20:00:00');

/*
* 3. 데이터 조회
*/
# 2023-07-04
SELECT `date`, DATE_FORMAT(`datetime`, '%Y-%m-%d') FROM datetable;

# 11:25:00 AM
SELECT DATE_FORMAT(`datetime`, '%h-%i-%s %p') FROM datetable;
SELECT DATE_FORMAT(`datetime`, '%r') FROM datetable;

#23-07-04 11:25
SELECT DATE_FORMAT(`datetime`, '%y-%m-%d %H:%i') AS modTime
FROM datetable;

#날짜 조회 함수
SELECT NOW(), CURDATE(), CURTIME();

#날짜 더하기/빼기
SELECT DATE_ADD(NOW(),INTERVAL 40 DAY);   #오늘부터 40일을 더한값
SELECT DATE_sub(NOW(),INTERVAL 3 MONTH);	# 오늘부터 3달 마이너스

# D-day 계산
SELECT TO_DAYS('2023-12-25') - TO_DAYS(NOW()) AS Dday;

# 요일: 1-일요일
SELECT DAYOFWEEK(`datetime`) FROM datetable; 





