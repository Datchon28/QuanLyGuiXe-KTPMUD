-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 07, 2022 lúc 10:40 AM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `project`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `xegui`
--

CREATE TABLE `xegui` (
  `bienso` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenchuxe` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL,
  `mauxe` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL,
  `loaixe` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngaygui` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `xegui`
--

INSERT INTO `xegui` (`bienso`, `tenchuxe`, `mauxe`, `loaixe`, `ngaygui`) VALUES
('29Y7-666.66', 'Nguyễn Phi long', 'Đen', 'Vision', '6/10/2022'),
('30E2-888.88', 'Đào Thành Tâm', 'Trắng', 'Honda', '7/10/2022'),
('30Y6-999.99', 'Nguyễn Tiến Đạt', 'Đỏ', 'Wave', '7/10/2022');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `xegui`
--
ALTER TABLE `xegui`
  ADD PRIMARY KEY (`bienso`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
