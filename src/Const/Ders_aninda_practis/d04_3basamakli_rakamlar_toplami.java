package Const.Ders_aninda_practis;

import java.util.Scanner;

public class d04_3basamakli_rakamlar_toplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz...:");

        int sayi = scan.nextInt();

        int rakam = sayi%10;
        int toplam = 0;
        toplam+=rakam;

        sayi=sayi/10;
        rakam=sayi%10;
        toplam+=rakam;

        sayi=sayi/10;
        rakam=sayi%10;
        toplam+=rakam;
        System.out.println(toplam);


    }
}
