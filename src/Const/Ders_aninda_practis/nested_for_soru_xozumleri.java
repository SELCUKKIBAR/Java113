package Const.Ders_aninda_practis;

import java.util.Scanner;

public class nested_for_soru_xozumleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.print("Sutun sayısını giriniz... :");
        int sutun = scan.nextInt();

        System.out.print("Sayır sayısını giriniz...: ");
        int satir = scan.nextInt();

        for (int i = 1; i <=sutun; i++) {
            for (int j = 1; j <=satir; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();

        }

         */
        //System.out.print("Sutun sayısını giriniz... :");
        //int sutun = scan.nextInt();

        System.out.print("Sutun sayısını giriniz...: ");
        int sutun = scan.nextInt();

        for (int i = 1; i <=sutun ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int m = sutun-1; m >0 ; m--) {
            for (int n = 1; n <=m ; n++) {
                System.out.print(n+" ");
            }
            System.out.println();
        }






    }
}
