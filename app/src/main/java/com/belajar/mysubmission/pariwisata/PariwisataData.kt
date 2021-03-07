package com.belajar.mysubmission.pariwisata

import com.belajar.mysubmission.R

object PariwisataData {
    private val namaTempatWisata = arrayOf(
        "Nusa Penida",
        "Danau Toba",
        "Taman Laut Bunaken",
        "Wakatobi",
        "Kepulauan Raja Ampat",
        "Gunung Bromo",
        "Pulau Komodo",
        "Candi Borobudur",
        "Tana Toraja",
        "Gili Trawangan",
        "Goa Gong",
        "Danau Kelimutu",
        "Ngarai Sianok",
        "Kawah Ijen"
    )

    private val lokasiTempatWisata = arrayOf(
        "Bali",
        "Sumatra Utara",
        "Sulawesi Utara",
        "Sulawesi Tenggara",
        "Papua Barat",
        "Jawa Timur",
        "Nusa Tenggara Timur",
        "Jawa Tengah",
        "Sulawesi Selatan",
        "Nusa Tenggara Barat",
        "Jawa Timur",
        "Nusa Tenggara Timur",
        "Sumatra Barat",
        "Jawa Timur"
    )

    private val deskripsiTempatWisata = arrayOf(
        "Nusa Penida adalah sebuah pulau kecil yang berada sebelah tenggara pulau Bali, dan terpisah oleh selat Badung. Di dekat pulau ini, terdapat 2 pulau kecil lain, yaitu pulau Nusa Lembongan dan pulau Nusa Ceningan. Ketiga pulau kecil yang ada di bagian tenggara pulau Bali, memiliki keunikan dan daya tarik tersendiri dan ada perbedaan satu sama lain. Ketiga pulau masuk dalam wilayah pemerintahan kabupaten Klungkung, provinsi Bali. Arti kata Nusa Penida berasal dari bahasa Bali, Nusa artinya pulau dan Penida berasal dari dua kata, Ped dan Ida. Ped berarti kematian serta Ida berarti kekuasaan. Maka Nusa Penida dapat berarti pulau yang memiliki kekuasaan besar yang mematikan.",
        "Danau Toba adalah sebuah keajaiban alam yang sangat menakjubkan. Danau ini diperkirakan terbentuk dari letusan dahsyat sebuah gunung api, Gunung Toba, yang terjadi sekitar 74.000 tahun yang lalu. Dengan luas lebih dari 1.145 kilometer persegi dan kedalaman 450 meter, Danau Toba sebenarnya lebih mirip lautan daripada danau. Di tengah danau vulkanik terbesar di dunia ini juga terdapat sebuah pulau yang berukuran cukup besar, yaitu Pulau Samosir.\n\nDanau Toba menjadi tempat yang sempurna untuk bersantai, karena udaranya sangat sejuk dan suasananya pun amat tenang. Tentu saja, sebab letak Danau Toba berada di 900 meter di atas permukaan laut. Selain panorama danau yang memukau, wisatawan juga akan disuguhkan dengan keindahan pemandangan deretan pegunungan dan pepohonan hijau yang menyegarkan mata.",
        "Bunaken merupakan taman nasional yang telah ditunjuk oleh Menteri Kehutanan di tahun 1991 sebagai objek wisata. Memiliki lokasi yang menjadi perwakilan dari ekosistem perairan tropis Indonesia. Terdiri dari ekosistem hutan bakau, padang lamun hingga terumbu karang dan ekosistem daratan ataupun pesisir. Pulau yang ada di dalamnya ini memang kaya akan flora dan fauna dimana Taman Nasional Bunaken memiliki 13 genera atau genus karang hidup dengan dominasi jenis terumbu karang tepi dan terumbu karang penghalang. Ada sekitar 91 jenis ikan yang hidup di perairan ini. Misalnya saja seperti ikan kuda gusumi, lolosi ekor kuning hingga ila gasi.",
        "Pulau Wakatobi merupakan bagian taman nasional yang ada di Indonesia. Wakatobi sendiri adalah sebuah kabupaten yang terdiri dari 4 pulau: Pulau Wangi-Wangi, Pulau Kaledupa, Pulau Tomia, dan Pulau Binongko. Semuanya adalah pulau indah. Semuanya menarik. Juga menawarkan sesuatu yang istimewa bagi Anda. Bagi Anda yang sedang mencari referensi lokasi wisata, berikut ini berbagai lokasi di Pulau Wakatobi yang wajib Anda kunjungi.\n\nMasing-masing pulau di Wakatobi memiliki keistimewaan sendiri. Pulau Wangi-Wangi identik dengan resortnya yang cantik. Anda yang ingin menyewa peralatan diving tidak perlu bingung. Jasa penyewaan alat diving mudah sekali ditemukan di sini. Pulau Kaledupa terkenal karena memiliki table coral dengan ukuran 2-3 meter. Berbeda dengan Pulau Binongko, pulau terbesar di antara pulau lain di Wakatobi, lebih terkenal dengan Pulau Tukang Besi. Ini tidak lepas dari masyarakatnya yang menjadi pandai besi dan membuat parang serta barang-barang dari logam. Di Pulau Binongko ini, pulau paling ujung Kabupaten Wakatobi, Anda bisa melihat lumba-lumba yang berenang mengiringi laju perahu motor.",
        "Raja Ampat atau Empat Raja merupakan 4 pulau indah yang merupakan penghasil lukisan batu kuno. Empat pulau utama yang dimaksud adalah Waigeo, Salawati, Batanta, dan Misool. Nama-nama tersebut berasal dari mitos lokal dari warga di sekitar pulau Raja Ampat. Keindahan dan kemegahan dari objek wisata populer asal Indonesia ini mampu mengundang para wisatawan dari seluruh dunia untuk datang ke sini dan merasakan pengalaman sekaligus pemandangan yang tidak akan terlupakan.\n\nDengan wilayah pulau mencakup hingga 4,6 juta hektar tanah dan laut, kita bisa menemukan 540 jenis karang, 1.511 spesies ikan, serta 700 jenis moluska. Menurut laporan The Nature Conservancy and Conservation International, ada sekitar 75% spesies laut dunia yang tinggal di pulau indah nan menakjubkan ini.",
        "Gunung Bromo adalah gunung yang paling terkenal di Jawa Timur dengan kunjungan yang paling ramai setiap tahunnya. Gunung Bromo memiliki ketinggian 2.392 Meter dari atas permukaan laut dan berada dalam empat lingkup kabupaten, yaitu Probolinggo, Pasuruan, Lumajang dan Kabupaten Malang. Keadaan alam gunung Bromo bertautan pula dengan lembah, ngarai, caldera atau lautan pasir dengan luas sekitar 10 Km. Gunung Bromo juga termasuk dalam satu kawasan Bromo Tengger Semeru National Park, dimana terdapat beberapa obyek wisata yang bisa dikunjungi seperti, Gunung Semeru, Gunung Tengger, Gunung Batok, beberapa danau dan Gunung Bromo sendiri.\n\nMeskipun bukan salah satu gunung tertinggi di Indonesia, namun keindahan Gunung Bromo tidak ada duanya dan membuat para pengunjung dapat merasakan pemandangan yang fantastis dan spektakuler. Wisatawan dapat berkuda dan mendaki gunung bromo untuk menikmati keindahan yang menawan saat matahari terbit dan terbenam\n\nSelain keindahan yang tersimpan di Gunung Bromo, Yadna Kasada atau Upacara Kasodo lah yang membuat Gunung Bromo menjadi tujuan destinasi utama setiap tahunnya. Upacara Kasodo digelar setiap tahun pada bulan purnama di bulan Desember atau January.",
        "Pulau Komodo adalah salah satu dari 7 Keajaiban Dunia (hasil voting 2011).  Taman Nasional Komodo terdiri dari 3 pulau besar, Pulau Komodo, Pulau Rinca, dan Pulau Padar, dan juga pulau-pulau kecil lainnya. Luas taman nasional ini secara keseluruhan adalah 1.817Km2. \n\nPulau Komodo terletak di ujung paling barat Provinsi Nusa Tenggara Timur. Di pulau Komodo, hewan Komodo hidup dan berkembang biak dengan baik, menurut data, hingga pertengahan 2009, pulau ini dihuni sekitar 1300 ekor komodo (+/- 2500 ekor di semua Pulau di  TM. Komodo).  Komodo adalah species kadal terbesar di dunia, dengan panjang rata-rata 2-3 meter, dan berat tubuh sedikitnya 90Kg.\n\nTaman Nasional Komodo yang terdiri dari pulau-pulau tentunya dipisahkan oleh laut. Kehidupan bawah laut di sini pun tak kalah indahnya. Anda dapat menemukan 385 spesies karang indah, 70 jenis bunga karang, 10 jenis lumba-lumba,  6 macam paus, penyu hijau, berbagai jenis hiu, dan ikan pari.\n\nSaat berada di sini, banyak hal yang bisa dilakukan.  Di pulau ini Anda diajak untuk trekking mengikuti jalur yang telah dirancang dan aman. Di Pulau Komodo, Anda harus mendaki Gunung Ara setinggi 538 m di atas permukaan laut selama 3 atau 4 jam. Di Pulau Rinca, Anda harus melakukan trekking  selama 1,5 jam. Jika anda beruntung, Anda dapat melihat komodo yang sedang menyerang mangsanya, berkelahi, atau sedang berjalan perlahan sepanjang jalan. Selain bisa mengamati perilaku dan mengeksplorasi habitat dari hewan purba ini, Pulau Komodo juga menawarkan panorama alam yang menakjubkan.\n\nSalah satunya adalah pantai dengan pasir berwarna merah muda yang dikenal dengan nama “Pink Beach“.\n\nPantai seperti ini hanya terdapat tujuh di seluruh dunia sehingga menjadikannya sebagai salah satu tujuan wisata Indonesia yang mendunia.",
        "Candi Borobudur adalah candi Buddha yang berlokasi di Magelang, Jawa Tengah, Indonesia. Lokasi candi kira-kira 100 km ke barat daya Semarang, 86 km ke barat Surakarta, dan 40 km ke barat laut Yogyakarta.Kuil berbentuk stupa ini didirikan oleh umat Buddha Mahayana sekitar tahun 800 Masehi pada masa pemerintahan dinasti Syailendra. Borobudur adalah candi Buddha terbesar di dunia, serta salah satu monumen Buddha terbesar di dunia.Monumen ini terdiri dari enam teras berbentuk persegi di mana ada tiga halaman melingkar, dindingnya dihiasi dengan 2.672 panel relief dan awalnya ada 504 patung Buddha.\n\nBerdiri kokoh nan megah di Jawa Tengah, Borobudur memang menyimpan pesona yang luar biasa, sehingga mampu membuat setiap wisatawan berdecak kagum. Tak hanya menyimpan cerita sejarah yang berharga, Borobudur juga menyuguhkan pesona wisata yang menarik untuk para wisatawan. Kemegahan Candi Borobudur yang memikat tak hanya menarik untuk dikunjungi saat siang hari, Sobat Pesona dapat menikmati keindahan serta kemewahan candi Borobudur saat matahari perlahan-lahan terbit di ufuk timur. Sobat Pesona yang ingin  berburu keindahan sunrise, bisa datang ke sini lebih awal ya, yakni  jam 5 pagi.",
        "Tana Toraja merupakan salah satu kabupaten di Sulawesi Selatan yang memiliki berbagai macam objek wisata yang mengagumkan. Wisata alam yang eksotis maupun keragaman budayanya akan membuat wisatawan berdecak kagum. Tana Toraja dapat ditempuh melalui jalur darat maupun udara. Jalur darat biasanya akan memakan waktu 8 sampai 9 jam. Sementara, jika melalui jalur udara kemungkinan hanya memakan waktu satu jam saja. Sesampainya di Tana Toraja, wisatawan akan dihadapkan dengan berbagai macam pilihan wisata seperti Negeri di Atas Awan, bukit Buntu Burake, dan masih banyak lagi.",
        "Gili Trawangan adalah salah satu pulau yang paling terkenal di Lombok. Pulau kecil yang berada di sebelah Barat Laut Pulau Lombok ini tak hanya menyuguhkan pemandangan yang indah saja. Pantai dan pemandangan alamnya akan membuat Anda takjub. Anda bisa melakukan berbagai aktivitas yang Anda gemari selama sehari penuh. Selain itu, Anda juga bisa bergabung dalam pesta-pesta pantai di malam harinya.\n\nDi Gili Trawangan Anda akan menemui fasilitas-fasilitas yang berstandar internasional. Karena Gili ini sangat terkenal di kalangan turis mancanegara, serta mayoritas turis yang berkunjung adalah turis dari luar negeri. Sehingga pelayanan yang  ada di Gili ini disesuaikan dengan kebutuhan turis-turis mancanegara tersebut. Sebagai contoh, Gili Trawangan adalah satu-satunya pulau yang memiliki sebuah Bar Irlandia. Gili Trawangan terbilang relatif kecil, dengan bentangan sekitar 3 Km dari Utara ke Selatan, dan sekitar 2 Km dari Barat ke Timur. Di Gili ini, jarang sekali ditemui kendaraan bermotor. Transportasi yang paling umum adalah “Cidomo” (semacam kereta kuda) dan sepeda.",
        "Kota Pacitan terkenal dengan julukan kota 1001 gua, dan satu yang terkenal disini adalah tempat wisata Goa Gong Pacitan. Pacitan merupakan wilayah di Jawa Timur yang dikelilingi oleh pegunungan kapur, yang menjadikan tanah di daerah ini kering dan tidak subur. Tanah di permukaan Pacitan memang gersang dan memiliki sedikit unsur hara, namun anugerah Yang Maha Kuasa ternyata bukan terletak di atas permukaan, namun di bawah permukaan tanahnya.\n\nPacitan dianugerahi keindahan bawah tanah yang mempesona berupa gua-gua kapur yang dihiasi stalaktit dan stalakmit. Gua yang paling terkenal dan paling indah adalah Gua Gong. Keindahan Gua Gong tak tertandingi oleh gua-gua lain di Pulau Jawa, bahkan ada yang menyebutkan bahwa Gua Gong adalah Gua terindah di Asia Tenggara.",
        "Danau Kelimutu adalah salah satu tempat wisata yang gambarnya terdapat di alat pembayaran yang beredar di Indonesia untuk nominal uang 5000 rupiah dengan tahun terbit 1992. Keindahan Danau Kelimutu berada di Desa Pemo, Kecamatan Kelimutu, Kabupaten Ende, Nusa Tenggara Timur. Nama Kelimutu sendiri berasal dari kata “Keli” yang artinya gunung dan “Mutu” yang memiliki arti mendidih.\n\nDanau Kelimutu yang dikenal juga dengan danau tiga warna ini memberikan suguhan pemandangan alam yang memanjakan mata setiap wisatawan yang berkunjung dengan kemilau warna warni airnya. Bagi anda yang suka menikmati sunrise dapat berkunjung ke tempat wisata tersebut bersama keluarga atau teman anda. Mari kita kenali Keindahan Kelimutu Lake dan tempat wisata disekelilingnya.",
        "Ngarai Sianok merupakan sebuah lembah sempit yang dikelilingi oleh bukit-bukit bertebing curam yang dihiasi dengan aliran sungai kecil di tengahnya. Kontur Lembah Sianok terbentuk karena proses turunnya sebagian lempengan bumi, sehingga menimbulkan patahan berwujud jurang yang curam. Ngarai ini membentang sejauh 15 km dari sisi selatan Nagari Koto Gadang hingga Nagari Sianok Enam Suku, dengan kedalaman tebing mencapai 100 meter dan lebar celah sekitar 200 meter.\n\nKawasan ini memiliki sebutan lain yaitu, Lembah Pendiam, karena suasananya yang tenang dan damai. Didukung dengan udaranya yang bersih dan sejuk, diiringi latar suara kicauan burung dan gemericik air sungai, ngarai ini cocok sebagai tempat melepaskan beban pikiran dari rutinitas sehari-hari.",
        "Dari Banyuwangi, terdapat pesona kawah Ijen yang baru-baru ini mulai terkenal sampai ke mancanegara. Salah satu daya pikatnya adalah blue fire atau pesona api biru yang menyala dari kawah Gunung Ijen. Di dunia, fenomena blue fire hanya dapat ditemukan di dua tempat yakni di Islandia dan di Indonesia."
    )

