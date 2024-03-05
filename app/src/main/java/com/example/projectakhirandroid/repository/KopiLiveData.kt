package com.example.projectakhirandroid.repository

import com.example.projectakhirandroid.R
import com.example.projectakhirandroid.model.KopiLive

object KopiLiveData {
    private val llNames = arrayOf("Kopi Aceh Gayo Arabika",
        "Kopi Arabika Gayo Aceh",
        "Kopi Arabika Gayo Takengon",
        "Kopi Arabika Gayo Wine",
        "Kopi Arabika Summer",
        "Kopi Atu Lintang",
        "Kopi Sanger",
        "Kopi Gayo Lanang Peaberry",
        "Kopi Luwak Liar",
        "Kopi Robusta Gayo")

    private val llIsFavorite = arrayOf(false, false, false, false, false, false, false, false, false, false)

    private val llThumb = intArrayOf(R.drawable.acehgayoarabika,
        R.drawable.arabikagayoaceh,
        R.drawable.arabikagayotakengon,
        R.drawable.arabikagayowine,
        R.drawable.arabikasummer,
        R.drawable.atulintang,
        R.drawable.kopiarabikaacehgayo,
        R.drawable.kopigayolanangpeaberry,
        R.drawable.kopiluwakliar,
        R.drawable.robustagayo)

    private val llPhoto = intArrayOf(R.drawable.acehgayoarabika,
        R.drawable.arabikagayoaceh,
        R.drawable.arabikagayotakengon,
        R.drawable.arabikagayowine,
        R.drawable.arabikasummer,
        R.drawable.atulintang,
        R.drawable.kopiarabikaacehgayo,
        R.drawable.kopigayolanangpeaberry,
        R.drawable.kopiluwakliar,
        R.drawable.robustagayo)

    private val llCv = arrayOf("Kopi Aceh Gayo Arabika",
        "Kopi Arabika Gayo Aceh",
        "Kopi Arabika Gayo Takengon",
        "Kopi Arabika Gayo Wine",
        "Kopi Arabika Summer",
        "Kopi Atu Lintang",
        "Kopi Sanger",
        "Kopi Gayo Lanang Peaberry",
        "Kopi Luwak Liar",
        "Kopi Robusta Gayo")

    private val llYear = intArrayOf(2, 2, 1, 2, 2, 3, 1, 3, 1, 3)

    private val llBirthday = arrayOf("-", "Mar. 1", "Jan. 23", "Aug. 8", "May. 30", "Feb. 5", "Nov. 13", "Dec. 16", "Apr. 3", "Jun. 29")

    private val llBloodType = arrayOf("-", "Arabika", "Arabika", "Arabika", "Robusta", "Arabika", "Arabika", "Arabika", "Arabika", "Arabika")

    private val llHeight = intArrayOf(200, 200, 500, 250, 500, 1000, 200, 500, 250, 300)

    private val llIcon = intArrayOf(R.drawable.acehgayoarabika,
        R.drawable.arabikagayoaceh,
        R.drawable.arabikagayotakengon,
        R.drawable.arabikagayowine,
        R.drawable.arabikasummer,
        R.drawable.atulintang,
        R.drawable.kopiarabikaacehgayo,
        R.drawable.kopigayolanangpeaberry,
        R.drawable.kopiluwakliar,
        R.drawable.robustagayo)

