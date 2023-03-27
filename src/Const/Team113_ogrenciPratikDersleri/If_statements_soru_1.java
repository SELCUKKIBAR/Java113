package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class If_statements_soru_1 {
    public static void main(String[] args) {
        //SORU_1: kullanicidan sayi alın ,sayi 5 ile tam bölüne biliyorsa sayi 5 in katı yazdirin.

        Scanner scan = new Scanner(System.in);
        /*System.out.println("Bir sayi giriniz...:");
        int num1 = scan.nextInt();

        if (num1%5==0){
            System.out.println("Girilen Sayi 5'in Katidir...");
        }

         */


        //SORU_2:  Kullanicidan bir harf alın ve o harf ile başlayan ay isimlerini yazıdırınız.
        /*
        System.out.println("Bir harf giriniz...:");
        char hrf = scan.next().charAt(0);
        hrf=Character.toLowerCase(hrf);
        //System.out.println(hrf);

        if (hrf=='o'){
            System.out.println("OCAK");
        } else if (hrf=='s') {
            System.out.println("ŞUBAT");
        } else if (hrf=='m') {
            System.out.println("MART,MAYIS");
        } else if (hrf=='n') {
            System.out.println("NİSAN");
        } else if (hrf=='h') {
            System.out.println("HAZİRAN");
        } else if (hrf=='t') {
            System.out.println("TEMMUZ");
        } else if (hrf=='a') {
            System.out.println("AĞUSTOS,ARALIK");
        } else if (hrf=='e') {
            System.out.println("EYLÜL,EKİM");
        } else if (hrf=='k') {
            System.out.println("KASIM");
        }else {
            System.out.println("Girline harf ile başlayan bir AY ismi bulunmamaktadır");
        }
         */

        // SORU_3:Kullanicidan bir sayi aliniz 3 ile bölünürse 3 ile bölünüyor, 5 ile bölünüyor ise 5 ile bölünüyor,
        // 3 ve 5 bölünüyorsa 3 ve 5 e bölünen yazıdırınız.
       /*

        System.out.println("Bir sayi giriniz....:");
        double num2= scan.nextDouble();

        if (num2%3==0 && num2%5==0 ){
            System.out.println("Sayi 3 ve 5 ile tam bölünür");
        } else if (num2%3==0) {
            System.out.println("Sayi 3 ile tam bölünür");
        } else if (num2%5==0) {
            System.out.println("Sayi 5 ile tam bölünür");
        }else {
            System.out.println("Girilen sayı 3'e ve 5'e tam bölünmez");
        }

        */

        // SORU_4: kullanicidan bir üçgenin kenar uzunluklarını alın Eş kenar ise Eşkenar üçgen yazdırsın,
        /*


        // iki kenari eşit ise İkiz kenar üçgen yazdırsın
        // Hiçbir kenari eşit değilse ne ikiz ne eşkenar yazdırın

        System.out.println("Üçgenin kenar uzunluklarını giriniz..:");
        int knr1 = scan.nextInt();
        int knr2 = scan.nextInt();
        int knr3 = scan.nextInt();

        if (knr1==knr2 && knr1==knr3){
            System.out.println("Eş kenar üçgen");
        } else if (knr1==knr2 || knr1==knr3 || knr2==knr3) {
            System.out.println("İkiz kenar üçgen");
        }else {
            System.out.println("Girilen ölçülere göre üçgen İkiz kenar veya Eş kenar üçgen değil");
        }

         */

        // SORU_5: Kullanicidan notunu aliniz notu > 50 ise "Sınıfı Geçtin", Değil ise "Sınıfta Kaldın" yazdırınız.
        /*
        System.out.println("Notunuzu giriniz...:");
        int not = scan.nextInt();
        if (not<0 || not>100){
            System.out.println("Not 0 dan küçük yada 100 den büyük olamaz");
        }else if (not>=50 ){
            System.out.println("Sınıfı geçtiniz...");
        }else {
            System.out.println("Sınıfta kaldınız");
        }

         */
    }
}
