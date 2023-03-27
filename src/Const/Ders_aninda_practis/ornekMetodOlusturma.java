package Const.Ders_aninda_practis;

import java.util.Scanner;

public class ornekMetodOlusturma {
    //static int carpma=1;
    static int sayi1 = 1;
    static int sayi2 =1;
    static int number=0;
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz....: ");
        int number = scan.nextInt();


         */
        birdenOnaKadarYazdir();
        //System.out.println("Çarpma işleminin sonucu...: "+ikiSayininCarpimiMethodu(sayi1, sayi2, carpma));
        System.out.println(ikiSayininCarpimiMethodu(sayi1,sayi2));

    }

    public static void birdenOnaKadarYazdir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz....: ");
        int sayix=scan.nextInt();

        for (int i = 1; i <=sayix ; i++) {
            System.out.print(i+" ");
        }
    }
    public static int ikiSayininCarpimiMethodu(int sayi1,int sayi2){

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayı giriniz....: ");
        sayi1 = scan.nextInt();

        System.out.println("İkinci sayı giriniz....: ");
        sayi2=scan.nextInt();



        return sayi1*sayi2;
    }
    public static double carpimMethodu(int sayi1,int sayi2){
        System.out.println("carpim method'u calisti");
        return sayi1*sayi2;

}
}
