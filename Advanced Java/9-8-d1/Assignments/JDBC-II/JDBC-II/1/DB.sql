CREATE DATABASE  IF NOT EXISTS `employee` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `employee`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: employee
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.14-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dept`
--

DROP TABLE IF EXISTS `dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dept` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `dname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dept_id`),
  KEY `Fk_eid` (`eid`),
  CONSTRAINT `Fk_eid` FOREIGN KEY (`eid`) REFERENCES `emp` (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` (`dept_id`, `eid`, `dname`) VALUES (1,1,'Training'),(2,1,'Admin'),(3,2,'HR');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp` (
  `empid` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(45) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` (`empid`, `ename`, `dept_id`, `salary`) VALUES (1,'Sayali',1,40000),(2,'Bakul',1,40000),(3,'Amit',2,30000),(4,'Rahul',2,25000),(5,'Vishakha',3,25000),(6,'Trupti',1,35000),(7,'Snehal',3,35000),(8,'Dhanshree',3,656567);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topic_id` int(11) NOT NULL,
  `text` text NOT NULL,
  `option1` mediumtext NOT NULL,
  `option2` mediumtext NOT NULL,
  `option3` mediumtext NOT NULL,
  `option4` mediumtext NOT NULL,
  `correct_answer` enum('1','2','3','4') NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` (`id`, `topic_id`, `text`, `option1`, `option2`, `option3`, `option4`, `correct_answer`, `created_at`) VALUES (1,1,'eleifend. Cras sed leo.','Suspendisse non leo. Vivamus nibh','mi tempor lorem, eget mollis','nunc, ullamcorper eu, euismod ac,','Mauris magna. Duis dignissim tempor','1','2016-04-17 19:27:45'),(2,2,'Donec elementum, lorem ut aliquam iaculis,','eu, accumsan sed, facilisis vitae,','semper cursus. Integer mollis. Integer','dui augue eu tellus. Phasellus','varius et, euismod et, commodo','4','2016-04-17 19:27:45'),(3,2,'non ante bibendum','mauris. Suspendisse aliquet molestie tellus.','dui. Fusce aliquam, enim nec','vitae, erat. Vivamus nisi. Mauris','a, facilisis non, bibendum sed,','1','2016-04-17 19:27:45'),(4,1,'velit. Quisque varius. Nam porttitor','a mi fringilla mi lacinia','Mauris vestibulum, neque sed dictum','ac mattis ornare, lectus ante','ut, pharetra sed, hendrerit a,','1','2016-04-17 19:27:45'),(5,2,'ac turpis egestas. Aliquam','Vivamus non lorem vitae odio','lectus sit amet luctus vulputate,','urna. Vivamus molestie dapibus ligula.','erat volutpat. Nulla facilisis. Suspendisse','2','2016-04-17 19:27:45'),(6,1,'Cum sociis natoque','dictum augue malesuada malesuada. Integer','sem. Pellentesque ut ipsum ac','lectus convallis est, vitae sodales','Vivamus nisi. Mauris nulla. Integer','3','2016-04-17 19:27:45'),(7,2,'gravida sagittis. Duis gravida. Praesent eu nulla at','tincidunt dui augue eu tellus.','Suspendisse ac metus vitae velit','orci lacus vestibulum lorem, sit','elit erat vitae risus. Duis','3','2016-04-17 19:27:45'),(8,1,'Phasellus elit pede,','libero. Integer in magna. Phasellus','odio. Phasellus at augue id','est tempor bibendum. Donec felis','in faucibus orci luctus et','3','2016-04-17 19:27:45'),(9,2,'nec urna suscipit nonummy. Fusce fermentum fermentum','Sed auctor odio a purus.','turpis egestas. Aliquam fringilla cursus','lorem, vehicula et, rutrum eu,','Mauris ut quam vel sapien','2','2016-04-17 19:27:45'),(10,1,'ligula. Aenean','dapibus id, blandit at, nisi.','elementum, lorem ut aliquam iaculis,','pharetra. Nam ac nulla. In','ipsum dolor sit amet, consectetuer','3','2016-04-17 19:27:45'),(11,2,'at pede. Cras vulputate','Donec tempor, est ac mattis','urna convallis erat, eget tincidunt','hendrerit. Donec porttitor tellus non','Nullam feugiat placerat velit. Quisque','2','2016-04-17 19:27:45'),(12,1,'Proin non massa non','Curabitur egestas nunc sed libero.','id, erat. Etiam vestibulum massa','Proin mi. Aliquam gravida mauris','erat. Sed nunc est, mollis','1','2016-04-17 19:27:45'),(13,2,'nulla at sem','eget magna. Suspendisse tristique neque','ornare. Fusce mollis. Duis sit','dolor, nonummy ac, feugiat non,','sapien, cursus in, hendrerit consectetuer,','4','2016-04-17 19:27:45'),(14,1,'ipsum ac','penatibus et magnis dis parturient','eros nec tellus. Nunc lectus','amet diam eu dolor egestas','euismod est arcu ac orci.','4','2016-04-17 19:27:45'),(15,2,'nec enim. Nunc ut','et tristique pellentesque, tellus sem','habitant morbi tristique senectus et','Vestibulum accumsan neque et nunc.','mauris sagittis placerat. Cras dictum','3','2016-04-17 19:27:45'),(16,1,'Sed pharetra,','dolor. Quisque tincidunt pede ac','nibh. Phasellus nulla. Integer vulputate,','libero lacus, varius et, euismod','diam lorem, auctor quis, tristique','2','2016-04-17 19:27:45'),(17,2,'Phasellus ornare. Fusce mollis. Duis sit amet diam','risus. Morbi metus. Vivamus euismod','mi. Aliquam gravida mauris ut','in sodales elit erat vitae','pede. Nunc sed orci lobortis','4','2016-04-17 19:27:45'),(18,1,'velit. Quisque varius. Nam porttitor scelerisque neque. Nullam nisl.','purus, accumsan interdum libero dui','auctor ullamcorper, nisl arcu iaculis','Cras eu tellus eu augue','massa non ante bibendum ullamcorper.','2','2016-04-17 19:27:45'),(19,2,'nec tempus scelerisque, lorem','egestas ligula. Nullam feugiat placerat','dolor vitae dolor. Donec fringilla.','pede, malesuada vel, venenatis vel,','auctor, velit eget laoreet posuere,','4','2016-04-17 19:27:45'),(20,1,'Integer tincidunt aliquam arcu. Aliquam ultrices iaculis odio.','Nunc lectus pede, ultrices a,','mi enim, condimentum eget, volutpat','congue a, aliquet vel, vulputate','risus. In mi pede, nonummy','4','2016-04-17 19:27:45');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `topic_id` int(11) NOT NULL,
  `no_of_questions` int(11) NOT NULL,
  `no_of_correct_question` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` (`id`, `user_id`, `topic_id`, `no_of_questions`, `no_of_correct_question`, `created_at`) VALUES (1,2,1,10,5,'2016-04-16 23:23:04'),(2,2,1,10,6,'2016-04-17 00:27:12'),(3,2,1,10,6,'2016-04-17 00:27:36');
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `topic`
--

DROP TABLE IF EXISTS `topic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `user_id` int(11) NOT NULL,
  `questions` int(11) NOT NULL,
  `description` mediumtext DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `topic`
--

LOCK TABLES `topic` WRITE;
/*!40000 ALTER TABLE `topic` DISABLE KEYS */;
INSERT INTO `topic` (`id`, `name`, `user_id`, `questions`, `description`, `created_at`) VALUES (1,'Java',1,10,'Java','2016-04-16 23:17:40'),(2,'Python',2,10,'Python','2016-04-17 19:28:44');
/*!40000 ALTER TABLE `topic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `upgrade_request`
--

DROP TABLE IF EXISTS `upgrade_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `upgrade_request` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `upgrade_request`
--

LOCK TABLES `upgrade_request` WRITE;
/*!40000 ALTER TABLE `upgrade_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `upgrade_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `name` varchar(80) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password_hash` varchar(40) NOT NULL,
  `level` int(11) NOT NULL,
  `sex` enum('m','f') NOT NULL,
  `workspace` varchar(30) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `name`, `email`, `password_hash`, `level`, `sex`, `workspace`, `created_at`) VALUES (2,'manthansharma','Manthan Sharma','hitechmanthan@gmail.com','asdfasdfkjajnk23j4kj123n4k12j3',1,'m','LNMIIT','2016-04-16 23:22:11');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'employee'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-07 11:10:25
