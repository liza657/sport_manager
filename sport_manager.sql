DROP DATABASE IF EXISTS football_manager;
CREATE DATABASE football_manager  CHAR SET utf8;
USE football_manager;

CREATE TABLE player(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
height int,
age INT,
experience INT
);

CREATE TABLE team(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
budget INT,
commission INT
);
drop table player;
INSERT INTO player(first_name,last_name,height,age,experience)
 VALUES('Sam','Smith',177,34,10),
 ('Dan','Raynolds',178,25,7),
 ('Malkoln','Rymbay',180,27,11),
 ('Ben','Roberts',179,30,5);

INSERT INTO team(name,budget,commission)
VALUES('Lviv',345000000,3),
      ('Rivne',24000000,3),
      ('Ternopil',25000000,2);