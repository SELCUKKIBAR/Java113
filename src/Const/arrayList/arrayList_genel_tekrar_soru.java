package Const.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList_genel_tekrar_soru {

    public static void main(String[] args) {

        // -----------list soru 2
        // System.out.println(kullanicanIsimAlveDondur());

        // --------------soru1
        //int []arr = {2,3,1,4,2,4,4,5,1,6,7,89,0};
        //System.out.println(Arrays.toString(tekrarliOlanlariSil(arr)));

        //-------soru 6
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Bir Sayı Giriniz....: ");
        //int sayi = scan.nextInt();
        //System.out.println(tamBolenleriDondur(sayi));

        //-------------------- soru 3
        //Scanner scan = new Scanner(System.in);
        //System.out.println("İstemedğiniz harfi giriniz....: ");
        //String istenmeyenHrf = scan.nextLine().substring(0,1);
        //System.out.println(istenmeyenHarfOlaniCikar(istenmeyenHrf));

        // ------------------ Soru 5-----------------------

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz....: ");
        int sayi = scan.nextInt();
        System.out.println(geriyeDogruFibonacci(sayi));


    }
    public static List<String> kullanicanIsimAlveDondur(){
        /*
    Kullanicidan istedigi kadar isim alip,
    Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
     */

        Scanner scan = new Scanner(System.in);
        String isim="";
        List<String>isimler =new ArrayList<>();
        do {
            System.out.println("İsim giriniz...: "+
                    "\n Bitirmek için Q ya basınız....");
            isim=scan.nextLine();

            if (!isim.equalsIgnoreCase("q")) {
                isimler.add(isim);
            }


        }while (!isim.equalsIgnoreCase("q"));

        return isimler; //[erdal]


    }

    public static int[] tekrarliOlanlariSil(int[]arr){
        /*
    Verilen bir array’de tekrar eden elementler icin,
    mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
     */

        List<Integer>yeniListe=new ArrayList<>();

        //int []arr = {2,3,1,4,2,4,4,5};



        for (int i = 0; i < arr.length; i++) {
            if (!yeniListe.contains(arr[i])){
                yeniListe.add(arr[i]); // 2,3,1,4,5 liste
            }
        }
        int [] arr1= new int[yeniListe.size()];

        for (int i = 0; i <yeniListe.size() ; i++) {
            arr1[i]=yeniListe.get(i);
        }
        return arr1;
    }

    public static List<Integer> tamBolenleriDondur(int sayi){ // 30

        /*
Kullanicidan pozitif bir tamsayi alip,
o tamsayiyi tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.
 */

        List<Integer>tamBolenler = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                tamBolenler.add(i); // 1,2,3,5,6,10..... 30
            }

        }
        return tamBolenler;

    }

    public static List<String> istenmeyenHarfOlaniCikar(String istenemenHrf){
        /*
        Verilen String bir listede istenmeyen harf iceren elementleri silip,
        kalan kismini list olarak bize donduren bir method olusturun
         */
        List<String >liste = kullanicanIsimAlveDondur();
        List<String >newListe = new ArrayList<>();

        for (int i = 0; i <liste.size() ; i++) {
            if (!liste.get(i).contains(istenemenHrf)){
                newListe.add(liste.get(i));
            }
        }
        return newListe;

    }

    public static List<Integer> geriyeDogruFibonacci(int sayi){
        /*
        Kullanicidan pozitif bir tamsayi alip,
        o tamsayidan kucuk Fibonacci sayilarini bir liste olarak bize donduren bir method olusturun.
         */


        List<Integer>fibonacciiiiii = new ArrayList<>();

        int num1 = 0;
        int num2 = 1;
        while (num1<sayi){
            fibonacciiiiii.add(num1);
            int num3 = num1+num2;
            num1=num2;
            num2=num3;
        }
        return fibonacciiiiii;
    }
}
