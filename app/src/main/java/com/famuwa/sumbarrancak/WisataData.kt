package com.famuwa.sumbarrancak

object WisataData {

    private val wisataNames = arrayOf(
        "Lembah Harau",
        "Jam Gadang",
        "Istana Payaruyuang",
        "Danau Kembar",
        "Pantai Air Manis",
        "Pulau Mandeh",
        "Pantai Padang",
        "Benteng Fort de Kock",
        "Lobang Jepang",
        "Pulau Sikuai"
    )

    private val wisataLocations = arrayOf(
        "Kab. Lima Puluh Kota",
        "Bukittinggi",
        "Kab. Tanah Datar",
        "Kab. Solok",
        "Padang",
        "Kab. Pesisir Selatan",
        "Padang",
        "Bukittinggi",
        "Bukittinggi",
        "Padang"
    )

    private val wisataDetails = arrayOf(
        "Lembah Harau adalah sebuah ngarai dekat Kota Payakumbuh di Kabupaten Limapuluh Koto, provinsi Sumatra Barat. Lembah Harau diapit dua bukit cadas terjal dengan ketinggian mencapai 150 meter berupa batu pasir yang terjal berwarna-warni, dengan ketinggian 100 sampai 500 meter. Topografi Cagar Alam Harau adalah berbukit-bukit dan bergelombang. " +
                "\n\nTinggi dari permukaan laut adalah 500 sampai 850 meter, bukit tersebut antara lain adalah Bukit Air Putih, Bukit Jambu, Bukit Singkarak, dan Bukit Tarantang. Berjalan menuju Lembah Harau amat menyenangkan. Dengan udara yang masih segar, anda bisa melihat keindahan alam sekitarnya. Tebing-tebing granit yang menjulang tinggi dengan bentuknya yang unik mengelilingi lembah. Tebing-tebing granit yang terjal ini mempunyai ketinggian 80 meter hingga 300 meter.",

        "Jam Gadang adalah menara jam yang menjadi penanda Kota Bukittinggi, Sumatra Barat, Indonesia. Menara jam ini memiliki jam dengan ukuran besar di empat sisinya sehingga dinamakan Jam Gadang, sebutan bahasa Minangkabau yang berarti jam besar Jam Gadang menjadi saksi peristiwa penting pada masa sekitar kemerdekaan Indonesia, seperti pengibaran bendera merah putih (1945), Demonstrasi Nasi Bungkus (1950), dan pembunuhan 187 orang oleh militer Indonesia atas tuduhan pemberontak (1959)." +
                "\n\nJam Gadang telah dijadikan sebagai objek wisata dengan diperluasnya taman di sekitarnya. Taman tersebut menjadi ruang interaksi masyarakat baik pada hari kerja maupun pada hari libur. Acara-acara yang sifatnya umum biasanya diselenggarakan di sini.",

        "Istano Basa yang lebih terkenal dengan nama Istana Pagaruyung adalah museum berupa replika istana Kerajaan Pagaruyung terletak di Nagari Pagaruyung, Kecamatan Tanjung Emas, Kabupaten Tanah Datar, Sumatra Barat. Istana ini berjarak lebih kurang 5 kilometer dari Batusangkar. " +
                "\n\nIstana ini merupakan objek wisata budaya yang terkenal di Sumatra Barat. Istano Basa yang berdiri sekarang sebenarnya adalah replika dari yang asli. Istano Basa yang asli terletak di atas bukit Batu Patah dan dibakar habis pada tahun 1804 saat terjadi Perang Padri. Istana baru didirikan kembali tetapi terbakar lagi pada tahun 1966.",

        "Sesuai dengan namanya, Danau Kembar merupakan dua buah danau yang terletak saling berdekatan dan memiliki ukuran yang hampir sama. Danau yang posisinya lebih tinggi Justru dinamakan Danau Dibawah, sedangkan danau yang lebih rendah dinamakan Danau Diatas. " +
                "\n\nKedua danau ini memiliki perbedaan yang kontras, diantaranya jika danau Diatas merupakan hulu dari Sungai Batanghari yang membelah Pulau Sumatera dan bermuara di Selat Malaka, beda halnya dengan Danau Dibawah yang hingga saat ini belum diketahui secara pasti kemana air dari Danau Dibawah di alirkan karena tidak temui sungai yang berhulu di danau ini.",

        "Pantai Air Manis (bahasa Minangkabau: Pantai Aia Manih) adalah pantai yang terletak kurang lebih 10 km ke selatan dari pusat Kota Padang. Lokasinya Berada di belakang Gunung Padang atau tepatnya di Kecamatan Padang Selatan, Kota Padang. Pantai ini merupakan salah satu tujuan wisata populer yang selalu ramai dikunjungi oleh masyarakat. Pantai ini dikenal dengan ombaknya yang kecil, memiliki panorama yang indah di sisi utaranya dan legenda Malin Kundang.",

        "Wisata Pulau Mandeh memiliki pesona alam laut yang sangat memesona. Beberapa pulau di wisata Pulau Mandeh ini memiliki berbagai keunikan tersendiri. Kamu bisa menikmati pemandangan alam dari ketinggian dan menyeberang dari pulau ke pulau untuk menikmati alam dan pantainya dengan melakukan berbagai aktivitas menarik.",

        "Pantai Padang atau populer dengan sebutan Taplau (singkatan dari tapi lauik, bahasa Minang yang artinya tepi laut) adalah sebuah pantai yang terletak di Kota Padang, Sumatra Barat. Pantai ini terletak pada kawasan padat perkotaan di Kecamatan Padang Barat, dan membentang dari daerah Purus hingga muara Batang Arau. Pantai ini berjarak kurang lebih 23 km dari Bandar Udara Internasional Minangkabau atau 30 menit perjalanan darat dengan mobil.",

        "Fort de Kock adalah benteng peninggalan Belanda yang berdiri di Kota Bukittinggi, Sumatra Barat, Indonesia. Benteng ini didirikan oleh Kapten Bouer pada tahun 1825 pada masa Hendrik Merkus de Kock sewaktu menjadi komandan Der Troepen dan Wakil Gubernur Jenderal Hindia Belanda, karena itulah benteng ini terkenal dengan nama Benteng Fort De Kock. " +
                "\n\nBenteng yang terletak di atas Bukit Jirek ini digunakan oleh Tentara Belanda sebagai kubu pertahanan dari gempuran rakyat Minangkabau terutama sejak meletusnya Perang Paderi pada tahun 1821-1837. Di sekitar benteng masih terdapat meriam-meriam kuno periode abad ke 19. Pada tahun-tahun selanjutnya, di sekitar benteng ini tumbuh sebuah kota yang juga bernama Fort de Kock, kini Bukittinggi." +
                "\n\nBenteng ini sebenarnya diberi nama 'Sterreschans' yang memiliki arti benteng pelindung. Pada 1897, Benteng Sterreschan dibongkar dan dijual menurut bunyi surat Gubernur Sumatra Barat tanggal 27 Februari 1897 dengan besluit Residen Padang Darat tanggal 6 Maret 1897 No. 1054 dan tanahnya diambil alih oleh pemerintah Belanda. Berikutnya tahun 1888 Belanda menetapkan batas kota Bukittinggi (Fort de Kock) menurut besluit Gouverneur General tanggal 1 Desember 1988.",

        "Lubang Jepang Bukittinggi (juga dieja Lobang Jepang) adalah salah satu objek wisata sejarah yang ada di Kota Bukittinggi, Sumatra Barat, Indonesia. Lubang Jepang merupakan sebuah terowongan (bunker) perlindungan yang dibangun tentara pendudukan Jepang sekitar tahun 1942 untuk kepentingan pertahanan.",

        "Pulau Sikuai merupakan salah satu pulau yang terletak di sisi barat pulau Sumatra. Secara administrasi pemerintahan, pulau ini masuk ke dalam wilayah kecamatan Bungus Teluk Kabung, kota Padang, provinsi Sumatra Barat, Indonesia. Pulau ini terletak sekitar setengah mil laut dari pusat kota dan dapat dicapai dengan menggunakan transportasi laut seperti kapal, melalui pelabuhan Muara dalam waktu tempuh sekitar 45 menit dan dari dermaga Airud Bungus dalam waktu tempuh sekitar 35 menit."
    )

    private val wisataImages = intArrayOf(
        R.drawable.lembah_harau,
        R.drawable.jam_gadang,
        R.drawable.istana_pagaruyuang,
        R.drawable.danau_kembar,
        R.drawable.pantai_air_manis,
        R.drawable.pulau_mandeh,
        R.drawable.pantai_padang,
        R.drawable.benteng,
        R.drawable.lobang_jepang,
        R.drawable.pulau_sikuai
    )

    val listDataWisata : ArrayList<Wisata>
        get(){
            val listWisata = arrayListOf<Wisata>()

            for(position in wisataNames.indices){
                val wisata = Wisata()
                wisata.wisataName = wisataNames[position]
                wisata.wisataLocation = wisataLocations[position]
                wisata.wisataDetail = wisataDetails[position]
                wisata.wisataPhoto = wisataImages[position]
                listWisata.add(wisata)
            }

            return listWisata
        }
}