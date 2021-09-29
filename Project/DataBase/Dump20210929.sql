-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: clinicdatabase
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `user_id` int NOT NULL,
  `role_id` int DEFAULT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `contact_no` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `FKra7xoi9wtlcq07tmoxxe5jrh4` FOREIGN KEY (`user_id`) REFERENCES `users` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,3,'Sumeet','Hatkar','7038809668','Nanded','male','2019-08-02'),(2,2,'Trupti','Yadav','9604633443','Islampur','female','2020-05-08'),(3,3,'Shree','Vitkar','8483036123','Pune','male','2020-08-08'),(4,3,'Monika','Shivankar','987654321','Pune','female','2020-09-05'),(5,2,'Chandan','Yadav','8275276923','Delhi','male','2020-08-06'),(7,3,'Pooja','Gudal','7350675594','Pune','female','2021-09-02'),(8,1,'Admin','Admin','111111111','Pune','male','2021-09-22'),(9,2,'Sonia','Hatkar','8668523897','Mumbai','female','2021-08-19'),(10,2,'Aarti','Gudal','7558361692','Purna','female','1978-06-21'),(11,2,'Hardik','Patil','11111111','Nanded','male','2021-09-17'),(12,2,'Akshay','Morale','22222222','Nanded','male','2021-09-12');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_1`
--

DROP TABLE IF EXISTS `account_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account_1` (
  `account_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `role_id` int DEFAULT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `contact_no` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `u_id` int DEFAULT NULL,
  PRIMARY KEY (`account_id`),
  KEY `u_id_idx` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_1`
--

LOCK TABLES `account_1` WRITE;
/*!40000 ALTER TABLE `account_1` DISABLE KEYS */;
INSERT INTO `account_1` VALUES (101,1,2,'Sumeet','hatkar','7038809668','Nanded','Male','1996-03-07',NULL),(102,2,2,'Shreeshail','Vitkar','8668523897','Pune','Male','1998-08-08',NULL),(103,3,3,'Trupti','Yadav','9604633443','Islampur','Female','1994-08-27',NULL),(104,4,3,'Pooja','Gudal','7350675594','Purna','Female','1997-09-17',NULL),(105,5,2,'SH','Hatkar','7038809666','Nanded','Male','1996-03-06',NULL),(106,6,3,'xyz','aaa','11111','abcs','M','2021-09-22',NULL),(108,7,3,'xyz','aaa','11111','abcs','M','2021-09-22',NULL);
/*!40000 ALTER TABLE `account_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appointments`
--

DROP TABLE IF EXISTS `appointments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointments` (
  `app_id` int NOT NULL,
  `u_id` int DEFAULT NULL,
  `dr_id` int DEFAULT NULL,
  `app_date` date DEFAULT NULL,
  `app_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`app_id`),
  KEY `dr_id` (`dr_id`),
  KEY `FKpsj4o10mj103nddd3cceo1fun` (`u_id`),
  CONSTRAINT `FKpsj4o10mj103nddd3cceo1fun` FOREIGN KEY (`u_id`) REFERENCES `account` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointments`
--

LOCK TABLES `appointments` WRITE;
/*!40000 ALTER TABLE `appointments` DISABLE KEYS */;
INSERT INTO `appointments` VALUES (1,1,2,'2021-09-03','10:30 am'),(2,3,5,'2021-09-03','11:00 am'),(3,4,9,'2021-09-04','11:30 am'),(4,7,10,'2021-09-04','11:45 am');
/*!40000 ALTER TABLE `appointments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `billing`
--

DROP TABLE IF EXISTS `billing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `billing` (
  `id` int NOT NULL,
  `app_id` int DEFAULT NULL,
  `pay_mode` varchar(45) DEFAULT NULL,
  `pay_status` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `app_id` (`app_id`),
  CONSTRAINT `app_idfk` FOREIGN KEY (`app_id`) REFERENCES `appointments` (`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing`
--

LOCK TABLES `billing` WRITE;
/*!40000 ALTER TABLE `billing` DISABLE KEYS */;
INSERT INTO `billing` VALUES (1,1,'Cash',1),(2,2,'Online',1),(3,3,'Cash',1),(4,4,'Cash',0);
/*!40000 ALTER TABLE `billing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dr_id` int DEFAULT NULL,
  `specialization` varchar(45) NOT NULL,
  `qualification` varchar(45) NOT NULL,
  `experience` varchar(15) NOT NULL,
  `fees` double NOT NULL,
  `time_slot` varchar(35) NOT NULL,
  `approval_status` tinyint DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `dridtoaccount_idx` (`dr_id`),
  CONSTRAINT `dridtoaccount` FOREIGN KEY (`dr_id`) REFERENCES `account` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,2,'NEUROLOGIST','MBBS','10',500,'09AM-12 PM/04PM-08 PM',1),(2,5,'ORTHOLOGIST','MBBS','5',1000,'09AM-12 PM/04PM-08 PM',1),(7,9,'CARDIOLOGIST','MD','5',600,'09AM-12 PM/04PM-08 PM',0),(8,10,'DERMATOLOGIST','MBBS','5',800,'09AM-12 PM/04PM-08 PM',0),(9,11,'Neuro','MBBS','5',500,'2',0),(10,12,'Veternary','MBBS','5',598,'2',0);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dr_leave`
--

DROP TABLE IF EXISTS `dr_leave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dr_leave` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `to_date` date DEFAULT NULL,
  `reason` varchar(45) DEFAULT NULL,
  `approval_status` int DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dr_leave`
--

LOCK TABLES `dr_leave` WRITE;
/*!40000 ALTER TABLE `dr_leave` DISABLE KEYS */;
INSERT INTO `dr_leave` VALUES (1,'shree','vitkar','2020-08-08','2020-09-08','xyz',1),(2,'sumeet','h','2020-02-07','2020-09-07','hjsad',0);
/*!40000 ALTER TABLE `dr_leave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_history`
--

DROP TABLE IF EXISTS `patient_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_history` (
  `id` int NOT NULL,
  `app_id` int DEFAULT NULL,
  `reason` varchar(45) NOT NULL,
  `diagnosis` varchar(45) NOT NULL,
  `prescription` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `app_id_idx` (`app_id`),
  CONSTRAINT `app_id` FOREIGN KEY (`app_id`) REFERENCES `appointments` (`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_history`
--

LOCK TABLES `patient_history` WRITE;
/*!40000 ALTER TABLE `patient_history` DISABLE KEYS */;
INSERT INTO `patient_history` VALUES (1,1,'Fever','Thermo','Paracaetamol'),(2,4,'Fracture','xray','Plaster'),(3,2,'Brain dead','MRI','Ventilator'),(4,3,'Fracture','xray','Plaster');
/*!40000 ALTER TABLE `patient_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Admin'),(2,'Doctor'),(3,'Patient'),(4,'Receptionist');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `u_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'sumeethatkar@gmail.com','Sumeet123'),(2,'trupti@gmail.com','Trupti123'),(3,'shree@gmail.com','Shree123'),(4,'pat3@gmail.com','shree123'),(5,'dr2id5@gmail.com','shree123'),(6,'dr3@gmail.com','shree123'),(7,'pooja@gmail.com','Pooja123'),(8,'admin@gmail.com','Admin123'),(9,'sonia@gmail.com','Sonia123'),(10,'aarti@gmail.com','Aarti123'),(11,'h@gmail.com','Hardik123'),(12,'a@gmail.com','Akshay123');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-29 20:31:55
