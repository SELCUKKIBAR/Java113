package Const.Ders_aninda_practis;

import java.util.Scanner;

public class Strging_Manipilation_soru_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Soru 1 : Kullanicidan bir cumle alin
                - cumlede ev geciyorsa, "home home sweet home" yazdirin -
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin



        System.out.print("Bir kelime giriniz...: ");
        String kelime = scan.nextLine();
        if (kelime.contains("ev")&& kelime.contains("iş")){
            System.out.println("Hem ev lazim hem is");
        } else if (kelime.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (kelime.contains("iş")) {
            System.out.println("calismak guzeldir");
        } else{
            System.out.println("cok calisman lazim");
        }

         */

        /*
        Soru 3 : Kullanicidan alinan metindeki
                istenmeyen rakam ve ozel karakterleri silip,
                sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                input : java1 ogRe2@nMek3 #ne +Gu=zel
                output : Java ogrenmek ne guzel.

                Regex (Regular Expressions)
                    \\s : space \\S : space olmayan hersey
                    \\s+ : yanyana birden fazla space
                    \\d : digits \\D : digit olmayan hersey
                    \\w : harf veya rakam \\W : harf veya rakam olmayan hersey
         */
        /*
        System.out.print("Bir kelime giriniz....: ");
        String kelime1 = scan.nextLine();

        kelime1=kelime1.replaceAll("\\d","");
        kelime1=kelime1.replaceAll("\\s","5");
        kelime1 = kelime1.replaceAll("\\W","");
        kelime1=kelime1.replaceAll("\\d"," ");
        kelime1 = kelime1.substring(0,1).toUpperCase()+kelime1.substring(1).toLowerCase();
        System.out.println(kelime1);
         */

        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
                ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
                eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin

                - ilk harf kucuk harf olmali
                - son karakter rakam olmali
                - sifre bosluk icermemeli
                - uzunlugu en az 10 karakter olmali
         */

        /*

        System.out.print("Şifrenizi giriniz....: ");
        String sifre = scan.nextLine();

        int flag =0;

        if (sifre.length()>=10){
           flag++;
        }else {
            System.out.println("Şifreniz en az 10 karakterden oluşmalı");
        }
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (sonHarf>='0'&& sonHarf<='9'){
            flag++;
        }else {
            System.out.println("Şifrenizin son karakteri RAKAM olmalı");
        }
        char ilkHarf = sifre.charAt(0);
        if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            flag++;
        }else {
            System.out.println("Şifrenizin ilk harfi KÜÇÜK harf olmalı");
        }
        if (sifre.contains(" ")){
            System.out.println("Şifrenizde BOŞLUK olmamalı");
        }else {
            flag++;
        }
        if (flag==4){
            System.out.println("ŞİFRENİZ BAŞARILI İLE KAYDEDİLDİ...");
        }

         */
        /*Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                   - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
                   - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.


        System.out.print("Adınızı giriniz....: ");
        String name = scan.nextLine();
        System.out.print("Soyadınızı giriniz...: ");
        String surName = scan.nextLine();

        if (name.length()>surName.length()){
            System.out.println(name.substring(0,1).toUpperCase()+
                    name.substring(1).toLowerCase()+ " " +
                    surName.substring(0,1).toUpperCase()+surName.substring(1).toLowerCase());
        }else {
            System.out.println(name.substring(0,1).toUpperCase()+
                    name.substring(1).toLowerCase()+ " " +surName.toUpperCase());
        }

         */

        /*
        Soru 6 : Kullanicidan alinan bir String alin,
                String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
                String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        System.out.print("Lütfen bir kelime giriniz...: ");
        String kelime2= scan.nextLine();

        int keUzunluk = kelime2.length();
        if (keUzunluk%2==0){
            System.out.println("Girilen kelime..: "+ kelime2.substring(0,keUzunluk/2)+":)"+kelime2.substring((keUzunluk/2)));
        }else {
            System.out.println("Girilen kelime..: "+ kelime2.substring(0,keUzunluk/2)+"(:"+kelime2.substring((keUzunluk/2+1)));
        }

         */






    }
}
