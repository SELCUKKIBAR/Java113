package Const.Team113_ogrenciPratikDersleri;

import java.util.Scanner;

public class methodSoru_4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin.
                Girilen sayinin pozitif tam bolenleri sayisini bulup
                bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz....: ");
        int sayi = scan.nextInt();

        System.out.println(tamBolenleriDondur(sayi));


    }
    public static int tamBolenleriDondur(int sayi){
        int flag = 0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                System.out.print(i+" ");
            }
        }
        return flag;
    }
}
