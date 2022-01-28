package com.famuwa.sumbarrancak

object MakananData {

    private val makananNames = arrayOf(
        "Rendang",
        "Dendeng",
        "Sala Lauak",
        "Sate Padang",
        "Sambalado Tanak"
    )

    private val makananDetails = arrayOf(
        "Rendang atau randang (Jawi: رندڠ) adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.\n" +
                "\n" +
                "Rendang dapat dijumpai di Rumah Makan Padang di seluruh dunia. Masakan ini populer di Indonesia dan negara-negara Asia Tenggara lainnya, seperti Malaysia, Singapura, Brunei, Filipina dan Thailand. Di daerah asalnya, Minangkabau, rendang disajikan di berbagai upacara adat dan perhelatan istimewa. Meskipun rendang merupakan masakan tradisional Minangkabau, teknik memasak serta pilihan dan penggunaan bumbu rendang berbeda-beda menurut daerah.\n" +
                "\n" +
                "Pada 2011, rendang dinobatkan sebagai hidangan yang menduduki peringkat pertama daftar World's 50 Most Delicious Foods (50 Hidangan Terlezat Dunia) versi CNN International. Pada 2018, rendang secara resmi ditetapkan sebagai salah satu dari lima hidangan nasional Indonesia.",

        "Dendeng balado adalah masakan khas Sumatra Barat dibuat dari irisan tipis dan lebar daging sapi yang dikeringkan lalu digoreng kering. Daging goreng ini lalu diberi bumbu balado.",

        "Sala lauak adalah makanan gorengan khas Pariaman, Sumatra Barat yang berbahan dasar tepung beras berwarna kuning kecoklatan. Makanan ini berbentuk bola, mirip comro di Jawa Barat, tetapi alih-alih oncom, isi dari sala lauak biasanya teri atau udang halus. Biasanya teksturnya lembek di dalam dan renyah di permukaan.",

        "Sate Padang adalah sebutan untuk tiga jenis varian sate di Sumatra Barat, yaitu Sate Padang, Sate Padang Panjang dan Sate Pariaman. Sate Padang memakai bahan daging sapi, lidah, atau jerohan dengan bumbu kuah kacang kental ditambah cabai yang banyak sehingga rasanya pedas.",

        "Samba lado tanak adalah sambal masakan khas masyarakat Nagari Sungai Jambu, di pinggang Gunung Marapi, Kabupaten Tanah Datar (sekitar 700 m dari permukaaan laut).\n" +
                "\n" +
                "Penduduk di nagari ini jika makan sangat mementingkan adanya samba lado (sambal) karena suhu di tempat ini sangat dingin. Karena kebiasaan ini, penduduk di nagari-nagari sekitarnya menamakan masyarakat Sungai Jambu dengan sebutan \"Sungai Jambu Gadang Lado\" (Sungai Jambu besar sambal).\n" +
                "\n" +
                "Masyarakat Nagari Sungai Jambu sangat pandai membuat berbagai jenis samba lado, dan salah satunya adalah samba lado tanak. Samba lado tanak diolah dari bahan-bahan cabe yang sudah digiling, santan kelapa yang sudah dimasak, ikan teri, petai, ditambah rempah-rempah lainnya, kemudian semua bahan-bahan tersebut dimasak dalam kuali dengan api dari bahan bakar kayu. Hasil akhirnya mirip kalio namun dengan rasa yang lebih pedas dan warna minyaknya yang kemerahan."
    )

    private val makananImages = intArrayOf(
        R.drawable.rendang,
        R.drawable.dendeng,
        R.drawable.sala,
        R.drawable.sate,
        R.drawable.ladotanak
    )

    val listDataMakanan : ArrayList<Makanan>
        get() {
            val listMakanan = arrayListOf<Makanan>()

            for (position in makananNames.indices){
                val makanan = Makanan()
                makanan.namaMakanan = makananNames[position]
                makanan.deskripsiMakanan = makananDetails[position]
                makanan.photoMakanan = makananImages[position]
                listMakanan.add(makanan)
            }

            return listMakanan
        }
}