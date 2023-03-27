package Const.Ders_aninda_practis;

import java.util.Scanner;

public class methodSoru_1 {
    static String sayi="";
    public static void main(String[] args) {
        /*
        Kulanıcıdan bir sayı alın, terse döndürün ve yazdırın.

         */
        sayiTersCevir();
        System.out.println(voidOlmayanTersSayiMethodu(sayi));
    }
    public static void sayiTersCevir(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz....: ");
        String sayi = scan.next();
        String tersSayi ="";

        for (int i =sayi.length()-1; i >=0 ; i--) {
            tersSayi += sayi.charAt(i);
        }
        System.out.println("Girilen Sayinin Ters Hali...: "+tersSayi);

    }

    public static String voidOlmayanTersSayiMethodu(String sayi){
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz...: ");
        sayi = scan.next();
        String tersSayi1="";

        for (int i = sayi.length()-1; i >=0 ; i--) {
            tersSayi1+=sayi.charAt(i);
        }
        return tersSayi1;
    }
}
