# 테이블 Export/Import

/*
 * 1. secure_file_priv 확인
 */
SHOW VARIBALES LIEK 'secure_file_'

/*
 * 2. export
 */
SELECT * FROM song INTO OUTFILE
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n'