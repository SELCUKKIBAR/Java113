package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class tkr_2 {
    public static void main(String[] args) {
        /*
        Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan
        ikisinin degerlerini degistirin(swap).
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("iki sayı giriniz...:");
        double sayi1 = scan.nextDouble(); // 10
        double sayi2 = scan.nextDouble(); // 12

        System.out.println("Sayi1: "+sayi1);
        System.out.println("Sayi2: "+sayi2);

        sayi1 =sayi1+sayi2;//22
        sayi2=sayi1-sayi2;//22-12 = 10
        sayi1=sayi1-sayi2;//22-10=12
        System.out.println("------------------------");

        System.out.println("Sayi1: "+sayi1);//12
        System.out.println("Sayi2: "+sayi2);//99



    }
}
