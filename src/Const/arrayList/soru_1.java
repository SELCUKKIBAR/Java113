package Const.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru_1 {
    public static void main(String[] args) {
        //System.out.println(kullaniciyaListeOlusturtma());
        //List<String>liste = kullaniciyaListeOlusturtma();
        //Scanner scan = new Scanner(System.in);
        //System.out.println("İstenmeyen harfi giriniz.... : ");
        //String istenmeyenHarf = scan.next().substring(0,1);
        //System.out.println(istenmeyenHarfIcerenleriSil(liste, istenmeyenHarf));


        //Scanner scan = new Scanner(System.in);
        //System.out.println("Bir sayı giriniz....: ");
        //int sayi = scan.nextInt();
        //System.out.println(tamBolenleriniListeyeEkleme(sayi));


        int sayiAdedi = 5;
        System.out.println(istenenSayidaFibonacci(sayiAdedi));


    }
    public static List<String> kullaniciyaListeOlusturtma(){

        /*
        Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
         */
        List<String>isimler = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String girilenIsisim = "";

        do {
            System.out.println("Bir isim giriniz....:"+
                    "\n Bitirmek için Q ya basınız....:");
            girilenIsisim=scan.nextLine();

            if (!girilenIsisim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsisim);
            }


        }while (!girilenIsisim.equalsIgnoreCase("q"));
        return isimler;
    }
    public static List<String>istenmeyenHarfIcerenleriSil(List<String>liste,String istenmeyenHarf){

        /*
        Kullanicidan istedigi kadar isim alip,
        Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        bir method olusturun.
         */
        List<String>kalanListe = new ArrayList<>();
        for (int i = 0; i <liste.size() ; i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanListe.add(liste.get(i));
            }
        }
        return kalanListe;
    }

    public static String tamBolenleriniListeyeEkleme(int sayi){
        /*
        Kullanicidan pozitif bir tamsayi alip,
        o tamsayiyi tam bolebilen tum pozitif tamsayilari
        bir liste olarak bize donduren bir method olusturun.
         */

        List<Integer>sayilar = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                sayilar.add(i);
            }

        }
        System.out.println(sayilar);

        if (sayilar.size()>=10){
            return "Güzel";
        }else {
            return "Kötü";
        }



    }

    public static List<Integer> istenenSayidaFibonacci(int sayiAdedi){
        /*
        Kullanicidan pozitif bir tamsayi alip,
        o tamsayidan kucuk Fibonacci sayilarini
        bir liste olarak bize donduren bir method olusturun.
         */
        List<Integer>fibonacciSresi = new ArrayList<>();
        if (sayiAdedi<=0){
            System.out.println("HATA..: Negatif Değer Girilmez...");
        } else if (sayiAdedi==1) {
            fibonacciSresi.add(0);
        }else if (sayiAdedi==2){
            fibonacciSresi.add(0);
            fibonacciSresi.add(1);
        }else {
            int ilkSayi = 0;
            fibonacciSresi.add(ilkSayi);
            int  ikinciSayi = 1;
            fibonacciSresi.add(ikinciSayi);
            int yeniSayi = ilkSayi+ikinciSayi;
            fibonacciSresi.add(yeniSayi);

            while (fibonacciSresi.size()<sayiAdedi){
                ilkSayi=ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi=ilkSayi+ikinciSayi;
                fibonacciSresi.add(yeniSayi);
            }
        }
        return fibonacciSresi;


    }



}
