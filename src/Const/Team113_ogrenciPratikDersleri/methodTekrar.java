package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class methodTekrar {

    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic index'i dahil,
                 bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
                - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
         */

        baslangicBitisMtehod();



    }
    public static void baslangicBitisMtehod(){

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz....: ");
        String kelime = scan.nextLine();

        System.out.println("Başlangıç indexini giriniz...:");
        int baslangic = scan.nextInt();

        System.out.println("bitiş indexini giriniz...:");
        int bitis = scan.nextInt();

        if (baslangic>bitis){
            System.out.println("Başlangıç indexi Btiş indexinden büyük olamaz.....");
        } else if (baslangic>kelime.length()-1 || bitis>kelime.length()-1) {
            System.out.println("Kelimenin index numarasından büyük bir değer girdiniz....");
        } else if (baslangic<bitis) {

            for (int i = baslangic; i <bitis-1 ; i++) {
                System.out.print(kelime.charAt(i)+",");
            }System.out.print(kelime.charAt(bitis-1));
        }




    }
}
