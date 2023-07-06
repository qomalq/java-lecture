SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS girl_group;
DROP TABLE IF EXISTS NEW_TABLE;
DROP TABLE IF EXISTS song;
DROP TABLE IF EXISTS users;




/* Create Tables */

CREATE TABLE girl_group
(
	gid int NOT NULL AUTO_INCREMENT,
	name varchar(32) NOT NULL,
	debut date NOT NULL,
	hit_sond_id int,
	PRIMARY KEY (gid)
);


CREATE TABLE NEW_TABLE
(
	id int NOT NULL AUTO_INCREMENT,
	name varchar(10) NOT NULL,
	tel varchar(14) NOT NULL,
	nickname varchar(20) DEFAULT '별명',
	PRIMARY KEY (id)
);


CREATE TABLE song
(
	sid int NOT NULL,
	title varchar(32),
	lyrics varchar(64),
	PRIMARY KEY (sid)
);


CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	pwd char(44) NOT NULL,
	uname varchar(8) NOT NULL,
	email varchar(30),
	regDate date DEFAULT (current_date),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);



