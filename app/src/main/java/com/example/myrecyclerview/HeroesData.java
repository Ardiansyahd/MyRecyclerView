package com.example.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {

    private static String[] heroNames = {

            "Ahmad Dahlan",
            "Ahmad Yani",
            "Sutomo",
            "Gatot Subroto",
            "Ki Hadjar Dewantara",
            "Mohammad Hatta",
            "Soedirman",
            "Soekarno",
            "Soepomo",
            "Tan Malaka"

    };

    private static String[] heroDetails = {
            "Ahmad Dahlan adalah pahlawan yang gigih",
            "Ahmad Yani adalah pejuang yang tak kenal lelah",
            "Sutomo adalah pejuang dari Surabaya yang dikenal Bung Tomo",
            "Gatot Subroto adalah pahlawan yang membela Indonesia",
            "Ki Hajar Dewantara merupakan salah satu anggota tiga serangkai",
            "Mohammad Hatta adalah salah satu pejuang yang memakai kacamata",
            "Soedirman merupakan seorang jendral yang tegas",
            "Soekarno orang yang penting di Indonesia",
            "Soepomo merupakan salah satu yang merancang Undang-Undang Dasar Negara Republik Indonesia",
            "Tan Malaka adalah pejuang keturunan jepang"
    };

    private static int[] heroImages = {
            R.drawable.sep,
            R.drawable.rpl,
            R.drawable.keretaapi,
            R.drawable.tigakereta,
            R.drawable.sep,
            R.drawable.sep,
            R.drawable.rpl,
            R.drawable.keretaapi,
            R.drawable.tigakereta,
            R.drawable.sep
    };

    static ArrayList<Hero> getListdata() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroImages[position]);
            list.add(hero);
        }
        return list;
    }
}
