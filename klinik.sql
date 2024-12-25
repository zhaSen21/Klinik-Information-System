-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Waktu pembuatan: 25 Des 2024 pada 13.04
-- Versi server: 8.0.30
-- Versi PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `klinik`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_antrian`
--

CREATE TABLE `tb_antrian` (
  `no_antrian` int NOT NULL,
  `no_rm` bigint NOT NULL,
  `nama` varchar(25) NOT NULL,
  `tanggal_periksa` date NOT NULL,
  `keluhan` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_antrian`
--

INSERT INTO `tb_antrian` (`no_antrian`, `no_rm`, `nama`, `tanggal_periksa`, `keluhan`) VALUES
(3, 3171012304850001, 'Budi Santoso', '2024-12-31', 'Sakit kepala'),
(4, 3201020108920002, 'Siti Nurhaliza', '2025-01-03', 'Kaki bengkak'),
(5, 3404052703890004, 'Ani Setiawati ', '2025-02-01', 'Diare');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_dokter`
--

CREATE TABLE `tb_dokter` (
  `id_dokter` varchar(7) NOT NULL,
  `nama_dokter` varchar(25) NOT NULL,
  `alamat_dokter` varchar(40) NOT NULL,
  `telepon_dokter` varchar(12) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `jadwal_praktek` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_dokter`
--

INSERT INTO `tb_dokter` (`id_dokter`, `nama_dokter`, `alamat_dokter`, `telepon_dokter`, `username`, `password`, `jadwal_praktek`) VALUES
('0318002', 'Diah Lestari', 'Jalan Raya Bogor', '085256534356', 'bidan', 'qwe', 'Sabut 08.00-18.00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pasien`
--

CREATE TABLE `tb_pasien` (
  `no_rm` bigint NOT NULL,
  `nama_pasien` varchar(25) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` varchar(1) NOT NULL,
  `gol_darah` varchar(2) NOT NULL,
  `pekerjaan_pasien` varchar(15) NOT NULL,
  `alamat_pasien` varchar(40) NOT NULL,
  `telepon` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_pasien`
--

INSERT INTO `tb_pasien` (`no_rm`, `nama_pasien`, `tanggal_lahir`, `jenis_kelamin`, `gol_darah`, `pekerjaan_pasien`, `alamat_pasien`, `telepon`) VALUES
(3171012304850001, 'Budi Santoso', '2003-12-06', 'L', 'O', 'Guru', 'Jl. Merdeka No. 12, Jakarta Pusat', '081234567890'),
(3201020108920002, 'Siti Nurhaliza', '1992-08-01', 'P', 'A', 'Dokter', 'Jl. Pahlawan No. 5, Bogor', '085678901234'),
(3273045678901234, 'Ahmad Budiman', '1985-05-02', 'L', 'A', 'Programmer', 'Jl. Sudirman No. 123', '081234567890'),
(3302031511780003, 'Joko Widodo', '1978-11-17', 'L', 'B', 'Wiraswasta', 'Jl. Sudirman No. 20', '087712345678'),
(3404052703890004, 'Ani Setiawati ', '1989-12-06', 'P', 'AB', 'Apoteker', 'Jl. Diponegoro No. 8', '082234567890'),
(3471098765432109, 'Chandra Wijaya', '1978-12-20', 'L', 'B', 'Mahasiswa', 'RS Umum Daerah, Jl. Diponegoro', '082145678901');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pegawai`
--

CREATE TABLE `tb_pegawai` (
  `id_pegawai` varchar(7) NOT NULL,
  `nama_pegawai` varchar(25) NOT NULL,
  `alamat_pegawai` varchar(40) NOT NULL,
  `telepon_pegawai` varchar(12) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `jabatan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_pegawai`
--

INSERT INTO `tb_pegawai` (`id_pegawai`, `nama_pegawai`, `alamat_pegawai`, `telepon_pegawai`, `username`, `password`, `jabatan`) VALUES
('0118001', 'Sintia Rakian', 'Tebet Barat', '082110290933', 'resep', 'qwe', 'Resepsionis'),
('0118002', 'Deo Politon', 'srengseng sawah', '081210261292', 'admin', 'qwe', 'Admin'),
('0118003', 'Trini Batargoa', 'Manibang', '085256534355', 'nino', 'qwe', 'Resepsionis'),
('0118004', 'Eva Kodongan', 'Jl.SEA', '085256534354', 'eva', 'qwe', 'Admin'),
('0118005', 'Rian Ratag', 'Karimbow', '085256534353', 'resep1', 'qwe', 'Resepsionis'),
('0118006', 'Letare Yakobus', 'Jl Mawar III', '085240455560', 'admin1', 'qwe', 'Admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_riwayat`
--

CREATE TABLE `tb_riwayat` (
  `no_periksa` int NOT NULL,
  `no_rm` bigint NOT NULL,
  `tanggal_periksa` date NOT NULL,
  `tindakan` varchar(500) NOT NULL,
  `diagnosa` varchar(500) NOT NULL,
  `resep` varchar(500) NOT NULL,
  `tekanan_darah` varchar(7) NOT NULL,
  `keluhan` varchar(500) NOT NULL,
  `nama_dokter` varchar(32) NOT NULL,
  `berat` int NOT NULL,
  `tinggi` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_riwayat`
--

INSERT INTO `tb_riwayat` (`no_periksa`, `no_rm`, `tanggal_periksa`, `tindakan`, `diagnosa`, `resep`, `tekanan_darah`, `keluhan`, `nama_dokter`, `berat`, `tinggi`) VALUES
(241221001, 3302031511780003, '2024-12-27', 'Kurangi merokok', 'Tidak Sakit', 'Vitamin C', '120', 'Checkup', 'DR. Paramintha', 68, 170);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_antrian`
--
ALTER TABLE `tb_antrian`
  ADD PRIMARY KEY (`no_antrian`),
  ADD UNIQUE KEY `no_rm` (`no_rm`);

--
-- Indeks untuk tabel `tb_dokter`
--
ALTER TABLE `tb_dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indeks untuk tabel `tb_pasien`
--
ALTER TABLE `tb_pasien`
  ADD PRIMARY KEY (`no_rm`);

--
-- Indeks untuk tabel `tb_pegawai`
--
ALTER TABLE `tb_pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indeks untuk tabel `tb_riwayat`
--
ALTER TABLE `tb_riwayat`
  ADD PRIMARY KEY (`no_periksa`),
  ADD UNIQUE KEY `no_rm` (`no_rm`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_antrian`
--
ALTER TABLE `tb_antrian`
  MODIFY `no_antrian` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_antrian`
--
ALTER TABLE `tb_antrian`
  ADD CONSTRAINT `tb_antrian_ibfk_1` FOREIGN KEY (`no_rm`) REFERENCES `tb_pasien` (`no_rm`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `tb_riwayat`
--
ALTER TABLE `tb_riwayat`
  ADD CONSTRAINT `tb_riwayat_ibfk_1` FOREIGN KEY (`no_rm`) REFERENCES `tb_pasien` (`no_rm`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
