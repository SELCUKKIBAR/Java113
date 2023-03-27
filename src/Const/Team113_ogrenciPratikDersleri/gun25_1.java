package Const.Team113_ogrenciPratikDersleri;

import java.util.ArrayList;
import java.util.List;

public class gun25_1 {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);
        elemenleriArtir(sayilar);
        System.out.println(sayilar);
        yeniListeAta(sayilar);
        System.out.println(sayilar);

    }

    public static void elemenleriArtir(List<Integer> sayilar){
        // tüme elemenleri 2 katına çıkaralım..

        for (int i = 0; i <sayilar.size() ; i++) {

            sayilar.set(i,2*sayilar.get(i));

        }
        System.out.println(sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){
        // sayilar listesine yeni bir list değer atatyıp
        // sonra 1,2,3 elemnlerini ekleyin.

        sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        System.out.println("yeni liste ata methodu..: "+sayilar);


    }





}
