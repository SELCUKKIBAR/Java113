package Const.forEach;

import java.util.ArrayList;
import java.util.List;

public class for_each_soru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
                - Kelimenin uzunlugu cift sayi ise ilk yarisini
                - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                  yeni bir listeye ekleyip yazdirin.
         */

        String[] arr = {"selçuk", "duygu", "duru", "kibar"};
        List<String> liste = new ArrayList<>();
        System.out.println(kelimeleriUzunliklarinaGoreYazdir(arr));

    }

    public static List<String> kelimeleriUzunliklarinaGoreYazdir(String[] arr) {

        List<String> liste = new ArrayList<>();
        for (String each : arr
        ) {
            int uzunluk = each.length();
            if (uzunluk % 2 == 0) {
                liste.add(each.substring(0, uzunluk / 2));
            } else {
                liste.add(each.substring((uzunluk - 1) / 2));
            }
        }
        return liste;
    }
}
