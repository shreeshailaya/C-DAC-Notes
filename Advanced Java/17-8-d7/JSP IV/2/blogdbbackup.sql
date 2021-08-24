-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.10-MariaDB


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema blogdb
--

CREATE DATABASE IF NOT EXISTS blogdb;
USE blogdb;

--
-- Definition of table `blogdb`.`comments`
--

DROP TABLE IF EXISTS `blogdb`.`comments`;
CREATE TABLE  `blogdb`.`comments` (
  `cid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(100) NOT NULL,
  `topicid` int(10) unsigned NOT NULL,
  `uid` varchar(20) NOT NULL,
  PRIMARY KEY (`cid`),
  KEY `FK_comments_1` (`uid`),
  KEY `FK_comments_2` (`topicid`),
  CONSTRAINT `FK_comments_1` FOREIGN KEY (`uid`) REFERENCES `users` (`uid`),
  CONSTRAINT `FK_comments_2` FOREIGN KEY (`topicid`) REFERENCES `topic` (`topicid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blogdb`.`comments`
--

/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
INSERT INTO `blogdb`.`comments` (`cid`,`text`,`topicid`,`uid`) VALUES 
 (1,'platform independent language',1,'Neha'),
 (2,'secure language on internet',1,'Mohan'),
 (3,'Oracle product, freely available',2,'Priya'),
 (4,'used for mid sized application',2,'Rajesh'),
 (5,'latest version is HTML 5',3,'Priya'),
 (6,'MAny new features in HTML 5',3,'Neha');
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;


--
-- Definition of table `blogdb`.`topic`
--

DROP TABLE IF EXISTS `blogdb`.`topic`;
CREATE TABLE  `blogdb`.`topic` (
  `topicid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `desc` varchar(45) NOT NULL,
  `uid` varchar(20) NOT NULL,
  PRIMARY KEY (`topicid`),
  KEY `FK_topic_1` (`uid`),
  CONSTRAINT `FK_topic_1` FOREIGN KEY (`uid`) REFERENCES `users` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blogdb`.`topic`
--

/*!40000 ALTER TABLE `topic` DISABLE KEYS */;
INSERT INTO `blogdb`.`topic` (`topicid`,`name`,`desc`,`uid`) VALUES 
 (1,'Core java','Basics of java language','Mohan'),
 (2,'Mysql','Creating and storing data in database server.','Priya'),
 (3,'Html','Creating web pages.','Rohan'),
 (4,'JavaScript','Creating pages using scripting language.','varsha'),
 (5,'JSP','Creating page using JSP.','Rajesh'),
 (6,'CSS','Manage page design using CSS.','Neha');
/*!40000 ALTER TABLE `topic` ENABLE KEYS */;


--
-- Definition of table `blogdb`.`users`
--

DROP TABLE IF EXISTS `blogdb`.`users`;
CREATE TABLE  `blogdb`.`users` (
  `uid` varchar(20) NOT NULL,
  `password` varchar(45) NOT NULL,
  `fnanme` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contactno` varchar(45) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blogdb`.`users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `blogdb`.`users` (`uid`,`password`,`fnanme`,`lname`,`email`,`contactno`) VALUES 
 ('aliya','aaa','rasmi','pande','aliya@gmail.com','87984645'),
 ('Mohan','mohan@123','Mohan','Joshi','mohan@gmail.com','9287619736'),
 ('Neha','neha@123','Neha','More','neha@yahoo.com','7862091743'),
 ('Priya','priya@123','Priya','Rane','priya@gmail.com','9276549286'),
 ('Rajesh','rajesh@123','Rajesh','Sharma','rajesh@gmail.com','9876543210'),
 ('Rohan','rohan@123','Rohan','Singh','rohan@gmail.com','9174639274'),
 ('Varsha','varsha@123','Varsha','Kulkarni','varsha@gmail.com','9716492739');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
