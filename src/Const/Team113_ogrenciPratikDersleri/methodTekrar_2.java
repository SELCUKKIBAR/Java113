package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class methodTekrar_2 {
    public static void main(String[] args) {


        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
                Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
                isim bosluk soyisim seklinde bize donduren bir method olusturun
                input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Adınızı giriniz...: ");
        String isim = scan.nextLine();

        System.out.print("Soyisminizi giriniz");
        String soyIsim=scan.nextLine();

        String birlesikKelime = isimSoyisimBirlestirme(isim, soyIsim);
        System.out.println(birlesikKelime);
        System.out.println(isimSoyisimBirlestirme(isim, soyIsim));


    }
    public static String isimSoyisimBirlestirme(String isim,String soyisim){

        String kelime =isim.toUpperCase().charAt(0)+
                            isim.substring(1).toLowerCase()+
                            " "+soyisim.toUpperCase().charAt(0)+
                            soyisim.substring(1).toLowerCase();
        return kelime;
    }

}
