package Const.Ders_aninda_practis;

import java.util.Scanner;

public class D08_ternary_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunluğunu giriniz");

        int knr1 = scan.nextInt();
        int knr2 = scan.nextInt();
        int knr3 = scan.nextInt();

        System.out.println(knr1 == knr2 && knr1 == knr3
                ? "Eskenar Ucgen"
                : "Eskenar degil");
    }
}
