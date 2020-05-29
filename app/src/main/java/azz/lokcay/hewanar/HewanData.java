package azz.lokcay.hewanar;

import java.util.ArrayList;

public class HewanData {
    private static String[] namaHewan = {
            "Beruang",
            "Kucing",
            "Sapi",
            "Anjing",
            "Gajah",
            "Musang",
            "Kuda Nil",
            "Kuda",
            "Koala",
            "Singa",
            "Rusa Kutub",
            "Serigala"

    };
    private static String[] detaiHewan = {
            "Beruang (Ursidae) meruapakan salah satu mamalia darat besar yang di temukan di seluruh dunia. Ada delapan spesies yang berbeda dari beruang yang ditemukan di berbagai habitat diantaranya yang ditemukan di utara dan Selatan hemispheres, terutama di benua Amerika, Eropa dan Asia. Kebanyakan beruang aktif di malam hari. Beruang juga termasuk hewan soliter (penyendiri) yang hanya benar-benar berkumpul selama musim kawin saja. Beruang memiliki indera penciuman yang sangat baik dan mereka juga tergolong hewan pemanjat pohon yang fantastis. Mereka juga bisa berenang dengan baik dan dapat berlari pada kecepatan hingga 35 meter perjam untuk jangka waktu yang singkat.\n",
            "Kucing adalah jenis hewan mamalia karnivora yang berasal dari keluarga Felidae. Habitat kucing adalah di darat yang biasanya berbaur dengan manusia sebagai peliharaan dan ada juga yang hidup liar. Istilah kucing ini biasanya tertuju pada hewan kucing kecil yang telah jinak dan dipelihara manusia tetapi sebenarnya istilah kucing juga bisa merujuk kepada kucing besar seperti singa dan harimau.\n",
            "Sapi adalah hewan ternak terpenting sebagai sumber daging, susu, tenaga kerja, dan kebutuhan lainnya. Sapi menghasilkan sekitar 50% kebutuhan daging di dunia, 95% kebutuhan susu dan 85% kebutuhan kulit Sapi berasal dari famili Bovidae, seperti halnya bison, banteng, kerbau (Bubalus), kerbau Afrika (Syncherus), dan Anoa (Sugeng, 2003). Menurut Sugeng (2003), domestikasi sapi mulai dilakukan sekitar 400 tahun SM.\n",
            "Anjing adalah mamalia yang telah mengalami domestikasi dari serigala sejak 15.000 tahun yang lalu atau mungkin sudah sejak 100.000 tahun yang lalu berdasarkan bukti genetik berupa penemuan fosil dan tes DNA. Penelitian lain mengungkap sejarah domestikasi anjing yang belum begitu lama.\n",
            "Gajah adalah mamalia besar dari famili Elephantidae dan ordo Proboscidea. ... Gajah merupakan hewan herbivora yang dapat ditemui di berbagai habitat, seperti sabana, hutan, gurun, dan rawa-rawa. Mereka cenderung berada di dekat air.\n",
            "Musang adalah nama umum bagi sekelompok mamalia pemangsa (bangsa karnivora) dari suku Viverridae. Hewan ini kebanyakan merupakan hewan malam (nokturnal) dan pemanjat yang baik. Yang paling dikenal dari berbagai jenisnya adalah musang luwak (Paradoxurus hermaphroditus).\n",
            "Kuda nil (bahasa Latin: Hippopotamus amphibius) atau hippo (bahasa Yunani: ἱπποπόταμος, hippopotamos, dari ἵππος, hippos, \"kuda\", dan ποταμός, potamos, \"sungai\") adalah mamalia dari keluarga Hippopotamidae yang berukuran besar, omnivora, dan berasal dari Afrika sub-Sahara. Kuda nil adalah hewan darat terbesar ketiga setelah gajah dan badak putih.\n",
            "Kuda (Equus caballus atau Equus ferus caballus) adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. Hewan ini telah lama merupakan salah satu hewan peliharaan yang penting secara ekonomis dan historis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun.\n",
            "Koala (Phascolarctos cinereus) adalah salah satu binatang berkantung (marsupial) khas dari Australia dan merupakan wakil satu-satunya dari keluarga Phascolarctidae. Pada umumnya, banyak dikatakan bahwa kata koala berasal dari bahasa Australia pribumi yang berarti tidak minum.\n",
            "Singa (bahasa Sanskerta: Siṃha, atau nama ilmiahnya Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya.\n",
            "Rusa kutub (Rangifer tarandus), juga dikenal sebagai karibu di Amerika Utara, adalah spesies rusa yang tersebar di sekitar wilayah kutub bumi, yakni Arktik, subarktik, tundra, daerah boreal dan pegunungan utara Eropa, Siberia, dan Amerika Utara.\n",
            "Serigala adalah hewan monogami. Ada beberapa hewan yang bersifat monogami (setia dengan satu pasangan) sampai akhir hidupnya, dan salah satunya adalah serigala. Live Science dalam lamannya menulis bahwa cara monogami yang dilakukan oleh serigala adalah salah satu kunci keselamatan spesies dalam proses evolusi.\n"
    };
    private static int[] photoHewan = {
            R.drawable.bear,
            R.drawable.cat,
            R.drawable.cow,
            R.drawable.dog,
            R.drawable.elephant,
            R.drawable.ferret,
            R.drawable.hippopotamus,
            R.drawable.horse,
            R.drawable.koala_bear,
            R.drawable.lion,
            R.drawable.reindeer,
            R.drawable.wolverine

    };

    static ArrayList<Hewan> getListData(){
      ArrayList<Hewan> list = new ArrayList<>();

      for (int i = 0 ;i < namaHewan.length ; i++){
          Hewan hewan = new Hewan();
          hewan.setNama( namaHewan[i] );
          hewan.setDetail( detaiHewan[i] );
          hewan.setPhoto( photoHewan[i] );
          list.add( hewan );
      }
      return list;
    }
}
