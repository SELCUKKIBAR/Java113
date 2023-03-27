package Const.Ders_aninda_practis;

import java.util.Scanner;

public class For_sorulari_cozumleri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        /*soru-1: 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak yazdirin.


        for (int i = 1; i <=50; i++) {
            System.out.print(i+" ");
        }

         */




        /*soru2 - Kullanicidan pozitif bir tamsayi alin,
               // 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.


        System.out.print("Lütfen bir sayı giriniz....: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <=sayi; i++) {
            if (i%7==0 && i%5==0 ){
                System.out.print(i+" ");
            }
        }

         */

        /*
        Soru-3: Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
                sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
                Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        System.out.print("Lütfen bir başlangıç değeri giriniz...: ");
        int baslangic = scan.nextInt();
        System.out.print("Lütfen Bir bitiş değeri giriniz...: ");
        int bitis = scan.nextInt();
        int toplam =0;

        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                if (i%4==0){
                    toplam+=i;
                }

            }
            System.out.println("Girilen iki değer arasındaki sayıların toplamı...: "+toplam);
        }else {
            System.out.println("Başlangıç değeri Bitiş değerinden büyük olamaz....");
        }

         */

        /*Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin. // 63 ' bakmayı unutma....



        System.out.print("Lütfen bir sayı giriniz...: ");
        int newSayi = scan.nextInt();
        int faktoriyel = 1;

        for (int i = newSayi; i >=1 ; i--) {

            faktoriyel*=i;
        }
        System.out.println(faktoriyel);

         */

        /*
        Soru-5 : Kullanicidan 20’den kucuk bir sayi alip,
                  bu sayinin faktoryel degerini hesaplayin.
                  Konsolda faktoryel hesabinin yapilisini da yazdirin.
                 Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */
        /*
        System.out.println("20'den küçük bir sayı giriniz...: ");
        int sayi2=scan.nextInt();

        int fatoriyel2 = 1;

        for (int i = sayi2; i>1; i--) {
            fatoriyel2*=i;
            System.out.print(i+"*");
        }
        System.out.print("1 = "+fatoriyel2);

         */
        /*Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        //String sayi3 = scan.nextLine();
        int number = scan.nextInt();

        int toplam2= 0;

        for (int i =number; i>=1;i--) {
            toplam2+= number%10;
            number=number/10;


        }
        System.out.println("Girilen Sayinin Rakamları Toplami...= "+toplam2);

         */
        /*soru-8: Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
                    - 3 ile bolunebilen bir sayiya gelirse, sayi yerine FİZZ
                     - 5 ile bolunebilen bir sayiya gelirse sayi yerine BUZZ
                    - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine FİZZBUZZ yazdirin

        System.out.print("Bir sayi giriniz...: ");
        int num3=scan.nextInt();
        for (int i = 1; i <=num3; i++) {
            if (i%15==0){
                System.out.print("FİZZBUZZ,");
            } else if (i%3==0) {
                System.out.print("FİZZ,");
            } else if (i%5==0) {
                System.out.print("BUZZ,");
            }else {
                System.out.print(i+",");
            }
        }
         */
        /*
        Soru 9 (interview)-  Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
                            kaydedin.


        System.out.println("Lütfen bir kelime giriniz....: ");
        String newKelime=scan.nextLine();
        String tersKelime="";

        for (int i =newKelime.length()-1; i>=0; i--) {
            tersKelime+=newKelime.charAt(i);
        }
        System.out.println("Kelimenin ters hali..: "+tersKelime);

         */
        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
                 sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.
         */
        System.out.println("Bir sayi giriniz...: ");
        int sayix=scan.nextInt();
        int flag = 0;

        for (int i = 2; i <sayix ; i++) {
            if (sayix%i==0){
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girilen Sayi ASAL");
        }else {
            System.out.println("Girilen Sayi Asal Değil");
        }



    }
}
