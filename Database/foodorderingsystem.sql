-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2020 at 05:15 PM
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

-- --------------------------------------------------------

--
-- Table structure for table `orderbill`
--

CREATE TABLE `orderbill` (
  `OrderID` int(10) NOT NULL,
  `OrderType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderbill`
--

INSERT INTO `orderbill` (`OrderID`, `OrderType`) VALUES
(1, 'take');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `ProductID` int(11) NOT NULL,
  `ProductDescription` varchar(100) NOT NULL,
  `ProductPrice` decimal(10,0) NOT NULL,
  `ProductQty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`ProductID`, `ProductDescription`, `ProductPrice`, `ProductQty`) VALUES
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

CREATE TABLE `salesorder` (
  `ItemNo` int(11) NOT NULL,
  `CustID` int(11) DEFAULT NULL,
  `Product` varchar(100) DEFAULT NULL,
  `QTY` int(11) DEFAULT NULL,
  `Total` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salesorder`
--

INSERT INTO `salesorder` (`ItemNo`, `CustID`, `Product`, `QTY`, `Total`) VALUES
(21, 1000, 'Fried Rice with Chicken', 5, '1150'),
(22, 1000, 'White Rice with Chicken', 1, '130'),
(23, 1000, 'Fried Rice with Egg', 1, '200'),
(24, 1000, 'White rice with Egg', 1, '110'),
(25, 1000, 'Brown rice with Egg', 2, '220');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`ProductID`),
  ADD UNIQUE KEY `ProductID` (`ProductID`);

--
-- Indexes for table `salesorder`
--
ALTER TABLE `salesorder`
  ADD PRIMARY KEY (`ItemNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `salesorder`
--
ALTER TABLE `salesorder`
  MODIFY `ItemNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
