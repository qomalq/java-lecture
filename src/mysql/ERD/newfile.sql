SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS NEW_TABLE;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE NEW_TABLE
(
	id int NOT NULL AUTO_INCREMENT,
	name varchar(10) NOT NULL,
	tel varchar(14) NOT NULL,
	nickname varchar(20) DEFAULT '별명',
	PRIMARY KEY (id)
);


CREATE TABLE user
(
	uid varchar(12) NOT NULL,
	pwd char(44) NOT NULL,
	uname varchar(8) NOT NULL,
	email varchar(30),
	regData date DEFAULT (current_date),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);



