package Const.Ders_aninda_practis;

import java.util.Scanner;

public class D08_ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giiriniz...:");
        int sayi = scan.nextInt();

        /*if (sayi>=0){
            System.out.println(sayi);
        }else{
            sayi=sayi*(-1);
            System.out.println(sayi);
        }

         */

        System.out.println(sayi = sayi >= 0 ? sayi : sayi * (-1));
    }
}
