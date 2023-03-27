package Const.Ders_aninda_practis;

import java.util.Scanner;

public class methodSoru_2 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan input olarak verilen bir String,
                baslangic ve bitis indexlerine gore baslangic index'i dahil,
                bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
                - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
         */

        alinanStringiSonHarfHaricYazdirma();


    }

    public static String alinanStringiSonHarfHaricYazdirma (){


        Scanner scan =new Scanner(System.in);
        System.out.println("Bir kelime giriniz....: ");
        String kelime= scan.nextLine();

        System.out.print("Başlangıç indexini giriniz...: ");
        int baslangic = scan.nextInt();

        System.out.print("Bitiş indexini giriniz...: ");
        int bitis = scan.nextInt();

        String hrf ="";

        if (baslangic>=bitis){
            System.out.println("Başlangiç indexi Bitiş indexinden büyük olamaz....");
        } else if (baslangic>kelime.length() || bitis>kelime.length()) {
            System.out.println("Kelimeden bulunmayan bir index numarası girdiniz...");
        }else {
            for (int i = baslangic; i <bitis ; i++) {
                hrf+=kelime.charAt(i);

            }
        }
        System.out.println(hrf);
        return "-----";
    }
}
