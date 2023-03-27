package Const.Ders_aninda_practis;

import java.util.Scanner;

public class d05_if3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sırası ile üçgenin kenar uzunluklarını giriniz");

        double k1 = scan.nextInt();
        double k2 = scan.nextInt();
        double k3 = scan.nextInt();

        if (k1==k2 && k1==k3 ){
            System.out.println("Girilen üçgen EŞ KANAR ÜÇGENDİR");
        }

    }
}
