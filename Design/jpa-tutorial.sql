-- jpa-tutorial
-- ############

-- CREATE SCHEMA ummu
CREATE DATABASE ummu;
USE ummu;

-- CREATE TABLE
CREATE TABLE ALIEN
(
  AID CHAR(4) NOT NULL,
  ANAME VARCHAR(40) NULL,
  TECH VARCHAR(30)  NULL
);

ALTER TABLE ALIEN ADD PRIMARY KEY (AID);

COMMIT;

INSERT INTO `ummu`.`ALIEN` (`AID`, `ANAME`, `TECH`) VALUES ('1', 'Ummu', 'Java');
INSERT INTO `ummu`.`ALIEN` (`AID`, `ANAME`, `TECH`) VALUES ('2', 'Rina', 'Selenium');
INSERT INTO `ummu`.`ALIEN` (`AID`, `ANAME`, `TECH`) VALUES ('3', 'Insyirah', 'Jasper Report');
INSERT INTO `ummu`.`ALIEN` (`AID`, `ANAME`, `TECH`) VALUES ('4', 'Linda', 'Oracle');
INSERT INTO `ummu`.`ALIEN` (`AID`, `ANAME`, `TECH`) VALUES ('5', 'Victor', 'Android');


-- CREATE SCHEMA usersdb
create database usersdb;
use usersdb;

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(45) NOT NULL,
   `email` varchar(45) NOT NULL, 
  `password` varchar(45) NOT NULL, 
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1