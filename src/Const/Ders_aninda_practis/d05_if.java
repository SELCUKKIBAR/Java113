package Const.Ders_aninda_practis;

import java.util.Scanner;

public class d05_if {
    public static void main(String[] args) {

        //kullanıcıdan sayı alın 5 in katı ise sayı 5in tam katı yazdırın...
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz...:");
        int num = scan.nextInt();

        if (num%5==0){
            System.out.println("Girilen Sayi 5'in tam katı....");
        }


    }
}