    private val llDescription = arrayOf("Para penikmat kopi pasti setuju bahwa kopi Gayo Aceh adalah salah satu jenis kopi terbaik di dunia. Karakter kopi Gayo Aceh yang khas membuatnya diburu oleh banyak kalangan, tak hanya penikmat kopi lokal, tetapi juga mancanegara. Biji kopi Gayo asli bahkan dikenal sebagai salah satu yang termahal di dunia dan kopi aceh yang terkenal enak.",
        "Sebelum masa kolonial Belanda berlangsung, para petani di dataran tinggi Aceh dan sekitarnya lebih banyak menanam lada. Setelah berperang melawan kesultanan Aceh berpuluh-puluh tahun, Belanda akhirnya berhasil menguasai daerah Aceh pada 1904. Sejak 1908, Belanda mulai membuka puluhan hektar lahan untuk menanam kopi dan dikelola oleh penduduk setempat.",
        "Kopi Gayo sendiri banyak ditanam di daerah Bener Meriah, Takengon, Gayo Lues, dan sekitarnya. Pemerintah Belanda saat itu menerapkan peraturan bahwa penduduk lokal hanya diperbolehkan mengonsumsi kopi robusta. Sementara itu, varian kopi arabika Gayo diekspor ke luar negeri. Faktor inilah yang menjadi awal mula kenikmatan kopi Gayo terkenal hingga ke seluruh dunia.",
        "Setelah Belanda pergi dari Indonesia, masyarakat mulai mengelola perkebunan kopi di Aceh secara kolektif. Sebagian besar masyarakat bahkan menjadikan kopi sebagai sumber penghasilan utama. Kopi Gayo terkenal dengan rasanya yang tidak pahit, bahkan cenderung manis, serta tingkat keasaman yang rendah. Pada 2010, kopi Gayo mendapatkan fair trade certified dari International Fair Trade Organization.",
        "Kenikmatan kopi Gayo digadang-gadang mirip dengan kopi Blue Mountain dari Jamaika yang sangat terkenal. Kopi Gayo bahkan termasuk salah satu kopi specialty dengan harga termahal. Pada 2020, harga kopi arabika Gayo yang berbentuk green bean sekitar 250 ribu rupiah per kg. Salah satu varietasnya, Kopi Lanang Gayo, bahkan diperkirakan berharga 500 ribu rupiah per kg. Makin penasaran ingin mencicipinya?",
        "Kopi gayo (bahasa Inggris: Gayo coffee) merupakan varietas kopi arabika yang menjadi salah satu komoditi unggulan yang berasal dari Dataran tinggi Gayo, Aceh Tengah, Indonesia.[1] Ia telah mendapatkan Fair Trade Certified™ dari Organisasi Internasional Fair Trade pada tanggal 27 Mei 2010, Kopi gayo menerima sertifikat IG (Indikasi Geografis) diserahkan oleh Kemenkumham RI.[2][3] Kemudian pada Event Lelang Special Kopi Indonesia tanggal 10 Oktober 2010 di Bali, kembali kopi arabika gayo memperoleh peringkat tertinggi saat cupping score.[4] Sertifikasi dan prestasi tersebut kian memantapkan posisi kopi gayo sebagai kopi organik terbaik dunia.",
        "Perkebunan kopi yang telah dikembangkan sejak tahun 1908 ini tumbuh subur di Kabupaten Bener Meriah, Aceh Tengah dan sebagian kecil wilayah Gayo Lues. Ketiga daerah yang berada di ketinggian 1200 m di atas permukaan laut tersebut memiliki perkebunan kopi terluas di Indonesia, yaitu sekitar 81.000 hektar. Masing-masing 42.000 hektar berada di Kabupaten Bener Meriah, selebihnya (39.000 hektar) di Kabupaten Aceh Tengah. ",
        "Masyarakat Gayo berprofesi sebagai petani kopi dengan dominasi varietas Arabika. Produksi kopi arabika yang dihasilkan dari Tanah Gayo merupakan yang terbesar di Asia. Adapun penyebaran tumbuhan kopi ke Indonesia dibawa seorang berkebangsaan Belanda pada abad ke-17 yang mendapatkan biji arabika mocca dari Arabia ke Batavia (Jakarta). Kopi Arabika itu pertama-tama ditanam dan dikembangkan di daerah Jatinegara, Jakarta, menggunakan tanah partikelir Kesawung yang kini lebih dikenal Pondok Kopi.",
        "Penyebaran selanjutnya dari tanaman kopi tersebut sampai juga ke kawasan Dataran tinggi Gayo, Kabupaten Aceh Tengah. Dari masa kolonial Belanda hingga sekarang kopi gayo khususnya telah menjadi mata pencaharian pokok mayoritas masyarakat Gayo bahkan telah menjadi satu-satunya sentra tanaman kopi kualitas ekspor di daerah Aceh Tengah. Selain itu bukti arkeologis berupa sisa pabrik pengeringan kopi masa kolonial Belanda di Desa Wih Porak, Kecamatan Silih Nara, Aceh Tengah telah memberikan kejelasan bahwa kopi pada masa lalu pernah menjadi komoditas penting perekonomian.",
        "Kehadiran kekuasaan Belanda di Tanah Gayo tahun 1904 serta merta diikuti pula dengan hadirnya pendatang-pendatang lain. Pada masa itu wilayah Aceh Tengah dijadikan onder afdeeling Nordkus Atjeh dengan Sigli sebagai ibu kotanya. Di sisi lain, kehadiran Belanda juga telah memberi penghidupan baru dengan membuka lahan perkebunan, salah satunya kebun kopi di Tanah Gayo (di ketinggian 1.000 - 1.700 m di atas permukaan laut)."
    )

