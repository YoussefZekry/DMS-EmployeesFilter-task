-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: Employees
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `employees`
--
-- CREATE DATABASE employeesdb;

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `code` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `birth_date` date DEFAULT NULL,
  `birth_city` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `job_title` varchar(45) DEFAULT NULL,
  `direct_manager` varchar(45) DEFAULT NULL,
  `contract_type` varchar(45) DEFAULT NULL,
  `status` boolean,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Id_UNIQUE` (`Code`),
  UNIQUE KEY `Code_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

 LOCK TABLES `employees` WRITE;
-- UNLOCK TABLES;

/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES 
(1, 7,'Youssef Zekry','1997-03-12','Cairo','UI/UX Developer','junior','Ramy Ali','Full Time',1),
(2, 8,'ahmed mahrous','1995-05-04','Cairo','UI/UX Developer','senior','Ramy Ali','Full Time',1),
(3, 9,'ahmed badry','1998-03-12','Cairo','UI/UX Developer','junior','Ramy Ali','Full Time',1),
(4, 10,'ahmed taha','1996-03-12','Cairo','UI/UX Developer','senior','Ramy Ali','part Time',1),
(5, 11,'dina el-desouky','1990-03-12','Cairo','UI/UX Developer','senior','Ramy Ali','Full Time',1),
(6, 12,'fady hany','1998-03-12','Cairo','UI/UX Developer','senior','Ramy Ali','Full Time',1),
(7, 13,'mahmoud ayad','1989-03-12','Cairo','UI/UX Developer','senior','Ramy Ali','part Time',1),
(8, 14,'hussein deiab','1990-03-12','Cairo','UI/UX Developer','senior','Ramy Ali','Full Time',1),
(9, 15,'nehal youssif','1991-03-12','Cairo','UI/UX Developer','senior','Ramy Ali','part Time',1),
(10, 16,'sarah ragab','1992-03-12','Cairo','UI/UX Developer','senior','Ramy Ali','Full Time', 1);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
-- LOCK TABLES `employees` WRITE;
-- LOCK TABLES `employees` READ;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-23  12:01:00
