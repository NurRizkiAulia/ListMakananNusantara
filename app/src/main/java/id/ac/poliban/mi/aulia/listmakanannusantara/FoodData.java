package id.ac.poliban.mi.aulia.listmakanannusantara;

import java.util.ArrayList;
import java.util.List;

public class FoodData {
    static List<Food> getAllFood() {
        List<Food> data = new ArrayList<>();
        data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Gado-gado.jpg","Gado-gado","Kuliner Asli Indonesia selanjutnya adalah gado-gado. Gado-gado adalah makanan khas Jawa berupa sayur sayuran yang direbus dan dicampur menjadi satu. Makanan ini mempunyai bumbu khas kacang tanah yang di haluskan. Tak ketinggalan juga irisan telur dan taburan bawang goreng diatasnya. Penyajiannya yang unik dan lezat ini akan lebih komplit jika ditambah dengan emping goreng atau kerupuk."));
        data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Soto-Ayam.jpg","Soto Ayam","Tak hanya terkenal karena rasanya yang lezat, Soto juga memiliki tampilan yang indah. Kuliner Khas Indonesia yang mudah dibuat ini paling nikmat jika di makan ketika musim hujan. Perpaduan udara yang dingin dan kuahnya yang panas adalah perpaduan yang pas bagi kita. Tak hanya di Indonesia saja, soto ayam juga ada di sebuah festival makanan di Jepang. Rupanya makanan soto ayam telah menjadi langganan di acara ini. acara ini sendiri diselenggarakan oleh pelajar Indonesia yang tergabung dalam PPIJ- Komsat Ibaraki. Terbukti dalam acara besar seperti ini soto ayam dapat menjadi makanan yang diterima dengan baik oleh masyarakat Jepang dan soto menjadi makanan khas indonesia yang mendunia."));
        data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Rendang.jpg","Rendang","Rendang adalah makanan khas indonesia yang berasal dari Padang Sumatera Barat. Rendang dibuat dari daging yang bercita rasa pedas, bumbunya menggunakan dari campuran berbagai bumbu serta rempah rempah asli indonesia. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulah ulang dengan menggunakan santan kelapa. Rendang dikenal dengan proses memasaknya yang cukup lama. Butuh waktu berjam jam untuk menghasilkan warna hitam pekat dan daging yang empuk."));
        data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Sop-Buntut.jpg","Sop Buntut","Makanan Indonesia yang mendunia terakhir adalah sop buntut. Sebuah acara untuk memperkenalkan masakan khas Indonesia diselenggarakan oleh kedutaan besar republik Indonesia di Madrid Spanyol. Salah satu menunya adalah sop buntut. Ternyata acara ini mendapatkan respon yang positif. Chef asal Indonesia menyajikan makanan khas Indonesia disini. Setidaknya terdapat 300’an orang yang menikmati Menu yang disajikan dari Chef Indonesia dan jatuh hati pada sop buntut"));
        data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Nasi-Goreng-Masakan-Indonesia-yang-mendunia.jpg","Nasi Goreng","Sebagian dari kita tentu sudah akrab dengan makanan yang satu ini, yaitu Nasi Goreng. Lebih dari itu Nasi Goreng telah berhasil menjadi Icon Indonesia. Nama makanan nasi goreng semakin menyebar luas di mancanegara, setelah presiden Amerika Serikat Barack Obama menyebutkan nama makanan nasi goreng sebagai makanan khas Indonesia yang terkenal di dunia dan beberapa kali dia mengakui enaknya makanan yang satu ini."));
        return data;

    }

}
