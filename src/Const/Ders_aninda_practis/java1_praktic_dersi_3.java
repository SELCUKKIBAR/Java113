package Const.Ders_aninda_practis;

import java.util.Scanner;

public class java1_praktic_dersi_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı Giriniz :");
        String name = scan.next();

        System.out.println("Soyadınızı Giriniz :");
        String surName = scan.next();

        System.out.println("Yaşınızı Giriniz :");
        int age = scan.nextInt();

        System.out.println("Şifrenizi Giriniz :");
        String pasword = scan.next();

        System.out.println("Mail Adresinizi Giriniz :");
        String mail = scan.next();

        System.out.println("********** KAYIT BAŞARILI **********");
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+surName);
        System.out.println("Yaşınız: "+age);
        System.out.println("Mail: "+mail);
        System.out.println("Şifreniz: "+pasword);
    }
}
