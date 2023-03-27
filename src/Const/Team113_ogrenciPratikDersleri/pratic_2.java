package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class pratic_2 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
        Yil daha calisman gerekir” yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Yaşını giriniz..:");
        int yas = scan.nextInt();

        System.out.println("Cinsiyetinizi giriniz E-K");
        char cinsiyet = scan.next().toLowerCase().charAt(0);

        System.out.println("Ten renginizi giriniz....:B-S");
        char ten = scan.next().toLowerCase().charAt(0);


        if (cinsiyet == 'e') {

            if (yas >= 65) {
                if (ten == 's') {
                    System.out.println("Emekli olabilirsiniz....");
                } else if (ten == 'b') {
                    System.out.println("Sen hiç emekli olamazsın....");
                } else {
                    System.out.println("Yalnış ten rengi girdiniz...");
                }
            } else {
                System.out.println("emekli olmak için..." + (65 - yas) + " .yıl daha çalışmanız gerekiyor");
            }

        } else if (cinsiyet == 'k') {
            if (yas >= 60) {
                if (ten == 's') {
                    System.out.println("Emekli olabilirsiniz...");
                } else if (ten == 'b') {
                    System.out.println("Sen hiç emekli olamazsın....");
                } else {
                    System.out.println("Yalnış ten rengi girdiniz...");
                }
            } else {
                System.out.println("emekli olmak için..." + (60 - yas) + " .yıl daha çalışmanız gerekiyor");
            }
        } else {
            System.out.println("Yalnış veri cinsiyet girdiniz....");

        }
    }
}
