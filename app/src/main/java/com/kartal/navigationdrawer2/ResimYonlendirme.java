package com.kartal.navigationdrawer2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ResimYonlendirme extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resim_yonlendirme);

        main_list = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        main_list.add(new Model(R.drawable.bogaz,"İSTANBUL BOĞAZI","İstanbul Boğazı ya da tarihî ismiyle Bosporos, Asya ile Avrupa kıtalarını birbirinden ayıran ve Marmara Denizi ile Karadeniz'i birbirine bağlayan bir boğaz ve uluslararası su yoludur. Boğaz, genel olarak kuzeydoğu-güneybatı doğrultusunda uzanır ve İstanbul şehrini Avrupa Yakası ve Anadolu Yakası olarak ikiye böler."));
        main_list.add(new Model(R.drawable.topkapi,"TOPKAPI SARAYI","Topkapı Sarayı, İstanbul Sarayburnu'nda, Osmanlı İmparatorluğu'nun 600 yıllık tarihinin 400 yılı boyunca, devletin idare merkezi olarak kullanılan ve Osmanlı padişahlarının yaşadığı saraydır. Bir zamanlar içinde 4.000'e yakın insan yaşamıştır."));
        main_list.add(new Model(R.drawable.suleymaniye,"SÜLEYMANİYE CAMİİ","Süleymaniye Camii, Kanuni Sultan Süleyman adına 1551-1557 yılları arasında İstanbul'da Mimar Sinan tarafından inşa edilen camidir. "));
        main_list.add(new Model(R.drawable.eyupsultancamii,"EYÜP SULTAN CAMİİ","Eyüp Sultan Camii, İstanbul'da Eyüpsultan semtinde Haliç kıyısında bulunan camii, olmasının ötesinde kutsal bir ziyaret yeridir."));
        main_list.add(new Model(R.drawable.kizkulesi,"KIZ KULESİ","Kız Kulesi, hakkında çeşitli rivayetler anlatılan, efsanelere konu olan, İstanbul Boğazı'nın Marmara Denizi'ne yakın kısmında, Salacak açıklarında yer alan küçük adacık üzerinde inşa edilmiş yapıdır. Üsküdar'ın sembolü haline gelen kule, Üsküdar’da Bizans devrinden kalan tek eserdir."));
        main_list.add(new Model(R.drawable.dolmabahce,"DOLMABAHÇE SARAYI","Dolmabahçe Sarayı, İstanbul, Beşiktaş'ta, Kabataş'tan Beşiktaş'a uzanan Dolmabahçe Caddesi'yle İstanbul Boğazı arasında, 250.000 m²lik bir alan üzerinde bulunan Osmanlı sarayı. Marmara Denizi'nden Boğaziçi'ne deniz yoluyla girişte sol kıyıda, Üsküdar ve Kuzguncuk'ın karşısında yer alır."));
        main_list.add(new Model(R.drawable.galata,"GALATA KULESİ","Galata Kulesi, Türkiye'nin İstanbul şehrinin Beyoğlu ilçesinde bulunan bir kuledir. Adını, bulunduğu semt olan Galata'dan alır."));
        main_list.add(new Model(R.drawable.rumelihisari,"RUMELİ HİSARI","Rumeli Hisarı, İstanbul'un Sarıyer ilçesinde Boğaziçi'nde bulunan ve bulunduğu semte adını veren hisar. Fatih Sultan Mehmet tarafından İstanbul'un fethinden önce boğazın kuzeyinden gelebilecek saldırıları engellemek için Anadolu yakasındaki Anadolu Hisarı'nın tam karşısına inşa ettirilmiştir."));
        main_list.add(new Model(R.drawable.kapalicarsi,"KAPALI ÇARŞI","Kapalıçarşı, İstanbul kentinin merkezinde Beyazıt, Nuruosmaniye ve Mercan semtlerininin ortasında yer alan dünyanın en büyük çarşısı ve en eski kapalı çarşılarından biri. Kapalıçarşı'da yaklaşık 4.000 dükkân bulunmaktadır ve bu dükkânlarda toplam çalışan sayısı yaklaşık 25.000'dir. "));
        main_list.add(new Model(R.drawable.yedikule,"YEDİKULE","Yedikule, İstanbul'un Fatih ilçesine bağlı mahallelerden biridir. Eski bir Rum semti olan Yedikule, Marmara Denizi kıyısında, Fatih'in Kocamustafapaşa ve Zeytinburnu'nun Kazlıçeşme semtleri arasında yer alır. Adını, tarihî yarımadayı çevreleyen İstanbul surlarının semtte bulunan yedi kulesinden almaktadır."));
        main_list.add(new Model(R.drawable.sarnic,"YEREBATAN SARNICI","Yerebatan Sarnıcı İstanbul'un Avrupa yakasında bulunan, şehrin en büyük kapalı sarnıcı. Ayasofya binasının güneybatısındaki küçük bir binadan girilir. Sütun ormanı görünümündeki mekanın tavanı tuğla örülü, çapraz tonozludur. Sarnıç, Bizans imparatoru I. Justinianus tarafından yaptırılmıştır."));
        main_list.add(new Model(R.drawable.pierreloti,"PİERRE LOTİ","İstanbul'un Eyüp ilçesinde Haliç'e nazır bir tepe olan Pierre Loti kahvesinin, deyim yerindeyse 40 yıl hatırı var. Tepeye adını veren Fransız asker, başta kendi ülkesi olmak üzere işgal kuvvetlerine karşı aldığı tavır ve Türk dostluğuyla Milli Mücadele döneminde takdir kazanmış biri. Bizler onu, İstanbul ile özdeşleşen büyük aşkı Aziyade’den tanıyoruz; namı diğer Hatice’den."));
        main_list.add(new Model(R.drawable.istiklalcaddesi,"İSTİKLAL CADDESİ","İstiklal Caddesi, İstanbul'un en çok ziyaret edilen caddelerinden bir tanesidir. Bu cadde en eski semtlerden bir tanesi olan Beyoğlu'nda yer alır. Bir ucu Tünel'de bir ucu Taksim Meydanı'nda bulunur. Caddenin tam ortası ise Galatasaray Lisesi'nin olduğu bölgedir. Ortalama olarak 74 metre yüksekliğe sahip cadde, 9 ayrı mahalleye ev sahipliği yapar."));
        main_list.add(new Model(R.drawable.mackaparki,"MAÇKA PARKI","Maçka Demokrasi Parkı, İstanbul'da, Kadırgalar Vadisi'nde üzerine kurulu park. Dolmabahçe, Maçka, Nişantaşı ve Harbiye arasındaki geniş bir alanı kaplar."));
        main_list.add(new Model(R.drawable.camlicatepesi,"ÇAMLICA TEPESİ","Büyük Çamlıca Tepesi İstanbul Anadolu Yakası Üsküdar ilçesi sınırlarında yer alır. Büyük Çamlıca Tepesi denizden 268 m yüksekliktedir ve Nurbaba Tekkesi ve TV verici kuleleri burada yer alır."));



        adapter=new CustomAdapter(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);




    }


}