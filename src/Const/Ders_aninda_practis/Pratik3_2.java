package Const.Ders_aninda_practis;

import java.util.Scanner;

public class Pratik3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki ondalıklı sayı giriniz...:");

        double num1=scan.nextDouble();
        double num2=scan.nextDouble();

        int bolum = (int)(num1)/(int)(num2);
        System.out.println(bolum);



    }
}
