# RESPONSI 1 MOBILE


## Informasi Pengembang

* NAMA: BILQIS SABRINA SHATILA
* NIM: H1D023002
* SHIFT BARU: F
* SHIFT AWAL: H

---

## Video Demo Aplikasi



https://github.com/user-attachments/assets/497fc779-4ea1-45ca-acc0-48aa0d617ebe




---

## Penjelasan Alur Data (API ke Layar)

* Inisiasi Permintaan Data : Alur dimulai ketika tampilan (UI/Layar) aplikasi memerlukan data baru. Ini bisa dipicu saat pengguna membuka screen tertentu atau melakukan aksi seperti menekan tombol refresh. Layar akan meminta data ini dari layer di aplikasi yang bertugas menangani logika bisnis.

* Pemanggilan ke API : Aplikasi kemudian menyusun permintaan formal (berupa request HTTP) ke alamat API spesifik di server. Proses ini dijalankan oleh layer jaringan di aplikasi Android Studio.

* Penerimaan Data Mentah (JSON Response): Server merespons dengan mengirimkan data yang diminta. Data ini umumnya berbentuk teks terstruktur yang padat, yaitu JSON. Data JSON ini adalah raw data yang kembali diterima oleh aplikasi Android.

* Transformasi Data (Parsing): Data JSON yang diterima tidak dapat langsung ditampilkan. Aplikasi harus melakukan proses parsing atau deserialization. Dalam proses ini, teks JSON diuraikan, dan setiap elemen data (misalnya, nama produk, harga, deskripsi) diubah menjadi objek data (model) yang terstruktur dan siap digunakan oleh kode program Android.

* Penyajian di Layar (Display): Objek data yang sudah bersih dan terstruktur ini kemudian dikirim kembali ke Layar (UI). Komponen-komponen UI (seperti TextView, RecyclerView, atau ImageView) mengambil nilai dari objek data tersebut dan menyajikannya secara visual kepada pengguna.

Singkatnya:

Layar Minta -> Aplikasi Kirim API -> Server Beri JSON -> Aplikasi Parse Jadi Objek -> Objek Tampil di Layar.
