
GO
/****** Object:  Database [dbKhachHang]    Script Date: 12/11/2017 10:44:05 CH ******/
CREATE DATABASE [dbKhachHang]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'dbKhachHang', FILENAME = N'G:\LapTrinhJAVA\Java_edumall\bai37\CSDL\dbKhachHang.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'dbKhachHang_log', FILENAME = N'G:\LapTrinhJAVA\Java_edumall\bai37\CSDL\dbKhachHang_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [dbKhachHang] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [dbKhachHang].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [dbKhachHang] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [dbKhachHang] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [dbKhachHang] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [dbKhachHang] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [dbKhachHang] SET ARITHABORT OFF 
GO
ALTER DATABASE [dbKhachHang] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [dbKhachHang] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [dbKhachHang] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [dbKhachHang] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [dbKhachHang] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [dbKhachHang] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [dbKhachHang] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [dbKhachHang] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [dbKhachHang] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [dbKhachHang] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [dbKhachHang] SET  DISABLE_BROKER 
GO
ALTER DATABASE [dbKhachHang] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [dbKhachHang] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [dbKhachHang] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [dbKhachHang] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [dbKhachHang] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [dbKhachHang] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [dbKhachHang] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [dbKhachHang] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [dbKhachHang] SET  MULTI_USER 
GO
ALTER DATABASE [dbKhachHang] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [dbKhachHang] SET DB_CHAINING OFF 
GO
ALTER DATABASE [dbKhachHang] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [dbKhachHang] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [dbKhachHang]
GO
/****** Object:  StoredProcedure [dbo].[LayKhachHangTheoNhom]    Script Date: 12/11/2017 10:44:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[LayKhachHangTheoNhom]
@manhom nvarchar(50)
as
select * from KhachHang where MaNhom=@manhom

GO
/****** Object:  StoredProcedure [dbo].[LayToanBoKhachHang]    Script Date: 12/11/2017 10:44:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[LayToanBoKhachHang]
as
select * from KhachHang
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 12/11/2017 10:44:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [nvarchar](250) NOT NULL,
	[TenKH] [nvarchar](150) NULL,
	[NamSinh] [datetime] NULL,
	[MaNhom] [nvarchar](50) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Nhom]    Script Date: 12/11/2017 10:44:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Nhom](
	[MaNhom] [nvarchar](50) NOT NULL,
	[TenNhom] [nvarchar](50) NULL,
 CONSTRAINT [PK_Nhom] PRIMARY KEY CLUSTERED 
(
	[MaNhom] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [NamSinh], [MaNhom]) VALUES (N'kh1', N'long nguyễn nhật', CAST(0x00008BD200000000 AS DateTime), N'mn3')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [NamSinh], [MaNhom]) VALUES (N'kh2', N'lê đinhg hiếu', CAST(0x00008C3700000000 AS DateTime), N'mn2')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [NamSinh], [MaNhom]) VALUES (N'kh3', N'phạm quang hùng', CAST(0x00008AA100000000 AS DateTime), N'mn1')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [NamSinh], [MaNhom]) VALUES (N'kh4', N'lê hồng thanh', CAST(0x000089AF00000000 AS DateTime), N'mn2')
INSERT [dbo].[Nhom] ([MaNhom], [TenNhom]) VALUES (N'mn1', N'Khách hàng VIP')
INSERT [dbo].[Nhom] ([MaNhom], [TenNhom]) VALUES (N'mn2', N'Khách hàng Tiềm năng')
INSERT [dbo].[Nhom] ([MaNhom], [TenNhom]) VALUES (N'mn3', N'Khách hàng Khó Tính')
USE [master]
GO
ALTER DATABASE [dbKhachHang] SET  READ_WRITE 
GO
