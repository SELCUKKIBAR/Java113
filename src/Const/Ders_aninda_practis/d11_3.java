package Const.Ders_aninda_practis;

import java.util.Scanner;

public class d11_3 {
    public static void main(String[] args) {

        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
      - ilk harf kucuk harf olmali
      - son karakter rakam olmali
      - sifre bosluk icermemeli
      - uzunlugu en az 10 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz..:");

        String sifre = scan.nextLine();
        int flag = 0;

        if (sifre.length()>=10){
            flag++;
        }else {
            System.out.println("şifre en az 10 karakter olmalı");
        }
        if (sifre.charAt(0)>='a'&& sifre.charAt(0)<='z'){
            flag++;
        }else {
            System.out.println("Şifre küçük harf ile başlamalı");
        }
        if (sifre.contains("")){
            flag++;
        }else {
            System.out.println("Şifre boşluk içermemeli");
        }
        char sonHarf = sifre.charAt(sifre.length()-1);
        if (sonHarf>='0' && sonHarf<='9'){
            flag++;
        }else {
            System.out.println("şifrenin son karakteri rakam olmalı");
        }
        if (flag==4){
            System.out.println("Şifre başarılı");
        }


    }
}
