package Const.Ders_aninda_practis;

import java.util.Scanner;

public class d05_if2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scan.nextInt();

        if (num%5==0){
            System.out.println("Sayı 5 in tam katı");
        }
        if (num%3==0){
            System.out.println("Sayı 3ün tam katı");
        }
        if (num%5==0 && num%3==0){
            System.out.println("Sayı hem 3ün hemde 5in tam katıdır");
        }


    }
}
