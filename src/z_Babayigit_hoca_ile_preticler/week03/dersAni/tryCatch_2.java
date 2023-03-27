package z_Babayigit_hoca_ile_preticler.week03.dersAni;

public class tryCatch_2 {

    public static void main(String[] args) {

        // sayı 0 dan küçükse şartlı satırlar çalışmasın

        int sayi = -10;

        try {


            if (sayi<0){
                throw new IllegalArgumentException(("SAYI NEGATİF OLMAMALI"));
            }

            System.out.println("Şartlı çalışacak satir 1 ");
            System.out.println("Şartlı çalışacak satir 2 ");
            System.out.println("Şartlı çalışacak satir 3 ");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


        System.out.println("Yola devam");


    }
    }