    private val llBackground = arrayOf("Untuk penggemar kopi arabika dengan profil rasa dark chocolate, produk ini bisa menjadi pilihan. Selain note dark chocolate, Anda juga akan merasakan note brown sugar dan orange zest sehingga menghasilkan perpaduan rasa yang menarik. Kopi arabika ini bisa Anda nikmati dengan berbagai metode seduhan. Untuk V 60 dan vietnam drip, Anda bisa memilih gilingan tingkat medium. Sementara untuk french press dan cold brew, pilihlah gilingan kasar. Untuk penyuka moka pot dan espresso, gilingan halus bisa Anda pilih.",
        "Tak sembarang kopi Gayo biasa, produk ini difermentasi lebih lanjut oleh luwak. Kopi Luwak Gayo dikenal memiliki kafein yang lebih rendah hingga 50% dibandingkan kopi biasa. Kadar kafein yang lebih rendah membuatnya lebih aman untuk penderita mag. Anda juga bisa memesannya dalam berbagai macam bentuk, mulai dari biji utuh hingga bubuk kopi halus. Rasa dan aromanya cenderung nutty dengan clean aftertaste. Anda yang kurang menyukai sensasi tertinggal di lidah dan tenggorokan setelah minum kopi sepertinya bisa mencoba produk ini.",
        "Kopi arabika yang di-roasting hingga medium level dan digiling sedang ini merupakan pilihan tepat untuk pour over V60. Ketika menyeduh kopi ini, indra penciuman Anda akan dimanjakan dengan aroma kopi Gayo yang khas. Sementara itu, lidah akan merasakan sensasi citrus yang berpadu dengan brown sugar, dark chocolate, dan sweet. Terbayang, kan, sensasinya? Bagi Anda yang lebih menyukai teknik penyeduhan lain, Anda tak perlu khawatir. Pasalnya, kopi ini dijual dalam empat varian, yakni biji utuh, giling kasar, giling sedang, dan giling halus. Anda tinggal tentukan saja varian yang paling sesuai dengan selera.",
        "Anda membutuhkan dorongan semangat untuk memulai aktivitas pada pagi hari atau melanjutkan pekerjaan pada siang hari? Kalau begitu, coba, deh, seduh secangkir kopi Gayo ini. Sakha Coffee menggunakan biji kopi robusta sehingga memiliki kadar asam yang tidak terlalu kuat dan cenderung pahit.Nah, rasa pahit itulah yang membuat mata lebih segar. Kopi makin terasa nikmat berkat cupping notes brown sugar, chocolate, malt, sweet, dan woody. Jika Anda terlalu suka dengan kopi yang pahit, Anda bisa menambahkan susu untuk menetralisasi rasa pahitnya.",
        "Kopi Lanang adalah sebutan untuk biji kopi yang gagal membelah atau hanya ada satu keping biji (monokotil). Biasanya biji kopi terbelah menjadi dua atau dikotil. Dalam perdagangan internasional, biji seperti ini disebut peaberry dan harganya cenderung lebih mahal. Hal ini bisa dibilang wajar karena dari total produksi kopi, populasi biji kopi peaberry hanya sekitar 5–10%. Rasa kopi peaberry terkenal lebih strong, pahit, dan kental. Kadar kafeinnya lebih tinggi dibandingkan kopi lainnya, meskipun jenisnya arabika. Ada mitos yang mengatakan kopi ini bisa meningkatkan stamina dan vitalitas pria. Jika Anda kurang bersemangat dan butuh energi ekstra, kopi Gayo Lanang bisa dicoba.",
        "Kopi ini memiliki karakter rasa unik dengan aroma kuat, tetapi rendah rasa masam. Dipadukan dengan adanya sedikit hint rempah plus rasanya yang tidak terlalu pahit, wajar bila banyak orang jatuh cinta pada kopi ini. Untuk merasakan kopi khas Aceh Gayo yang lembut dan berkelas, produk ini jangan sampai Anda lewatkan, ya!",
        "Kopi ini memiliki karakter rasa unik dengan aroma kuat, tetapi rendah rasa masam. Dipadukan dengan adanya sedikit hint rempah plus rasanya yang tidak terlalu pahit, wajar bila banyak orang jatuh cinta pada kopi ini. Untuk merasakan kopi khas Aceh Gayo yang lembut dan berkelas, produk ini jangan sampai Anda lewatkan, ya!",
        "Apa yang spesial dari kopi Aceh Gayo? Kopi Aceh Gayo ditanam di dataran tinggi Gayo, Aceh. Kebanyakan kopi dari Aceh merupakan kopi organik serta memiliki aroma floral yang sangat khas. Rasanya tergolong kuat dan cukup kompleks dengan tingkat keasaman sedang. Kami rekomendasikan kopi ini untuk Anda yang menginginkan aroma kopi berbeda. Aroma floralnya dijamin membuat Anda jatuh cinta dengan kopi Aceh Gayo.",
        "Aroma harum dari kopi dari Mr. O ini ketika diseduh menjadi salah satu daya tarik kopi asal dataran tinggi Aceh. Produk yang menggunakan ceri kopi ini juga memberikan cita rasa yang rich di mulut dengan notes cokelat. Kami merekomendasikan produk ini untuk Anda yang menyukai kopi harum dan kuat khas Aceh Gayo. Adapun penamaan wine bukan karena kopi ini diproses dengan anggur, melainkan dari rasa yang dihasilkan melalui proses natural. Selain disajikan dalam bentuk hangat, Kopi Arabika Gayo Wine bisa dijadikan es kopi. Karakteristik rasanya dijamin akan membuat Anda ketagihan!",
        "Beberapa dari Anda mungkin lebih suka aroma kopi yang tajam. Beberapa lainnya mungkin menyukai rasa kopi yang nendang. Untuk itu, kami merekomendasikan produk ini. Summerfield menyediakan dua pilihan roast level, yakni medium dan medium dark. Bagi penikmat aroma kopi dengan rasa asam yang masih terasa, kami lebih merekomendasikan produk dengan medium roast. Sebaliknya, pencinta kopi pekat dengan rasa yang pahit bisa pilih medium dark roast. Rasa yang strong pastinya akan memberikan kick dan aftertaste yang berbeda di lidah Anda. Keunggulan lain dari produk Summerfield adalah biji kopinya baru di-roasting setelah ada pesanan agar kualitasnya bagus dan fresh."
    )

//    private val llPersonality = arrayOf("Yu adopted a lot of the player character's personality prior to the anime. She is described as insightful, reliable, quick to take action, and very caring of the Nijigasaki idols. She is shown to have a deep passion for idols, which inspires her goals and actions just like her game counterpart.",
//        "Ayumu is a hardworking girl that puts her everything into what she does. She is not very skilled in her school idol activities, but she continues to try her hardest. Sometimes, she becomes anxious about her capabilities, but she can be comforted by her fellow idols.\n" +
//                "\n" +
//                "She is kind, innocent, and sincere, often responding to the mischief from Karin Asaka and Kasumi Nakasu in a pure manner, which throws the two of them off-guard. However, she doesn't do this intentionally and is truly a pure-hearted girl. She tries her best to be helpful to others.\n" +
//                "\n" +
//                "She can also be rather clumsy at times.",
//        "Kasumi is a kind, friendly and lively girl who loves all things cute, and her love for idols is unrivaled in strength and inspiration. Kasumi wants to be number one in any competition she's in, and often resorts to cheating or even sabotage to achieve that goal. As a consequence, she is a sore loser whenever she achieves anything other than first place.\n" +
//                "\n" +
//                "She hates the nickname Kasukasu (かすかす) which roughly translates to \"just barely\" or \"not quite\", and gets in a bad mood when referred to with it.\n" +
//                "\n" +
//                "Kasumi spends a lot of her time scheming or thinking up new ways to ensure her own victory; however, these plans often fail or aren't as devious as she thinks.\n" +
//                "\n" +
//                "Kasumi can also be considerate of her fellow idols and is seen doing things to cheer them up or to be nice to them. For example, she tries to rile up the group when Ayumu Uehara is nervous before their live, and exchanges genuine Christmas gifts with the Dengeki Online group.",
//        "Setsuna has an energetic smile and a distinctive style of performing. She is easily excitable and full of energy, and she can be moved emotionally very easily. She lights up whenever she is asked a question about her interests, which include anime, manga, video games, and school idols.\n" +
//                "\n" +
//                "She takes her passions very seriously, and with regards to being a school idol, always wants to improve. She wants to share her love of school idols with the world, and help others feel more comfortable saying what they love, but she can be too passionate about idol activities, the reason that drove the members of the original School Idol Club apart and forcing her to disband the club afterwards.\n" +
//                "\n" +
//                "As Nana, she also strives to do well in school, so she always does homework as soon as possible and studies on her off days.\n" +
//                "\n" +
//                "Setsuna is also very supportive of her friends. For example, in the Dengeki 4-koma, she continued to eat Kasumi's spicy bread in order to not let her down since she cooked it for her and Karin. She tries to encourage everyone to pursue their dreams and is open to helping others with their dancing and singing.",
//        "As a suggestible person who's always willing to help, Ai has a lot of friends who can be seen chatting with strangers at any given time. She is also very caring, especially with her family and friends. In the neighborhood she lives, she tends to refer to all sorts of people around as siblings.\n" +
//                "\n" +
//                "Because she is a gyaru, she can be mistaken as the type to skip school or be rebellious. However, she has very good grades and is very fun-loving and nice, but she can be a bit loud and sometimes serves as a mood-maker to her fellow idols.\n" +
//                "\n" +
//                "Ai tends to speak very casually, using a lot of slang. She is also known for her puns, many of which are not very funny to those around her. She easily laughs at bad puns, too.\n" +
//                "\n" +
//                "Despite Ai having a flawless image in school and being very popular, Ai is very down-to-earth and does not perceive herself as better than others, especially her fellow school idols. She even seems unaware of her reputation, as she never pretends to be someone she isn't, nor is she conscious of whatever image she is giving off. In fact, contrary to her \"cool\" and \"popular\" image, Ai's frequent use of puns can sometimes come off as so lame that the other members react with visible exasperation.",
//        "Emma is a kind and easygoing girl with a healing nature. She is very cheerful, pleasant, and tries to look after the other idols. She aims to be encouraging and to help others smile.\n" +
//                "\n" +
//                "Like Shizuku, Emma tends to keep her worries to herself because she doesn't want others to worry about her. She gets nervous easily.\n" +
//                "\n" +
//                "Having 8 siblings back home, she can relate to Kanata on the joys of being an older sister. Her family regularly sends her video letters so they can stay connected and on weekends, Emma will typically spend an hour chatting with them via webcam.\n" +
//                "\n" +
//                "In an All Stars bond episode, she reveals that her dream to become a school idol was the reason why she studied Japanese and eventually came to Japan. She first learned about them after seeing a TV show about them in Switzerland on a night where a snowstorm meant she had to spend the night alone. Her pursuit of her dream has also allowed her to combat being homesick.\n" +
//                "\n" +
//                "It was also revealed in All Stars that she met Mai Natsukawa, the idol that inspired her. The song Aion no Uta is originally Mai's song that she performed during her last concert as an idol.",
//        "Rina is not good at conveying emotions on her face. Because of this, she makes use of the \"Rina-chan Board\", a sketchbook that she draws her emotions on. Rina is also friends with Mia, who met her in Chapter 22 of ALL STARS.\n" +
//                "\n" +
//                "Despite her flaws, Rina is still trying to change herself by communicating and talking more with others. She admires Ai for her confidence and friendliness. Rina gets nervous easily but continues to try her best.\n" +
//                "\n" +
//                "As a school idol, she hopes that people will cheer for her so she can show everyone her true smile.",
//        "Kanata is often seen as being very sleepy and often takes naps during the day. She is very easygoing and prone to napping in the laps of others, although in the Niji-Yon 4-koma series she seems to like Emma's lap the most. She also carries a pillow around with her at school.\n" +
//                "\n" +
//                "At times, she will appear to be sleeping but is actually awake and listening to what's going on around her.\n" +
//                "\n" +
//                "Despite seeming always tired, Kanata is motivated as a school idol by her younger sister and others' praise. She often mentions her dream of being able to take a nap with the audience during a performance. Kanata loves being doted on, but is also very sisterly and capable of looking after others. She loves being a big sister, and tends to look after the other idols in various, little ways. Kanata can be very diligent in matters that are important to her. Her grades are good despite her sleepiness.",
//        "Shizuku is a level-headed and mature honor student. She is considered a traditional Japanese beauty, and is quite timid at times.\n" +
//                "\n" +
//                "As seen in the Niji-Yon 4koma, she likes dogs. Shizuku can be easy to tease, however she is able to stand up for herself and others if teasing goes too far. She can sometimes be observed giving a stern talking-to to Kasumi, someone who is the opposite of Shizuku in terms of maturity. \n" +
//                "\n" +
//                "Due to her responsible nature, Shizuku is also inclined to take on too much responsibility and keep her thoughts to herself. She worries about things quite often. \n" +
//                "\n" +
//                "Shizuku is passionate about acting, and is very skilled at getting into character. She is also a fan of old movies and novels since she was little. However, this passion leaded her to be anxious because she felt she was the only child who liked these things.",
//        "Karin is very mature and gives off a rather seductive vibe. She uses her adult-like looks to her advantage, such as when she tries to tease her underclassmen. She also teaches others how to be sexy and cool like her.\n" +
//                "\n" +
//                "However, these lessons sometimes backfire when people begin to show her significant attention or respond in a pure manner, as Karin will become embarrassed.\n" +
//                "\n" +
//                "Sometimes, Karin is a bit more childish and nervous than she lets on, but she mostly keeps up her usual cool demeanor.\n" +
//                "\n" +
//                "Because of her modeling activities, her grades are below average and she has difficulties waking up in the morning."
//    )

