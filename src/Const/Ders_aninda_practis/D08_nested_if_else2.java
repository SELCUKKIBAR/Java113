package Const.Ders_aninda_practis;

import java.util.Scanner;

public class D08_nested_if_else2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz..:");
        int age = scan.nextInt();

        System.out.println("Lutfen cinsiyetinizi giriniz..:");
        char cinsiyet = scan.next().charAt(0);

        if (age < 16 || age > 80) {
            System.out.println("Gecersiz yas girdiniz" +
                    "tekrar deneyiniz");
        } else if (age < 60) {
            if (cinsiyet == 'k' || cinsiyet == 'K') {
                System.out.println("Emekli olmaniz icin " +
                        (60 - age) + " .yıl daha calismaniz gerekiyor");
            } else if (cinsiyet == 'e' || cinsiyet == 'E') {
                System.out.println("Emekli olmaniz icin " +
                        (65 - age) + " .yıl daha calismaniz gerekiyor");
            } else {
                System.out.println("Gecersiz cinsiyet girdiniz");
            }
        } else if (age < 65) {
            if (cinsiyet == 'k' || cinsiyet == 'K') {
                System.out.println("Emekli olabilirsiniz");
            } else if (cinsiyet == 'e' || cinsiyet == 'E') {
                System.out.println("Emekli olmaniz icin " +
                        (65 - age) + " .yıl daha calismaniz gerekiyor");
            }
        }
        else {
            if (cinsiyet == 'e' || cinsiyet == 'E' | cinsiyet == 'k' || cinsiyet == 'K') {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Gecersiz cinsiyet girisi");
            }

        }
    }
}
