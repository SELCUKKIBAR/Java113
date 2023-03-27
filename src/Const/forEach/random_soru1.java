package Const.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class random_soru1 {
    public static void main(String[] args) {
        int [] arr = new int[100];

        for (int i = 0; i <100 ; i++) {

            Random rnd = new Random();
            arr[i]=rnd.nextInt(1000);

        }
        //System.out.println("Rast gele 0-1000 arası 100 sayının ortlaması...: "+ortalama(arr));

        tekCiftBulma(arr);
    }
    public static double ortalama(int[]arr){
        double toplam = 0;
        for (int i = 0; i < 100; i++) {
            toplam += arr[i];
        }
        return toplam/100;
    }
    public static void tekCiftBulma(int[]arr){

        List<Integer> CiftSayilar = new ArrayList<>();
        List<Integer> TekSayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2==0){
                CiftSayilar.add(arr[i]);
            }else {
                TekSayilar.add(arr[i]);
            }
        }
        System.out.print("Toplamda :"+(CiftSayilar.size())+" Çift sayı bulunmuştur...");
        System.out.println(CiftSayilar);
        System.out.println("");
        System.out.print("Toplamda :"+(TekSayilar.size())+" Tek sayı bulunmuştur...");
        System.out.println(TekSayilar);
    }
}
