-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 24, 2022 at 04:10 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `staff_salary_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `bangchamcong`
--

CREATE TABLE `bangchamcong` (
  `MaChamCong` varchar(10) NOT NULL,
  `MaNV` varchar(10) NOT NULL,
  `NgayThangNam` date NOT NULL,
  `TrangThai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bangchamcong`
--

INSERT INTO `bangchamcong` (`MaChamCong`, `MaNV`, `NgayThangNam`, `TrangThai`) VALUES
('CC01', 'NV01', '2022-02-19', 'Nghỉ phép'),
('CC02', 'NV03', '2022-04-09', 'Vắng'),
('CC03', 'NV02', '2022-10-08', 'Nghỉ phép'),
('CC04', 'NV05', '2022-04-28', 'Nghỉ phép'),
('CC05', 'NV02', '2022-07-10', 'Nghỉ phép'),
('CC06', 'NV03', '2022-09-13', 'Vắng'),
('CC07', 'NV04', '2022-05-18', 'Nghỉ phép'),
('CC08', 'NV05', '2022-01-24', 'Vắng'),
('CC09', 'NV04', '2022-03-12', 'Nghỉ phép'),
('CC10', 'NV04', '2022-06-22', 'Nghỉ phép'),
('CC11', 'NV02', '2022-05-08', 'Nghỉ phép'),
('CC12', 'NV01', '2022-06-29', 'Nghỉ phép'),
('CC13', 'NV08', '2022-06-15', 'Vắng'),
('CC14', 'NV08', '2022-12-12', 'Nghỉ phép'),
('CC15', 'NV07', '2022-09-18', 'Vắng'),
('CC16', 'NV06', '2022-04-11', 'Nghỉ phép'),
('CC17', 'NV07', '2022-06-10', 'Vắng');

-- --------------------------------------------------------

--
-- Table structure for table `bangluongthang`
--

CREATE TABLE `bangluongthang` (
  `MaNV` varchar(10) NOT NULL,
  `MaHopDong` varchar(10) NOT NULL,
  `MaPhuCap` varchar(10) DEFAULT NULL,
  `MaTienThuong` varchar(10) DEFAULT NULL,
  `SoGioTangCa` varchar(10) NOT NULL,
  `LuongBiTru` varchar(10) NOT NULL,
  `NgayThangNam` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bangluongthang`
--

INSERT INTO `bangluongthang` (`MaNV`, `MaHopDong`, `MaPhuCap`, `MaTienThuong`, `SoGioTangCa`, `LuongBiTru`, `NgayThangNam`) VALUES
('NV01', 'HD01', 'PC02', 'TT04', '70', '0', '2019-08-16'),
('NV02', 'HD08', 'PC01', 'TT04', '59', '2%', '2019-08-16'),
('NV03', 'HD06', 'PC01', 'TT01', '0', '20%', '2019-08-16'),
('NV04', 'HD07', 'PC02', 'TT02', '0', '2%', '2019-08-16'),
('NV05', 'HD03', 'PC02', 'TT02', '55', '10%', '2019-08-16'),
('NV06', 'HD02', 'PC01', 'TT01', '25', '0', '2019-08-16'),
('NV07', 'HD05', 'PC02', 'TT01', '0', '20%', '2022-02-01'),
('NV08', 'HD04', NULL, NULL, '70', '10%', '2019-08-16');

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `MaChucVu` varchar(10) NOT NULL,
  `TenChucVu` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`MaChucVu`, `TenChucVu`) VALUES
('CV01', 'Giám đốc'),
('CV02', 'Trưởng phòng'),
('CV03', 'Quản lý dự án'),
('CV04', 'Nhân viên cao cấp'),
('CV05', 'Nhân viên');

-- --------------------------------------------------------

--
-- Table structure for table `congviec`
--

