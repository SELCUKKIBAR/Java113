package Const.Ders_aninda_practis;

import java.util.Scanner;

public class methodSoru_4 {

    public static void main(String[] args) {
        /*
            Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
            Girilen sayinin asal sayi olup olmadigini kontrol edip,
            sonuc olarak “asal sayi” veya “asal sayi degil”
            sonuclarini donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz...:");
        int sayi=scan.nextInt();

        System.out.println(asalMi(sayi));
        methodSoru_2.alinanStringiSonHarfHaricYazdirma();


    }
    public static String asalMi(int sayi){
        int flag = 0;
        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (flag==0){
            return "asal sayi" ;
        }else {
            return "asal sayi değil";
        }
    }
}
