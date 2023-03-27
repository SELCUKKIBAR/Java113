package Const.forEach;

import java.util.ArrayList;
import java.util.Scanner;

public class pazartesi_pratik2 {

    public static void main(String[] args) {
        /*
        Girilen desimal değeri
        binary değere çeviren methodu oluşturunuz

        örnek => 12 = 1100
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Desimal Değeri Giriniz...: ");
        int sayi = scan.nextInt();

        System.out.println(sayi + " Desimal değerinin Binnary karşılığı...= "+binarryDonusum(sayi));

    }

    private static ArrayList<Integer> binarryDonusum(int sayi) {
        ArrayList<Integer> binary = new ArrayList<>();

        while (sayi>=1){
            binary.add(sayi%2);
            sayi/=2;
        }
        //Collections.reverse(binary); bu da olur

        ArrayList<Integer>tersListe = new ArrayList<>();
        for (int i = binary.size()-1; i >=0 ; i--) {
            tersListe.add(binary.get(i));

        }
        return tersListe;
    }
}
