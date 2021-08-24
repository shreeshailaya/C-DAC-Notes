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
-- Create schema quizdb
--

CREATE DATABASE IF NOT EXISTS quizdb;
USE quizdb;

--
-- Definition of table `quizdb`.`questions`
--

DROP TABLE IF EXISTS `quizdb`.`questions`;
CREATE TABLE  `quizdb`.`questions` (
  `qid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `qtext` varchar(80) NOT NULL,
  `opt1` varchar(80) NOT NULL,
  `opt2` varchar(80) NOT NULL,
  `opt3` varchar(80) NOT NULL,
  `opt4` varchar(80) NOT NULL,
  `answer` char(1) NOT NULL,
  `topicid` int(10) unsigned NOT NULL,
  PRIMARY KEY (`qid`),
  KEY `FK_questions_1` (`topicid`),
  CONSTRAINT `FK_questions_1` FOREIGN KEY (`topicid`) REFERENCES `topics` (`topicid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quizdb`.`questions`
--

/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `quizdb`.`questions` (`qid`,`qtext`,`opt1`,`opt2`,`opt3`,`opt4`,`answer`,`topicid`) VALUES 
 (1,'What is the size of char data type','1 byte','2 byess','4 bytes','1 bit','b',3),
 (2,'Which one of the following is not a valid ide','pre-cdac','_dacpre','16pre-dac',' predac','c',2),
 (3,'How to declare a pointer to a function?','int *(fp)()','int (*fp)()','int * fp()',' None','b',2),
 (4,'Pick out the correct statement about multiple inheritance','Deriving a class from one direct base class','Deriving a class from more than one direct base classes','Deriving a class from more than one direct derived class',' None of the mentioned','b',1),
 (5,'Which is used to define the member of a class externally?','::',':','#','&','a',1),
 (6,'Which of these can be overloaded ?','Only methods','Only constructors','Methods and Constructors','none of above','c',3),
 (7,'Which of these keywords is not a part of exception handling ?','try','catch','finally','finalize','d',3),
 (8,'A[ i ]  is same as',' *( A + i )','*( i + A )','only a','both a and b','d',2),
 (9,'Dafault storage clas for all the variables is','auto','register','static','extern','a',2);
INSERT INTO `quizdb`.`questions` (`qid`,`qtext`,`opt1`,`opt2`,`opt3`,`opt4`,`answer`,`topicid`) VALUES 
 (10,'How many specifiers are available as access specifiers for data member in  class','3','2','1','4','a',1),
 (11,'Which of the following permits function overloading on c++?','type','number of arguments','both','non of above','c',1),
 (12,'Which  is a reserved word in the Java programming language?','native','method','subclass','reference','a',3),
 (13,'Which  of the following may be part of a class definition?','instance variables','instance methods','constructors','all of the above','d',3),
 (14,'	Which one of the following is valid for opening a read-only ASCII file?',' fileOpen (filenm, \"r\");','fileOpen (filenm, \"read\");',' fopen (filenm, \"read\");',' fopen (filenm, \"r\");','d',2),
 (15,'Pick out the other definition of objects.','member of the class','associate of the class','attribute of the class','instance of the class','d',1);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;


--
-- Definition of table `quizdb`.`topics`
--

DROP TABLE IF EXISTS `quizdb`.`topics`;
CREATE TABLE  `quizdb`.`topics` (
  `topicid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`topicid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quizdb`.`topics`
--

/*!40000 ALTER TABLE `topics` DISABLE KEYS */;
INSERT INTO `quizdb`.`topics` (`topicid`,`name`,`description`) VALUES 
 (1,'C++','Object oriented  programming language'),
 (2,'C programming ','All purpose language'),
 (3,'Core java','platform independent language');
/*!40000 ALTER TABLE `topics` ENABLE KEYS */;


--
-- Definition of table `quizdb`.`users`
--

DROP TABLE IF EXISTS `quizdb`.`users`;
CREATE TABLE  `quizdb`.`users` (
  `u_id` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `mname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contact` varchar(45) NOT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quizdb`.`users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `quizdb`.`users` (`u_id`,`password`,`fname`,`mname`,`lname`,`email`,`contact`) VALUES 
 ('Ashwini','ashwini@123','Ashwini','Rajesh','More','ashwini@gmail.com','6510954826'),
 ('Neha','neha@123','Neha','Arun','Kulkarni','neha@yahoo.com','7654321098'),
 ('Ramesh','ramesh@123','Ramesh','Gopal','Sharma','ramesh@gmail.com','9876543210'),
 ('Vaibhav','vaibhav@123','Vaibhav','Lokesh','Arora','vaibhav@yahoo.com','9812376401');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
