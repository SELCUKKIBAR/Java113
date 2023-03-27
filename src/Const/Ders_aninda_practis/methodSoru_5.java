package Const.Ders_aninda_practis;

import java.util.Scanner;

public class methodSoru_5 {
    static int sayi=0;
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin.
                Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz....: ");
        sayi = scan.nextInt();

        System.out.println(tamBolenlerMethodu());

    }
    public static int tamBolenlerMethodu(){
        int flag = 0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                System.out.print(i+",");
            }
        }
        return flag;
    }
}
