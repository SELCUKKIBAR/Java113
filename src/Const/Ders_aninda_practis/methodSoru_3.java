package Const.Ders_aninda_practis;

import java.util.Scanner;
public class methodSoru_3 {

    static String isim="";
    static String soyIsim ="";
    public static void main(String[] args) {
        /*
            Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
                    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
                    isim bosluk soyisim seklinde bize donduren bir method olusturun
                    input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Adınızı giriniz...:");
        isim=scan.nextLine();

        System.out.println("Soy adınızı giriniz...:");
        soyIsim = scan.nextLine();

        System.out.println(isimSoyisimBirlestirme(isim, soyIsim));


    }
    public static String isimSoyisimBirlestirme(String isim,String soyIsim){
        String newIsim =isim.toUpperCase().charAt(0)+
                            isim.substring(1).toLowerCase()+
                            " "+soyIsim.toUpperCase().charAt(0)+
                            soyIsim.substring(1).toLowerCase();
        return newIsim;
    }
}
