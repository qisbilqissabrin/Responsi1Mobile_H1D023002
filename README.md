# RESPONSI 1 MOBILE


## Informasi Pengembang

* NAMA: BILQIS SABRINA SHATILA
* NIM: H1D023002
* SHIFT BARU: F
* SHIFT AWAL: H

---

## Video Demo Aplikasi



https://github.com/user-attachments/assets/c0d42995-35d8-46e0-8f08-329f33f4ac38


---

## Penjelasan Alur Data (API ke Layar)

Alur data pada aplikasi ini dirancang untuk memisahkan logika bisnis dari tampilan, dimulai dari pemanggilan API hingga penyajian data di layar pengguna.

1.  *Inisiasi (Trigger)*
    * Alur dimulai ketika pengguna melakukan aksi (misalnya, menekan tombol) atau saat layar pertama kali dimuat (misalnya, dalam onCreate, onViewCreated, atau useEffect).

2.  *Pemanggilan API (Request)*
    * Lapisan UI (Activity/Fragment/Composable) memanggil sebuah fungsi pada lapisan logika (misalnya, *ViewModel* atau *Presenter*).
    * ViewModel kemudian memanggil fungsi dari *Repository*.
    * Repository bertanggung jawab untuk menentukan sumber data. Dalam kasus ini, ia memanggil *Layanan API* (misalnya, yang dibuat dengan Retrofit, Ktor, atau Dio).
    * Layanan API (menggunakan HTTP Client) membuat panggilan jaringan (HTTP GET, POST, dll.) ke endpoint API yang spesifik di server.

3.  *Respons dan Parsing Data*
    * Server API menerima permintaan, memprosesnya, dan mengirimkan kembali respons, biasanya dalam format *JSON*.
    * HTTP Client di aplikasi menerima data JSON mentah tersebut.
    * Data JSON ini kemudian di-parsing (dideserialisasi) menjadi data model (sering disebut Pojo atau Data Class) yang telah didefinisikan di dalam aplikasi.

4.  *Manajemen State (State Management)*
    * Repository meneruskan objek data yang sudah di-parsing kembali ke ViewModel.
    * ViewModel memperbarui state (keadaan) aplikasi dengan data baru ini. Ini bisa menggunakan mekanisme seperti LiveData, StateFlow, Provider, atau useState.
    * ViewModel juga menangani status lain, seperti Loading (saat menunggu data) atau Error (jika panggilan API gagal).

5.  *Penyajian di Layar (Render)*
    * Lapisan UI (Activity/Fragment) secara aktif "mengamati" (observe) perubahan pada state di ViewModel.
    * Ketika state berubah (misalnya, dari Loading menjadi Success dengan data baru), UI akan secara otomatis memperbarui dirinya sendiri (re-render atau re-compose) untuk menampilkan data baru tersebut kepada pengguna (misalnya, mengisi RecyclerView atau ListView).
