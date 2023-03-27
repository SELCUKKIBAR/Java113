package z_Babayigit_hoca_ile_preticler.week03.dersAni;

import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        /*
        Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
bir method olusturun.
- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
mesaji verin
- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
yazdirin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz...: ");

        String kelime =scan.nextLine();
        System.out.print("Başlangıç İndexi Giriniz...: ");
        int baslangic = scan.nextInt();
        System.out.print("Bitiş İndexi Giriniz...: ");
        int bitis = scan.nextInt();

        baslangicBitisIndexYazdir(kelime,baslangic,bitis);
    }

    public static void baslangicBitisIndexYazdir(String kelime,int baslangic,int bitis){
        String output ="";

        if (baslangic>bitis){
            System.out.println("HATA...: Başlangıç indexi Bitiş indexinden büyük olamaz....");
        } else if (baslangic>kelime.length()-1 || bitis>kelime.length()-1) {
            System.out.println("HATA...: Başlangıç indexi yada Bitiş indexi kelimenin son indexinden " +
                    "büyük olmaz...");
        }else {
            kelime=kelime.replace(" ","");
            for (int i = baslangic; i <bitis ; i++) {
                output+=kelime.charAt(i)+",";

            }
            System.out.println(output);

            System.out.println(kelime.substring(baslangic,bitis));
        }

    }

}
