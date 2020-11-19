-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2020 at 07:10 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

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
-- Table structure for table `fastfood`
--

CREATE TABLE `fastfood` (
  `ProductID` int(10) NOT NULL,
  `ProductDescription` varchar(1000) NOT NULL,
  `ProductPrice` double NOT NULL,
  `ProductQty` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fastfood`
--

INSERT INTO `fastfood` (`ProductID`, `ProductDescription`, `ProductPrice`, `ProductQty`) VALUES
(10, 'Chicken Burger', 200, 1),
(11, 'Submarine', 200, 1),
(13, 'Pizza', 150, 1),
(14, 'Sandwich', 100, 1);

-- --------------------------------------------------------

--
-- Table structure for table `meals`
--

CREATE TABLE `meals` (
  `ProductID` int(11) NOT NULL,
  `ProductDescription` varchar(100) NOT NULL,
  `ProductPrice` decimal(10,0) NOT NULL,
  `ProductQty` int(11) NOT NULL
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
-- Table structure for table `salesorder`
--

CREATE TABLE `salesorder` (
  `ProductDescription` varchar(100) NOT NULL,
  `qty` int(11) NOT NULL,
  `TotalValue` decimal(10,0) NOT NULL,
  `OrderId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salesorder`
--

INSERT INTO `salesorder` (`ProductDescription`, `qty`, `TotalValue`, `OrderId`) VALUES
('Egg', 1, '200', 6),
('Chicken', 1, '230', 7),
('Chicken Burger', 1, '200', 14),
('Submarine', 1, '200', 15),
('Pizza', 1, '150', 17),
('Sandwitch', 2, '200', 18),
('Donut', 3, '180', 19),
('Chicken Burger', 1, '200', 28),
('Donut', 1, '60', 29),
('Sandwitch', 1, '100', 30),
('Submarine', 1, '200', 31),
('Chicken Burger', 1, '200', 32);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fastfood`
--
ALTER TABLE `fastfood`
  ADD PRIMARY KEY (`ProductID`);

--
-- Indexes for table `meals`
--
ALTER TABLE `meals`
  ADD PRIMARY KEY (`ProductID`),
  ADD UNIQUE KEY `ProductID` (`ProductID`);

--
-- Indexes for table `orderbill`
--
ALTER TABLE `orderbill`
  ADD PRIMARY KEY (`OrderID`);

--
-- Indexes for table `salesorder`
--
ALTER TABLE `salesorder`
  ADD PRIMARY KEY (`OrderId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `salesorder`
--
ALTER TABLE `salesorder`
  MODIFY `OrderId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
