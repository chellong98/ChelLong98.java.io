GO
/****** Object:  Database [dsKhachHang]    Script Date: 04/11/2017 12:52:31 CH ******/
CREATE DATABASE [dsKhachHang]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'dsKhachHang', FILENAME = N'G:\LapTrinhJAVA\Java_edumall\bai37\CSDL\dsKhachHang.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'dsKhachHang_log', FILENAME = N'G:\LapTrinhJAVA\Java_edumall\bai37\CSDL\dsKhachHang_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [dsKhachHang] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [dsKhachHang].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [dsKhachHang] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [dsKhachHang] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [dsKhachHang] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [dsKhachHang] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [dsKhachHang] SET ARITHABORT OFF 
GO
ALTER DATABASE [dsKhachHang] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [dsKhachHang] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [dsKhachHang] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [dsKhachHang] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [dsKhachHang] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [dsKhachHang] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [dsKhachHang] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [dsKhachHang] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [dsKhachHang] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [dsKhachHang] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [dsKhachHang] SET  DISABLE_BROKER 
GO
ALTER DATABASE [dsKhachHang] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [dsKhachHang] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [dsKhachHang] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [dsKhachHang] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [dsKhachHang] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [dsKhachHang] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [dsKhachHang] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [dsKhachHang] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [dsKhachHang] SET  MULTI_USER 
GO
ALTER DATABASE [dsKhachHang] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [dsKhachHang] SET DB_CHAINING OFF 
GO
ALTER DATABASE [dsKhachHang] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [dsKhachHang] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [dsKhachHang]
GO
/****** Object:  StoredProcedure [dbo].[LayKhachHangTheoNhom]    Script Date: 04/11/2017 12:52:31 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[LayKhachHangTheoNhom]
@manhom nvarchar(50)
as 
select * from KhachHang where maNhom = @manhom
GO
/****** Object:  StoredProcedure [dbo].[LayToanBoKhachHang]    Script Date: 04/11/2017 12:52:31 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--tạo store procedure (viết hàng sử dụng)
--ví dụ tạo store procedure trả về toàn bộ danh sách khách hàng
CREATE proc [dbo].[LayToanBoKhachHang] --tạo danh sách khách hàng(đầu tiên thay alter bằn create)
as
select * from KhachHang

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 04/11/2017 12:52:31 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [nvarchar](250) NOT NULL,
	[TenKH] [nvarchar](250) NULL,
	[namSinh] [datetime] NULL,
	[MaNhom] [nvarchar](50) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Nhom]    Script Date: 04/11/2017 12:52:31 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Nhom](
	[maNhom] [nvarchar](50) NOT NULL,
	[tenNhom] [nvarchar](50) NULL,
 CONSTRAINT [PK_Nhom] PRIMARY KEY CLUSTERED 
(
	[maNhom] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [namSinh], [MaNhom]) VALUES (N'kh1', N'nhật long', CAST(0x00008C7E00000000 AS DateTime), N'mn3')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [namSinh], [MaNhom]) VALUES (N'kh2', N'lê hiếu', CAST(0x00008B0B00000000 AS DateTime), N'mn2')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [namSinh], [MaNhom]) VALUES (N'kh3', N'phạm hùng', CAST(0x000006EC00000000 AS DateTime), N'mn1')
INSERT [dbo].[Nhom] ([maNhom], [tenNhom]) VALUES (N'mn1', N'Khách hàng vip')
INSERT [dbo].[Nhom] ([maNhom], [tenNhom]) VALUES (N'mn2', N'Khách hàng tiềm năng')
INSERT [dbo].[Nhom] ([maNhom], [tenNhom]) VALUES (N'mn3', N'Khách hàng khó tính')
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_Nhom] FOREIGN KEY([MaNhom])
REFERENCES [dbo].[Nhom] ([maNhom])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_Nhom]
GO
USE [master]
GO
ALTER DATABASE [dsKhachHang] SET  READ_WRITE 
GO
