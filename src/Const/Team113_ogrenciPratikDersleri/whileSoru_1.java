package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class whileSoru_1 {
    public static void main(String[] args) {
        String sifre="";
        sifreTrueMi(sifre);
    }
    public static void sifreTrueMi(String sifre){
        Scanner scan = new Scanner(System.in);
        sifre="";


        boolean sifreDogrumu=false;
        char ilkKrk;
        char sonKrk;

        while (!sifreDogrumu){
            System.out.print("Şifrenizi Giriniz...: ");
            sifre = scan.nextLine();
            ilkKrk = sifre.charAt(0);
            sonKrk = sifre.charAt(sifre.length()-1);

            if (ilkKrk<'a' || ilkKrk>'z'){
                System.out.println("Şifrenin ilk Karakteri KÜÇÜK HARF OLMALI");
            } else if (sonKrk<'0' || sonKrk>'9') {
                System.out.println("Şifrenin son Karakteri RAKAM OLMALI");
            }else {
                System.out.println("Şifre BAŞARILI BİR ŞEKİLDE KAYIT EDİLDİ...");
                sifreDogrumu = true;
            }
        }
    }
}
