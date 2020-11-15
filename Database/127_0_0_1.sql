-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2020 at 11:59 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `foodorderingsystem`
--
DROP DATABASE IF EXISTS `foodorderingsystem`;
CREATE DATABASE IF NOT EXISTS `foodorderingsystem` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `foodorderingsystem`;

-- --------------------------------------------------------

--
-- Table structure for table `meals`
--

DROP TABLE IF EXISTS `meals`;
CREATE TABLE IF NOT EXISTS `meals` (
  `ProductID` int(11) NOT NULL,
  `ProductDescription` varchar(100) NOT NULL,
  `ProductPrice` decimal(10,0) NOT NULL,
  `ProductQty` int(11) NOT NULL,
  PRIMARY KEY (`ProductID`),
  UNIQUE KEY `ProductID` (`ProductID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `meals`
--

INSERT INTO `meals` (`ProductID`, `ProductDescription`, `ProductPrice`, `ProductQty`) VALUES
(1, 'White Rice with Chicken', '130', 150),
(2, 'WhiteRice With Egg', '110', 150),
(3, 'BrownRice with Egg', '110', 150),
(4, 'Brown Rice with Chicken', '130', 150),
(5, 'Fried Rice with chicken', '210', 150),
(6, 'Fried Rice with Egg', '200', 150),
(7, 'Kottu with Chicken', '220', 150),
(8, 'Kottu with Egg', '190', 150),
(9, 'Kottu with Chicken and cheese', '260', 150);

-- --------------------------------------------------------

--
-- Table structure for table `salesorder`
--

DROP TABLE IF EXISTS `salesorder`;
CREATE TABLE IF NOT EXISTS `salesorder` (
  `ProductDescription` varchar(100) NOT NULL,
  `qty` int(11) NOT NULL,
  `TotalValue` decimal(10,0) NOT NULL,
  `OrderId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`OrderId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salesorder`
--

INSERT INTO `salesorder` (`ProductDescription`, `qty`, `TotalValue`, `OrderId`) VALUES
('Egg', 1, '200', 6),
('Chicken', 1, '230', 7);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
