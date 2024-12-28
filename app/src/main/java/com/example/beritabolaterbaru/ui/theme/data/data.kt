package com.example.beritabolaterbaru.ui.theme.data

import com.example.beritabolaterbaru.R
import com.example.beritabolaterbaru.model.BeritaBolaTerbaru

/**
 * Kelas Data yang digunakan untuk memuat daftar berita bola terbaru.
 * Kelas ini berfungsi untuk menyediakan data dummy yang dapat digunakan dalam aplikasi.
 */
class Data {
    /**
     * Memuat daftar berita bola terbaru.
     *
     * @return List<BeritaBolaTerbaru> Daftar berita yang telah dimuat.
     */
    fun loadBeritaBolaTerbaru(): List<BeritaBolaTerbaru> {
        return listOf(
            BeritaBolaTerbaru(
                id = 1, // ID unik untuk berita pertama
                stringResourceId = R.string.beritabolaterbaru1, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.real_madrid_vs_barcelona, // ID sumber daya gambar untuk berita
                detail = "El Clasico kembali digelar dengan Real Madrid menghadapi Barcelona. Pertandingan ini menjadi salah satu yang paling ditunggu di Liga Spanyol, penuh dengan rivalitas dan aksi mendebarkan. " +
                        "Real Madrid dan Barcelona menunjukkan performa terbaik mereka, dengan Madrid menguasai 55% penguasaan bola. Lionel Messi mencetak gol pembuka di menit ke-32 dengan tendangan bebas yang brilian. " +
                        "Namun, Karim Benzema menyamakan kedudukan di menit ke-78 dengan aksi solo yang menakjubkan, sebelum Ansu Fati mencetak gol kemenangan di menit ke-85, membawa Barcelona meraih kemenangan 2-1. " +
                        "Statistik menunjukkan Barcelona memiliki 4 tembakan tepat sasaran dibandingkan 3 dari Madrid, menunjukkan efektivitas dalam menyerang. Hasil ini semakin memperketat persaingan gelar La Liga."
            ),
            BeritaBolaTerbaru(
                id = 2, // ID unik untuk berita kedua
                stringResourceId = R.string.beritabolaterbaru2, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.timnasindonesia_u17, // ID sumber daya gambar untuk berita
                detail = "Timnas Indonesia U17 berhasil meraih kemenangan telak 3-0 atas lawannya dalam laga kualifikasi Piala Asia U17 yang digelar di Stadion Gelora Bung Karno. " +
                        "Pertandingan ini menjadi momen bersejarah bagi tim muda Indonesia, di mana gol-gol dicetak oleh tiga pemain berbeda: Raka, Andi, dan Budi, yang menunjukkan kedalaman skuad. " +
                        "Dengan permainan solid dari lini belakang, Indonesia tidak memberi peluang kepada lawan untuk mencetak gol. Pelatih timnas mengungkapkan rasa bangga atas pencapaian ini dan menekankan pentingnya persiapan menuju babak selanjutnya. " +
                        "Ini adalah langkah awal yang penting bagi generasi muda sepak bola Indonesia, dengan harapan untuk tampil di Piala Asia U17."
            ),
            BeritaBolaTerbaru(
                id = 3, // ID unik untuk berita ketiga
                stringResourceId = R.string.beritabolaterbaru3, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.ciesha, // ID sumber daya gambar untuk berita
                detail = "Ciesha, pemain muda berbakat asal Indonesia, menarik perhatian klub-klub Eropa setelah penampilannya yang gemilang di liga domestik. " +
                        "Dengan skill dribbling yang mengesankan dan kemampuan mencetak gol dari berbagai posisi, Ciesha diharapkan bisa menjadi salah satu bintang masa depan sepak bola Indonesia. " +
                        "Dalam 10 pertandingan terakhir, ia mencetak 7 gol dan memberikan 5 assist, membuktikan dirinya sebagai salah satu pemain kunci dalam tim. " +
                        "Banyak pengamat menyarankan agar ia segera melakukan transfer ke klub Eropa untuk mengembangkan potensinya lebih lanjut. " +
                        "Dengan bakat yang dimilikinya, ia bisa menjadi aset berharga bagi klub-klub yang membutuhkan winger kreatif."
            ),
            BeritaBolaTerbaru(
                id = 4, // ID unik untuk berita keempat
                stringResourceId = R.string.beritabolaterbaru4, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.barcelona, // ID sumber daya gambar untuk berita
                detail = "FC Barcelona baru saja mengumumkan rekrutan baru mereka, yang diharapkan dapat memperkuat tim jelang musim depan. " +
                        "Dengan strategi transfer yang agresif, Barcelona berusaha untuk kembali ke jalur kemenangan setelah beberapa musim yang sulit. " +
                        "Pelatih tim mengungkapkan keyakinannya bahwa para pemain baru ini akan membawa perubahan positif dan meningkatkan performa tim secara keseluruhan. " +
                        "Dari analisis, Barcelona membutuhkan lebih banyak kedalaman skuat di lini tengah dan pertahanan, dan rekrutan terbaru diharapkan bisa mengisi kekosongan tersebut. " +
                        "Keberhasilan dalam transfer ini akan sangat penting untuk ambisi mereka dalam meraih gelar di La Liga dan Liga Champions."
            ),
            BeritaBolaTerbaru(
                id = 5, // ID unik untuk berita kelima
                stringResourceId = R.string.beritabolaterbaru5, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.raphinha2, // ID sumber daya gambar untuk berita
                detail = "Raphinha, winger Brasil yang kini bermain untuk Leeds United, tampil gemilang di awal musim ini. " +
                        "Dengan kecepatan dan tekniknya, Raphinha berhasil mencetak beberapa gol penting dan memberikan assist kepada rekan-rekannya. " +
                        "Dalam 8 pertandingan terakhir, ia mencetak 5 gol dan 3 assist, menunjukkan konsistensi yang sangat dibutuhkan oleh tim. " +
                        "Pelatih mengaku puas dengan perkembangan pemainnya dan berharap Raphinha dapat terus menunjukkan performa terbaiknya di setiap pertandingan. " +
                        "Dengan performa seperti ini, Raphinha bisa menjadi target bagi klub-klub besar Eropa di bursa transfer mendatang."
            ),
            BeritaBolaTerbaru(
                id = 6, // ID unik untuk berita keenam
                stringResourceId = R.string.beritabolaterbaru6, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.mu2, // ID sumber daya gambar untuk berita
                detail = "Manchester United baru saja meraih kemenangan penting dalam laga Premier League yang penuh tekanan. " +
                        "Dengan strategi permainan yang solid, tim berhasil mengalahkan rival berat, Arsenal, dan mengamankan posisi mereka di papan atas klasemen. " +
                        "Dalam pertandingan tersebut, Manchester United mencatatkan 60% penguasaan bola dan 10 tembakan, 5 di antaranya tepat sasaran. " +
                        "Gol kemenangan dicetak oleh Marcus Rashford di menit ke-76 setelah melakukan serangan balik cepat. " +
                        "Pelatih tim menyoroti pentingnya kerja sama tim dan disiplin dalam permainan sebagai kunci sukses mereka."
            ),
            BeritaBolaTerbaru(
                id = 7, // ID unik untuk berita ketujuh
                stringResourceId = R.string.beritabolaterbaru7, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.theo, // ID sumber daya gambar untuk berita
                detail = "Theo Hernandez, bek kiri AC Milan, menunjukkan performa luar biasa di Serie A. " +
                        "Dengan kecepatan dan ketangguhannya, Theo sering kali membantu serangan tim dari sektor sayap. " +
                        "Dalam pertandingan terakhir, ia mencetak gol spektakuler yang membantu timnya meraih tiga poin krusial. " +
                        "Statistik menunjukkan bahwa ia berhasil melakukan 3 tekel sukses, 5 umpan kunci, dan 2 intersep selama pertandingan, menegaskan perannya dalam kedua aspek permainan. " +
                        "Dengan performa seperti ini, Theo menjadi salah satu bek terpenting di liga."
            ),
            BeritaBolaTerbaru(
                id = 8, // ID unik untuk berita kedelapan
                stringResourceId = R.string.beritabolaterbaru8, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.derby, // ID sumber daya gambar untuk berita
                detail = "Derby London kembali menghadirkan drama yang mendebarkan ketika Arsenal dan Chelsea bertemu di Stamford Bridge. " +
                        "Pertandingan ini tidak hanya penting untuk rivalitas kedua tim, tetapi juga untuk posisi di klasemen. " +
                        "Arsenal berhasil mencetak gol pembuka di menit ke-15 melalui tendangan Pierre-Emerick Aubameyang. " +
                        "Namun, Chelsea menyamakan kedudukan melalui tendangan bebas yang brilian dari Mason Mount di menit ke-60. " +
                        "Pertandingan berakhir imbang 2-2, dengan banyak peluang dan aksi seru, menjadikannya salah satu pertandingan yang paling dikenang di musim ini."
            ),
            BeritaBolaTerbaru(
                id = 9, // ID unik untuk berita kesembilan
                stringResourceId = R.string.beritabolaterbaru9, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.yamal, // ID sumber daya gambar untuk berita
                detail = "Yamal, pemain muda yang baru saja debut di La Liga, menjadi sorotan setelah berhasil mencetak gol di pertandingan pertamanya. " +
                        "Dengan keberanian dan skill yang ditunjukkan, banyak pengamat percaya bahwa ia akan menjadi salah satu bintang masa depan sepak bola Spanyol. " +
                        "Dalam debutnya, ia juga mencatatkan 1 assist dan menunjukkan kemampuan beradaptasi yang cepat dengan permainan tim senior. " +
                        "Dengan penampilan yang mengesankan, Yamal bisa menjadi pilihan utama bagi pelatih di pertandingan mendatang."
            ),
            BeritaBolaTerbaru(
                id = 10, // ID unik untuk berita kesepuluh
                stringResourceId = R.string.beritabolaterbaru10, // ID sumber daya string untuk judul berita
                imageResourceId = R.drawable.lewa, // ID sumber daya gambar untuk berita
                detail = "Robert Lewandowski kembali membuktikan kualitasnya sebagai salah satu penyerang terbaik dunia setelah mencetak hat-trick dalam pertandingan terakhirnya. " +
                        "Dengan teknik finishing yang brilian, Lewandowski menjadi kunci kemenangan tim dan semakin memperkuat posisinya di daftar top skor liga. " +
                        "Statistik menunjukkan bahwa ia memiliki 7 tembakan, 5 di antaranya tepat sasaran, dan kontribusinya sangat vital dalam membawa timnya meraih gelar juara. " +
                        "Dengan performa seperti ini, Lewandowski menunjukkan bahwa ia masih memiliki banyak kontribusi untuk tim dan liga."
            )
        )
    }
}