package Const.Ders_aninda_practis;

import java.util.Scanner;

public class subat24_practis {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ücgenin kenar uzunluklarını giriniz..:");
        int knr1=scan.nextInt();
        int knr2=scan.nextInt();
        int knr3=scan.nextInt();

        String s = knr1 == knr2 && knr2 == knr3
                ? "Eskenar Ücgen"
                : "Eskenar Ücgen Degil";
        System.out.println(s);
    }
}
