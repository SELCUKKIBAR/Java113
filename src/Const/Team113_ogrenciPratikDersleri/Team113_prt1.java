package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class Team113_prt1 {

    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan gunu ismini girmesini isteyin,
        girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile daha var"
          seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
         girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanın kaçıncı günündeyiz...: ");
        int gunNmr= scan.nextInt();

        switch (gunNmr){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("yalnış gün seçimi....");


        }





    }
}