    private val llVideo = arrayOf("",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ",
        "O6EDKzY63Hc?si=iby18fBrDFzJgdDQ"
    )

//    private val llSongName = arrayOf("",
//        "Dream with You",
//        "Poppin' Up!",
//        "DIVE!",
//        "Saikou Heart",
//        "La Bella Patria",
//        "Tsunagaru Connect",
//        "Butterfly",
//        "Solitude Rain",
//        "Vivid World"
//    )

//    private val llSongFile = arrayOf("",
//        "https://res.cloudinary.com/zev/video/upload/v1624779889/Love%20Live/dream_with_you_rfoe7r.mp3",
//        "https://res.cloudinary.com/zev/video/upload/v1624779890/Love%20Live/poppin_up_kuf4hh.mp3",
//        "https://res.cloudinary.com/zev/video/upload/v1624779897/Love%20Live/dive_e2pqot.mp3",
//        "https://res.cloudinary.com/zev/video/upload/v1624779889/Love%20Live/saikou_heart_befrf8.mp3",
//        "https://res.cloudinary.com/zev/video/upload/v1624779890/Love%20Live/la_bella_patria_ypkx4g.mp3",
//        "https://res.cloudinary.com/zev/video/upload/v1624779894/Love%20Live/tsunagaru_connect_iabjfc.mp3",
//        "https://res.cloudinary.com/zev/video/upload/v1624779899/Love%20Live/butterfly_mqouex.mp3",
//        "https://res.cloudinary.com/zev/video/upload/v1624779892/Love%20Live/solitude_rain_rfrngm.mp3",
//        "https://res.cloudinary.com/zev/video/upload/v1624779901/Love%20Live/vivid_world_xmxew3.mp3"
//    )