    private val ratingTempatWisata = arrayOf(
        4.6,
        4.6,
        4.5,
        4.3,
        4.3,
        4.6,
        4.4,
        4.7,
        4.5,
        4.6,
        4.4,
        4.5,
        4.6,
        4.7
    )

    private val gambarTempatWisata = arrayOf(
        R.drawable.nusa_penida,
        R.drawable.danau_toba,
        R.drawable.taman_laut_bunaken,
        R.drawable.wakatobi,
        R.drawable.raja_ampat,
        R.drawable.gunung_bromo,
        R.drawable.pulau_komodo,
        R.drawable.candi_borobudur,
        R.drawable.tana_toraja,
        R.drawable.gili_trawangan,
        R.drawable.goa_gong,
        R.drawable.danau_kelimutu,
        R.drawable.ngarai_sianok,
        R.drawable.kawah_ijen,
    )

    val listData: ArrayList<Pariwisata>
        get() {
            val list = arrayListOf<Pariwisata>()
            for (position in namaTempatWisata.indices) {
                val pariwisata = Pariwisata()

                pariwisata.nama = namaTempatWisata[position]
                pariwisata.lokasi = lokasiTempatWisata[position]
                pariwisata.deskripsi = deskripsiTempatWisata[position]
                pariwisata.rating = ratingTempatWisata[position]
                pariwisata.foto = gambarTempatWisata[position]
                list.add(pariwisata)
            }
            return list
        }
}
