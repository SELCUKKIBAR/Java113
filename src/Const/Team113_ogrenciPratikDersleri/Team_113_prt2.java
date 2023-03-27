package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class Team_113_prt2 {

    public static void main(String[] args) {

        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("İki basamaklı bir sayı giriniz...:");

        int sayi = scan.nextInt();


        if (sayi>=10 && sayi<=99){

            int birler = sayi%10;

            int onlar = sayi/10;

            switch (onlar){
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi ");
                    break;
                case 3:
                    System.out.print("otuz ");
                    break;
                case 4:
                    System.out.print("kırk ");
                    break;
                case 5:
                    System.out.print("elli ");
                    break;
                case 6:
                    System.out.print("altmış ");
                    break;
                case 7:
                    System.out.print("yetmiş ");
                    break;
                case 8:
                    System.out.print("seksen ");
                    break;
                case 9:
                    System.out.print("doksan ");
                    break;

            }switch (birler){
                case 0:
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.print("bir ");
                    break;
                case 2:
                    System.out.print("iki ");
                    break;
                case 3:
                    System.out.print("üç ");
                    break;
                case 4:
                    System.out.print("dört ");
                    break;
                case 5:
                    System.out.println("beş ");
                    break;
                case 6:
                    System.out.print("altı ");
                    break;
                case 7:
                    System.out.print("yedi ");
                    break;
                case 8:
                    System.out.print("sekiz ");
                    break;
                case 9:
                    System.out.print("dokuz ");
                    break;

            }

        }else{
            System.out.println("Lütfen sadece iki basamaklı sayı giriniz....");
        }


    }
}
