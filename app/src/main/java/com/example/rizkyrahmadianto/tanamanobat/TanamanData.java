package com.example.rizkyrahmadianto.tanamanobat;

import java.util.ArrayList;

/**
 * Created by Rizky Rahmadianto on 30/10/2017.
 */

public class TanamanData {
    public static String[][] data = new String[][]{
            {"Belimbing Wuluh", "Averrhoa Bilimbi Fruit", "https://upload.wikimedia.org/wikipedia/commons/b/b9/Averrhoa_bilimbi_fruit_by_Sugeesh.jpg"},
            {"Temu Lawak", "Curcuma Xanthorrhiza", "https://upload.wikimedia.org/wikipedia/id/c/c9/Temulawak.jpg"},
            {"Lidah Buaya", "Aloe Vera", "https://upload.wikimedia.org/wikipedia/commons/4/4b/Aloe_vera_flower_inset.png"},
            {"Kumis Kucing", "Orthosiphon Aristatus", "https://upload.wikimedia.org/wikipedia/commons/0/0b/Cats_Whiskers_%282074039768%29.jpg"},
            {"Keji Beling", "Strobilanthes Crispus", "https://upload.wikimedia.org/wikipedia/id/2/26/YosriPecahKaca.jpg"},
            {"Daun Jarak", "Ricinus Communis", "https://upload.wikimedia.org/wikipedia/commons/c/cc/Castor_bean_in_distubred_area.jpg"},
            {"Daun Beluntas", "Plucheacea Folium", "https://upload.wikimedia.org/wikipedia/commons/e/e0/Starr_030625-0015_Pluchea_indica.jpg"},
            {"Daun Dewa", "Gynura Divaricata", "https://upload.wikimedia.org/wikipedia/commons/2/26/Gynura_divaricata_-_Hong_Kong_Botanical_Garden_-_IMG_9576.JPG"}
    };

    public static ArrayList<Tanaman> getListData(){
        Tanaman tanaman = null;
        ArrayList<Tanaman> list = new ArrayList<>();
        for(int i = 0; i < data.length; i++){
            tanaman = new Tanaman();
            tanaman.setName(data[i][0]);
            tanaman.setRemarks(data[i][1]);
            tanaman.setPhoto(data[i][2]);

            list.add(tanaman);
        }
        return list;
    }
}
