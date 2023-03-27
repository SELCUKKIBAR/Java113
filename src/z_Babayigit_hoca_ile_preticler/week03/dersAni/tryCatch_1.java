package z_Babayigit_hoca_ile_preticler.week03.dersAni;

import java.util.Scanner;

public class tryCatch_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz....: ");
        int yas = scan.nextInt();


        try {
            if (yas<0){
                throw new IllegalArgumentException("Yalnış formatta giriş yapıldı");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }

}
