-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 12, 2017 lúc 05:40 PM
-- Phiên bản máy phục vụ: 10.1.28-MariaDB
-- Phiên bản PHP: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `dbtaisan`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taisan`
--

CREATE TABLE `taisan` (
  `Ma` varchar(15) COLLATE utf8_vietnamese_ci NOT NULL,
  `Ten` text COLLATE utf8_vietnamese_ci NOT NULL,
  `NgayNhap` datetime NOT NULL,
  `SoNamKhauHao` int(11) NOT NULL,
  `GiaTri` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `taisan`
--

INSERT INTO `taisan` (`Ma`, `Ten`, `NgayNhap`, `SoNamKhauHao`, `GiaTri`) VALUES
('', 'MÁY QUÉT VÂN TAY', '2017-12-11 07:00:00', 6, 90),
('ts1', 'máy khoa tường', '2017-12-12 17:32:00', 2, 10),
('ts2', 'máy hút bụi', '2017-12-12 10:13:20', 2, 5);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `taisan`
--
ALTER TABLE `taisan`
  ADD PRIMARY KEY (`Ma`);
ALTER TABLE `taisan` ADD FULLTEXT KEY `Ma` (`Ma`);
ALTER TABLE `taisan` ADD FULLTEXT KEY `Ma_2` (`Ma`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
