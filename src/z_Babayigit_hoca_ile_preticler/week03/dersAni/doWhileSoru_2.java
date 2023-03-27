package z_Babayigit_hoca_ile_preticler.week03.dersAni;

import java.util.Scanner;

public class doWhileSoru_2 {

    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
                edin ve sifredeki hatalari yazdirin.
                Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
                “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
         */


        Scanner scan = new Scanner(System.in);

        boolean kckHrf = false;
        boolean bykHrf = false;
        boolean ozlKrk = false;
        boolean uznlk = false;


        String sifre = "";

        do {

            System.out.print("Şifrenizi giriniz....: ");
            sifre = scan.nextLine();


            for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                    kckHrf = true;
                } else if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                    bykHrf = true;
                } else if (sifre.charAt(i) >= 33 && sifre.charAt(i) <= 64) {
                    ozlKrk = true;
                }
            }
            if (sifre.length() < 8) System.out.println("Şifreniz en az 8 karakter olmalıdır...");
            if (!kckHrf) System.out.println("Şifre küçük harf içermeli");
            if (!bykHrf) System.out.println("Şifre büyük harf içermeli");
            if (!ozlKrk) System.out.println("Şifre özel karakter içermeli");

        } while (sifre.length() < 8 || !kckHrf || !bykHrf || !ozlKrk);

        System.out.println("Şifreniz başarılı bir şekilde kayıt edilmiştir.");
    }
}
