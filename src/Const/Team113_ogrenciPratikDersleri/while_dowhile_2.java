package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class while_dowhile_2 {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        //kullanicidanAlinanSayininRakamlarToplamini();

        //int sonuc = kullanicidanAlinanSayininRakamlarToplam();
        //System.out.println("Girilen Sayının Rakamları Toplamı...: "+sonuc);
        //System.out.println(stringiTersDondur());
        //toplanmakUzereSayiAl();
        //sayininUssu();
        //doSayininUssu();
        //kDanTyeKadarYazdirin();
        sifreMethodu();

    }
    public static void kullanicidanAlinanSayininRakamlarToplamini(){

        Scanner scan = new Scanner(System.in);
        System.out.print("İki basamaklı bir sayı giriniz....: ");
        int girilenSayi = scan.nextInt();
        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int toplam = 0;

        while (sayi>0){

            birlerBasamagi=sayi%10;
            toplam+=birlerBasamagi;
            sayi/=10;
        }
        System.out.println("Girilen Sayının Rakamları Toplamı...: "+toplam);

    }
    public static int kullanicidanAlinanSayininRakamlarToplam(){
        Scanner scan = new Scanner(System.in);
        System.out.print("İki basamaklı bir sayı giriniz....: ");
        int girilenSayi = scan.nextInt();
        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int toplam = 0;

        do {
            birlerBasamagi=sayi%10;
            toplam+=birlerBasamagi;
            sayi/=10;
        }while (sayi>0);

        return toplam;
    }
    public static String stringiTersDondur(){
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String kelime = "Javada pratik yapmak çok önemlidir";
        String tersKelime = "";
        int index = kelime.length()-1;

        while (kelime.length()!=tersKelime.length()){

            tersKelime+=kelime.charAt(index);
            index--;

        }
        return tersKelime;
    }

    public static void toplanmakUzereSayiAl(){
         /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
                Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
                Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive bunlarin toplaminin kac oldugunu yazdirin
                Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu negatif sayiyi sayi adedine ve toplama eklemeyin
     */
       Scanner scan = new Scanner(System.in);
       int girilenSayi =0;
       int toplam = 0;
       int sayac = 1;

       do {
           System.out.print("Toplamak için sayı giriniz..... ÇIKIŞ için 0'a basınız...:");
           girilenSayi = scan.nextInt();
           if (girilenSayi<0){
               System.out.println("Negatif sayı giremezsiniz....");
               sayac--;
           }else if (girilenSayi==0){
               sayac--;
           }else {
               toplam+= girilenSayi;
               sayac++;
           }
       }while (girilenSayi>0);
        System.out.println("Toplamda "+sayac+" adet sayı girildi ve toplamları...: "+toplam);
    }

    public static void sayininUssu(){
        /*
            Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
                    While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Üslü ifadenin tabanını giriniz...: ");
        int taban = scan.nextInt();

        System.out.print("Üslü ifadenin üssünü giriniz...: ");
        int us=scan.nextInt();

        int sonnuc = 1;
        while (us!=0){

            sonnuc*=taban;
            us--;
        }
        System.out.println(sonnuc);
    }
    public static void doSayininUssu(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Üslü ifadenin tabanını giriniz...: ");
        int taban = scan.nextInt();

        System.out.print("Üslü ifadenin üssünü giriniz...: ");
        int us=scan.nextInt();

        int sonnuc = 1;

        do {
            sonnuc*=taban;
            us--;

        }while (us!=0);
        System.out.println(sonnuc);
    }
    public static void kDanTyeKadarYazdirin(){

        //Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char basHrf = 'k';
        char sonHrf = 't';
        do {
            System.out.print(basHrf+" ");
            basHrf++;

        }while (basHrf<=sonHrf);

        System.out.println(" ");
        System.out.println("-------------------");

        char basHrf1 = 'k';
        char sonHrf1 = 't';

        while (basHrf1<=sonHrf1){
            System.out.print(basHrf1+" ");
            basHrf1++;
        }

    }
    public static void sifreMethodu() {
        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
                edin ve sifredeki hatalari yazdirin.
                Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
                “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
         */


        Scanner scan = new Scanner(System.in);

        int flag = 0;
        while (flag != 3) {
            flag = 0;
            System.out.print("Bir şifre giriniz....: ");
            String sifre = scan.nextLine();


            for (int i = 0; i < sifre.length() - 1; i++) {

                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                    flag++;
                } else {
                    if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                        flag++;
                    } else {
                        if (sifre.length() >= 8) {
                            flag++;
                        } else {
                            System.out.println("Şifreniz en az 8 karakterden oluşmalı....");
                        }
                    }
                    System.out.println("Şifreniz Büyik harf içermeli.....");
                }
            }
        }
    }
}





