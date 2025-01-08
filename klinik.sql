-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Waktu pembuatan: 08 Jan 2025 pada 02.38
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
  `layanan` varchar(50) NOT NULL,
  `keluhan` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_antrian`
--

INSERT INTO `tb_antrian` (`no_antrian`, `no_rm`, `nama`, `tanggal_periksa`, `layanan`, `keluhan`) VALUES
(1, 3171010101900001, 'Budi Santoso', '2024-03-08', 'Umum', 'Demam dan batuk sudah 3 hari'),
(2, 3302030303850003, 'Rahmat Hidayat', '2024-03-08', 'Umum', 'Sakit kepala dan nyeri otot'),
(3, 3505050505950005, 'Eko Prasetyo', '2024-03-09', 'Umum', 'Ruam kulit di tangan'),
(4, 3172070707830007, 'Dedi Irawan', '2024-03-09', 'Umum', 'Sakit perut dan mual'),
(5, 3405101010870010, 'Indra Permana', '2024-03-10', 'Umum', 'Nyeri punggung bawah'),
(6, 3171111111930011, 'Siti Aminah', '2024-03-08', 'ANC', 'Mual dan muntah di pagi hari (morning sickness), usia kehamilan 10 minggu'),
(7, 3302131313960013, 'Dewi Lestari', '2024-03-09', 'KB', 'Konsultasi pemilihan metode kontrasepsi'),
(8, 3505151515820015, 'Intan Permata', '2024-03-09', 'Umum', 'Pusing dan lemas'),
(9, 3172171717840017, 'Larasati Putri', '2024-03-10', 'Imunisasi', 'Imunisasi TT (Tetanus Toksoid)'),
(10, 3405202020830020, 'Olivia Natalia', '2024-03-10', 'Umum', 'Insomnia dan cemas'),
(11, 3171012304850001, 'Budi Santoso', '2025-01-06', 'Umum', 'Nyeri perut, mual');

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
(3171111111930011, 'Siti Aminah', '1993-11-11', 'P', 'A', 'Guru', 'Jl. Kenari No. 11, Jakarta Timur', '81313131313'),
(3172070707830007, 'Dedi Irawan', '1983-07-07', 'L', 'B', 'Arsitek', 'Jl. Dahlia No. 7, Jakarta Selatan', '85766778899'),
(3172171717840017, 'Larasati Putri', '1984-05-17', 'P', 'AB', 'Akuntan', 'Jl. Camar No. 17, Tangerang', '85919191919'),
(3201020202920002, 'Andi Pratama', '1992-02-02', 'L', 'A', 'Dokter', 'Jl. Melati No. 2, Bogor', '85698765432'),
(3201121212860012, 'Rina Sari', '1986-12-12', 'P', 'B', 'Dokter Gigi', 'Jl. Cendrawasih No. 12, Bekasi', '85814141414'),
(3202080808980008, 'Faisal Akbar', '1998-08-08', 'L', 'AB', 'Mahasiswa', 'Jl. Bougenville No. 8, Depok', '87899001122'),
(3202181818970018, 'Maya Anggraini', '1997-06-18', 'P', 'O', 'Psikolog', 'Jl. Pipit No. 18, Depok', '87120202020'),
(3273045678901234, 'Ahmad Budiman', '1985-05-02', 'L', 'A', 'Programmer', 'Jl. Sudirman No. 123', '081234567890'),
(3302030303850003, 'Rahmat Hidayat', '1985-03-03', 'L', 'B', 'Polisi', 'Jl. Kenanga No. 3, Bandung', '87788990011'),
(3302031511780003, 'Joko Widodo', '1978-11-17', 'L', 'B', 'Wiraswasta', 'Jl. Sudirman No. 20', '087712345678'),
(3302131313960013, 'Dewi Lestari', '1996-01-13', 'P', 'AB', 'Apoteker', 'Jl. Merpati No. 13, Cimahi', '87915151515'),
(3303090909910009, 'Guntur Nugroho', '1991-09-09', 'L', 'O', 'Atlet', 'Jl. Teratai No. 9, Semarang', '82344556677'),
(3303090909912229, 'Indra Permana', '1987-10-10', 'L', 'A', 'TNI', 'Jl. Mawar Putih No. 10, Solo', '89788990011'),
(3303191919900019, 'Nita Kusuma', '1990-07-19', 'P', 'A', 'Perawat', 'Jl. Gelatik No. 19, Bogor', '82521212121'),
(3303191919922219, 'Olivia Natalia', '1983-08-20', 'P', 'B', 'Pengacara', 'Jl. Merak No. 20, Semarang', '89922222222'),
(3404040404880004, 'Surya Dharma', '1988-04-04', 'L', 'AB', 'Pengusaha', 'Jl. Anggrek No. 4, Yogyakarta', '82233445566'),
(3404141414890014, 'Ayu Wulandari', '1989-02-14', 'P', 'O', 'Bidan', 'Jl. Nuri No. 14, Magelang', '82416161616'),
(3471098765432109, 'Chandra Wijaya', '1978-12-20', 'L', 'B', 'Mahasiswa', 'RS Umum Daerah, Jl. Diponegoro', '082145678901'),
(3505050505950005, 'Eko Prasetyo', '1995-05-05', 'L', 'O', 'Programmer', 'Jl. Tulip No. 5, Surabaya', '89655443322'),
(3505151515820015, 'Intan Permata', '1982-03-15', 'P', 'A', 'Notaris', 'Jl. Kakaktua No. 15, Malang', '89817171717'),
(3606060606800006, 'Herman Susanto', '1980-06-06', 'L', 'A', 'Pilot', 'Jl. Cempaka No. 6, Medan', '81122334455'),
(3606161616990016, 'Kartika Dewi', '1999-04-16', 'P', 'B', 'Desainer Grafis', 'Jl. Kasuari No. 16, Palembang', '81418181818');

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
  `tekanan_darah` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `keluhan` varchar(500) NOT NULL,
  `nama_dokter` varchar(32) NOT NULL,
  `berat` int NOT NULL,
  `tinggi` int NOT NULL,
  `layanan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_riwayat`
--

INSERT INTO `tb_riwayat` (`no_periksa`, `no_rm`, `tanggal_periksa`, `tindakan`, `diagnosa`, `resep`, `tekanan_darah`, `keluhan`, `nama_dokter`, `berat`, `tinggi`, `layanan`) VALUES
(250108001, 3171012304850001, '2025-01-15', 'Anamnesis, pemeriksaan suhu, pemeriksaan tenggorokan', 'Influenza', 'Paracetamol, Vitamin C', '120/80 mmHg', 'Demam, batuk, pilek', 'Bd. Diah Lestari', 70, 175, 'Umum'),
(250108002, 3171012304850001, '2025-01-06', 'Anamnesis, pemeriksaan fisik abdomen (perut)', 'Gastritis', 'Antasida, Omeprazole', '110/70 mmHg', 'Nyeri perut, mual', 'Bd. Diah Lestari', 72, 175, 'Umum');

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
  ADD PRIMARY KEY (`no_periksa`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_antrian`
--
ALTER TABLE `tb_antrian`
  MODIFY `no_antrian` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
