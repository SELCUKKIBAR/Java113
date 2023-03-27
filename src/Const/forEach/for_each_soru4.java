package Const.forEach;

import java.util.Scanner;

public class for_each_soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle giriniz....: ");
        String cumle = scan.nextLine();

        System.out.print("İstemediğiniz harfi giriniz...: ");
        String arananHrf = scan.nextLine().substring(0, 1);
        arananHarfSayisiniBulma(cumle, arananHrf);
    }

    public static void arananHarfSayisiniBulma(String cumle, String arananHrf) {
        String[] harfler = cumle.split("");

        int flag = 0;

        for (String each : harfler
        ) {
            if (each.equalsIgnoreCase(arananHrf)) {
                flag++;
            }
        }

        if (flag == 0) {
            System.out.println("Aranan harf cümlede hiç kullanılmamştır... ");
        } else {
            System.out.println("Aranan harf cümlede " + flag + ". kere kullanılmıştır");
        }
    }
}