    private val llReferences = arrayOf("https://shopee.co.id/ARUTALA-Kopi-Gayo-Takengon-Arabika-Arabica-Coffee-200-gram-i.194992662.4835068452?sp_atk=09c75cf2-4baa-42f3-9001-396861a0ef2c&utm_campaign=-&utm_content=14959-1VQcGQhtAGIpGETAWQUTKHr51Mlol4FiBnjamD98DY4f9B3t-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artp8t8apz95&xptdk=09c75cf2-4baa-42f3-9001-396861a0ef2c",
        "https://shopee.co.id/ARUTALA-Kopi-Gayo-Luwak-Liar-100-Wild-Civet-Coffee-200-gram-i.194992662.5809600417?sp_atk=b6f99370-59a6-4ef1-a006-a7ea9d8c8bb0&utm_campaign=-&utm_content=14959-FqSbK3iO1mFuDIJv8xjjD9uzmYCkPStCbv5IIhKxWFBsVcCo-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpas3i7up3&xptdk=b6f99370-59a6-4ef1-a006-a7ea9d8c8bb0",
        "https://shopee.co.id/mall/search?keyword=biji%20kopi%20bubuk%20arabika%20gayo%20aceh%20sumatra&shop=265489563&utm_campaign=-&utm_content=14959-e0rwP27f1LJWTVSujy29Gh3ONb7sNinDoquMcVWHWPZ0P5R2-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpcnipe9m2",
        "https://shopee.co.id/mall/search?keyword=sakha%20coffee%20biji%20kopi%20bubuk%20fine%20robusta%20gayo%20aceh&shop=265489563&utm_campaign=-&utm_content=14959-4zSsOUUxynAHcRW8Af58w6sXtE6aUUnifFlb5r5MrKPqdteT-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpdsp5awx3",
        "https://shopee.co.id/search?keyword=arabika%20gayo%20lanang%20peaberry&shop=11509760&utm_campaign=-&utm_content=14959-jvaGVmhliW9MZjMRD6yOHX9J49V3M50NINBCxaVxEE9SUlEH-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpez1g3snf",
        "https://shopee.co.id/Kopi-Arabika-Aceh-Gayo-200-Gram-BUBUK-BIJI-Arabica-Premium-Coffee-Sentra-Kopi-i.11819946.84489525?sp_atk=5d39e523-8c18-4ec1-a1bc-650dd6be67d4&utm_campaign=-&utm_content=14959-Cf7KXffJHFJCXCQqg7ZIOqirBPIfeq14T0ALfXOMFcSaIdZT-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpgkuj19g4&xptdk=5d39e523-8c18-4ec1-a1bc-650dd6be67d4",
        "https://shopee.co.id/mall/search?keyword=aceh%20gayo&shop=24556339&utm_campaign=-&utm_content=14959-OFrL7gRh1vhgOmhOh5M4Dk1CrDIpYD1XvNqOci1iUbAAEjfP-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artphiacfjxs",
        "https://shopee.co.id/Kopi-Arabika-GAYO-WINE-200g-biji-Kopi-Aceh-single-origin-arabica-SPECIAL-i.10121388.7453110267?position=2&utm_campaign=-&utm_content=14959-uRF0edXEkA3TfeFnbPh7CMLz4Yp9cslMEcWyVAilRKBgWoe9-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpin6xzb8j",
        "https://shopee.co.id/Kopi-Arabika-GAYO-WINE-200g-biji-Kopi-Aceh-single-origin-arabica-SPECIAL-i.10121388.7453110267?position=2&utm_campaign=-&utm_content=14959-uRF0edXEkA3TfeFnbPh7CMLz4Yp9cslMEcWyVAilRKBgWoe9-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpin6xzb8j",
        "https://shopee.co.id/Kopi-Arabika-GAYO-WINE-200g-biji-Kopi-Aceh-single-origin-arabica-SPECIAL-i.10121388.7453110267?position=2&utm_campaign=-&utm_content=14959-uRF0edXEkA3TfeFnbPh7CMLz4Yp9cslMEcWyVAilRKBgWoe9-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpin6xzb8j",
        "https://shopee.co.id/Kopi-Arabika-GAYO-WINE-200g-biji-Kopi-Aceh-single-origin-arabica-SPECIAL-i.10121388.7453110267?position=2&utm_campaign=-&utm_content=14959-uRF0edXEkA3TfeFnbPh7CMLz4Yp9cslMEcWyVAilRKBgWoe9-https%3A%2F%2Fid.my-best.com-4e0cb6fb5fb446d1c92ede2ed8780188-&utm_medium=affiliates&utm_source=an_11146330000&utm_term=artpin6xzb8j",

        )


    val listData : ArrayList<KopiLive>
        get() {
            val list = arrayListOf<KopiLive>()
            for (position in llNames.indices){
                val data = KopiLive()
                data.name = llNames[position]
                data.isFavorite = llIsFavorite[position]
                data.thumbnail = llThumb[position]
                data.photo = llPhoto[position]
                data.cv = llCv[position]
                data.icon = llIcon[position]
                data.year = llYear[position]
                data.birthday = llBirthday[position]
                data.bloodType = llBloodType[position]
                data.height = llHeight[position]
                data.description = llDescription[position]
                data.background = llBackground[position]
//                data.personality = llPersonality[position]
                data.video = llVideo[position]
//                data.songName = llSongName[position]
//                data.songFile = llSongFile[position]
                data.references = llReferences[position]
                list.add(data)
            }
            return list
        }

}