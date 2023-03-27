package Const.Team113_ogrenciPratikDersleri;

import day21_arrayList_forEachLoop.C04_KarelerinToplami;
import day22_constructor.C02_Hemsire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class cons_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> isimler = new ArrayList<>();
        C04_KarelerinToplami obje = new C04_KarelerinToplami();
        Random rnd = new Random();

        C02_Hemsire hemsire1 = new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5));



    }
}