CREATE TABLE `congviec` (
  `MaCongViec` varchar(10) NOT NULL,
  `TenCongViec` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `congviec`
--

INSERT INTO `congviec` (`MaCongViec`, `TenCongViec`) VALUES
('JOB01', 'Quản lý dự án'),
('JOB02', 'Hỗ trợ quản lý dự án'),
('JOB03', 'Lập trình'),
('JOB04', 'Quản lý kinh doanh'),
('JOB05', 'Quản lý nhân sự');

-- --------------------------------------------------------

--
-- Table structure for table `luonghopdong`
--

CREATE TABLE `luonghopdong` (
  `MaHopDong` varchar(10) NOT NULL,
  `MaNV` varchar(10) NOT NULL,
  `BacLuong` int(11) NOT NULL,
  `NgayKyHopDong` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `luonghopdong`
--

INSERT INTO `luonghopdong` (`MaHopDong`, `MaNV`, `BacLuong`, `NgayKyHopDong`) VALUES
('HD01', 'NV01', 2, '2016-04-03'),
('HD02', 'NV06', 3, '2013-02-09'),
('HD03', 'NV05', 1, '2016-08-06'),
('HD04', 'NV08', 1, '2017-07-10'),
('HD05', 'NV07', 2, '2016-10-21'),
('HD06', 'NV03', 1, '2022-12-12'),
('HD07', 'NV04', 2, '2016-08-05'),
('HD08', 'NV02', 3, '2013-04-19'),
('HD09', 'NV09', 2, '2016-08-06');

-- --------------------------------------------------------

--
-- Table structure for table `nguoithan`
--

CREATE TABLE `nguoithan` (
  `MaNV` varchar(10) NOT NULL,
  `STT` int(11) NOT NULL,
  `TenNguoiThan` varchar(50) NOT NULL,
  `GioiTinh` varchar(5) NOT NULL,
  `NamSinh` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(10) NOT NULL,
  `Ho` varchar(50) NOT NULL,
  `Ten` varchar(10) NOT NULL,
  `NgaySinh` date NOT NULL,
  `SoDienThoai` varchar(15) NOT NULL,
  `GioiTinh` varchar(5) NOT NULL,
  `MaPhongBan` varchar(10) NOT NULL,
  `MaChucVu` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Ho`, `Ten`, `NgaySinh`, `SoDienThoai`, `GioiTinh`, `MaPhongBan`, `MaChucVu`) VALUES
('NV01', 'Vương Đại ', 'Nguyên', '2002-02-04', '0194121451', 'Nam', 'PB03', 'CV04'),
('NV02', 'Bùi Thị Thanh', 'Bình', '2003-07-11', '0543141241', 'Nữ', 'PB01', 'CV02'),
('NV03', 'Lê Thị Huỳnh', 'Như', '2003-08-11', '0214124325', 'Nữ', 'PB01', 'CV01'),
('NV04', 'Hoàng Nam', 'Trung', '2002-03-29', '0414329841', 'Nam', 'PB03', 'CV05'),
('NV05', 'Nguyễn Hoàng', 'Phúc', '2002-04-18', '0235325238', 'Nam', 'PB02', 'CV04'),
('NV06', 'Nguyễn Thị Ngọc', 'Trâm', '2022-07-15', '0342598173', 'Nữ', 'PB03', 'CV05'),
('NV07', 'Đặng Thị Thúy', 'Nga', '2022-01-04', '0119291477', 'Nữ', 'PB01', 'CV02'),
('NV08', 'Phan Trung', 'Kiên', '2022-01-12', '0523852141', 'Nam', 'PB02', 'CV01'),
('NV09', 'Phan Tiến', 'Nam', '2022-11-24', '0682465235', 'Nam', 'PB02', 'CV04');

-- --------------------------------------------------------

--
-- Table structure for table `phongban`
--

CREATE TABLE `phongban` (
  `MaPhongBan` varchar(10) NOT NULL,
  `TenPhongBan` varchar(45) NOT NULL,
  `MaCongViec` varchar(10) NOT NULL,
  `DiaChi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phongban`
--

INSERT INTO `phongban` (`MaPhongBan`, `TenPhongBan`, `MaCongViec`, `DiaChi`) VALUES
('PB01', 'Phòng kỹ thuật', 'JOB03', '405 Lê Lợi'),
('PB02', 'Phòng kinh doanh', 'JOB04', '4 Nguyễn Trãi'),
('PB03', 'Phòng nhân sự', 'JOB05', '47 Nguyễn Thị Minh Khai');

-- --------------------------------------------------------

--
-- Table structure for table `phucap`
--

CREATE TABLE `phucap` (
  `MaPhuCap` varchar(10) NOT NULL,
  `TenPhuCap` varchar(45) NOT NULL,
  `ThangNam` date NOT NULL,
  `SoTienPhuCap` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phucap`
--

INSERT INTO `phucap` (`MaPhuCap`, `TenPhuCap`, `ThangNam`, `SoTienPhuCap`) VALUES
('PC01', 'Phụ cấp sản phụ', '2022-06-16', '2500000'),
('PC02', 'Phụ cấp trách nhiệm', '2022-06-11', '2000000');

-- --------------------------------------------------------

--
-- Table structure for table `tangca`
--

CREATE TABLE `tangca` (
  `MaNV` varchar(10) NOT NULL,
  `NgayThangNam` date NOT NULL,
  `SoGioTangCa` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tangca`
--

INSERT INTO `tangca` (`MaNV`, `NgayThangNam`, `SoGioTangCa`) VALUES
('NV01', '2022-06-13', '70'),
('NV02', '2022-04-02', '59'),
('NV05', '2022-01-09', '55'),
('NV06', '2022-07-15', '25'),
('NV08', '2022-02-14', '70');

-- --------------------------------------------------------

--
-- Table structure for table `theodoitangluong`
--

CREATE TABLE `theodoitangluong` (
  `MaHopDong` varchar(10) NOT NULL,
  `LuongMoi` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tienthuong`
--

CREATE TABLE `tienthuong` (
  `MaTienThuong` varchar(10) NOT NULL,
  `TenThuong` varchar(20) NOT NULL,
  `NgayThuong` date NOT NULL,
  `SoTienThuong` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tienthuong`
--

INSERT INTO `tienthuong` (`MaTienThuong`, `TenThuong`, `NgayThuong`, `SoTienThuong`) VALUES
('TT01', 'Lễ Tết', '2022-02-08', '5000000'),
('TT02', 'Quốc tế thiếu nhi', '2022-06-01', '3000000'),
('TT03', 'Nhân viên của tháng', '2022-11-24', '7500000'),
('TT04', 'Vượt KPI', '2022-04-02', '2000000');

-- --------------------------------------------------------

--
-- Table structure for table `tongketchamcongthang`
--

CREATE TABLE `tongketchamcongthang` (
  `MaNV` varchar(10) NOT NULL,
  `SoKhongPhep` varchar(5) NOT NULL,
  `VangCoPhep` varchar(5) NOT NULL,
  `LuongBiTru` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tongketchamcongthang`
--

INSERT INTO `tongketchamcongthang` (`MaNV`, `SoKhongPhep`, `VangCoPhep`, `LuongBiTru`) VALUES
('NV01', '0', '2', '0'),
('NV02', '0', '3', '2%'),
('NV03', '2', '0', '20%'),
('NV04', '0', '3', '2%'),
('NV05', '1', '1', '10%'),
('NV06', '0', '1', '0'),
('NV07', '2', '0', '20%'),
('NV08', '1', '1', '10%'),
('NV09', '0', '0', '0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bangchamcong`
--
ALTER TABLE `bangchamcong`
  ADD PRIMARY KEY (`MaChamCong`),
  ADD KEY `fkChamcongNV` (`MaNV`);

--
-- Indexes for table `bangluongthang`
--
ALTER TABLE `bangluongthang`
  ADD PRIMARY KEY (`MaNV`),
  ADD UNIQUE KEY `MaHopDong` (`MaHopDong`),
  ADD UNIQUE KEY `MaHopDong_2` (`MaHopDong`),
  ADD UNIQUE KEY `MaHopDong_5` (`MaHopDong`),
  ADD KEY `MaHopDong_3` (`MaHopDong`),
  ADD KEY `MaHopDong_4` (`MaHopDong`),
  ADD KEY `fkPhucap` (`MaPhuCap`),
  ADD KEY `fkTienthuong` (`MaTienThuong`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`MaChucVu`);

--
-- Indexes for table `congviec`
--
ALTER TABLE `congviec`
  ADD PRIMARY KEY (`MaCongViec`);

--
-- Indexes for table `luonghopdong`
--
ALTER TABLE `luonghopdong`
  ADD PRIMARY KEY (`MaHopDong`,`MaNV`);

--
-- Indexes for table `nguoithan`
--
ALTER TABLE `nguoithan`
  ADD PRIMARY KEY (`MaNV`,`STT`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `fkPhongbanNV` (`MaPhongBan`),
  ADD KEY `fkChucvuNV` (`MaChucVu`);

--
-- Indexes for table `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`MaPhongBan`),
  ADD KEY `fkCongviecPB` (`MaCongViec`);

--
-- Indexes for table `phucap`
--
ALTER TABLE `phucap`
  ADD PRIMARY KEY (`MaPhuCap`);

--
-- Indexes for table `tangca`
--
ALTER TABLE `tangca`
  ADD PRIMARY KEY (`MaNV`);

--
-- Indexes for table `theodoitangluong`
--
ALTER TABLE `theodoitangluong`
  ADD PRIMARY KEY (`MaHopDong`);

--
-- Indexes for table `tienthuong`
--
ALTER TABLE `tienthuong`
  ADD PRIMARY KEY (`MaTienThuong`);

--
-- Indexes for table `tongketchamcongthang`
--
ALTER TABLE `tongketchamcongthang`
  ADD PRIMARY KEY (`MaNV`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bangchamcong`
--
ALTER TABLE `bangchamcong`
  ADD CONSTRAINT `fkChamcongNV` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

--
-- Constraints for table `bangluongthang`
--
ALTER TABLE `bangluongthang`
  ADD CONSTRAINT `fkHopdong` FOREIGN KEY (`MaHopDong`) REFERENCES `luonghopdong` (`MaHopDong`),
  ADD CONSTRAINT `fkPhucap` FOREIGN KEY (`MaPhuCap`) REFERENCES `phucap` (`MaPhuCap`),
  ADD CONSTRAINT `fkTangcaNV` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`),
  ADD CONSTRAINT `fkTienthuong` FOREIGN KEY (`MaTienThuong`) REFERENCES `tienthuong` (`MaTienThuong`);

--
-- Constraints for table `nguoithan`
--
ALTER TABLE `nguoithan`
  ADD CONSTRAINT `fkNguoiThanNV` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fkChucvuNV` FOREIGN KEY (`MaChucVu`) REFERENCES `chucvu` (`MaChucVu`),
  ADD CONSTRAINT `fkPhongbanNV` FOREIGN KEY (`MaPhongBan`) REFERENCES `phongban` (`MaPhongBan`);

--
-- Constraints for table `phongban`
--
ALTER TABLE `phongban`
  ADD CONSTRAINT `fkCongviecPB` FOREIGN KEY (`MaCongViec`) REFERENCES `congviec` (`MaCongViec`);

--
-- Constraints for table `theodoitangluong`
--
ALTER TABLE `theodoitangluong`
  ADD CONSTRAINT `fkTangluong` FOREIGN KEY (`MaHopDong`) REFERENCES `luonghopdong` (`MaHopDong`);

--
-- Constraints for table `tongketchamcongthang`
--
ALTER TABLE `tongketchamcongthang`
  ADD CONSTRAINT `fkTKNhanvien` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
