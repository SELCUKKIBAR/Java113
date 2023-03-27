package Const.Team113_ogrenciPratikDersleri;

import java.util.Arrays;
import java.util.Scanner;

public class arraySoru_1 {
    public static void main(String[] args) {
        /*
        soru-1Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.
         */

        /*
       soru2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
         */

        /*
        Soru 3 - Verilen bir array’deki tum elementleri bir saga kaydirip,
                sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.

                Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */



        //int [] arr = new int[];
        //arr = elemanlari2Arttir(arr, 7);
        //System.out.println(Arrays.toString(arr));
        //System.out.println(poztifleriTopla(arr));
        //arr=elemanlarinYeriniKaydir(arr);
        //System.out.println(Arrays.toString(arr));
        //verilenElemanKactaneVar(arr,2);
        //System.out.println(boyutVeelemanlariAlipArryapma());

        //String [] arr = {"selçuk","dilan","çiğdemm","ali","muhammed"};
        //enUzunveEnkisaKelimeyiYazdiran(arr);

        System.out.println(istenenElemaniEkle(9));


    }
    //array 1.soru çözüm methodu
    public static int [] elemanlari2Arttir(int [] arr, int artis){

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+= artis;
        }
        return arr;
    }
    //array2.soru çöüzüm methodu
    public static int poztifleriTopla(int []arr){

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }

        }
        return toplam;
    }
    public static int [] elemanlarinYeriniKaydir(int []arr){

        int soneleman = arr[arr.length-1];

        for (int i = 0; i <arr.length-1; i++) {


            arr[arr.length-1-i] = arr[arr.length-2-i];


        }
        arr[0] =soneleman;
        return arr;


    }
    public static void verilenElemanKactaneVar(int[]arr,int aranan){
        /*
        Soru4- Verilen bir array’de istenen bir elemanin var olup olmadigini
                ve varsa kac kere kullanildigini yazdiran bir method olusturun.
         */
        //int [] arr = {1,2,3,4,2,2,2,2,5,6,8,5,5,3,5};

        int sayac = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==aranan){
                sayac++;
            }

        }
        System.out.println("Aranan eleman "+sayac+" defa kullanılmış.");

    }

    public static String boyutVeelemanlariAlipArryapma(){

        /*
        Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Arrayın uzunlu ne kadar olacak...: ");
        int uzunluk = scan.nextInt();
        int []arr1 = new int[uzunluk];

        int geciciEleman;

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print("Elamanı giriniz...: ");
            geciciEleman = scan.nextInt();
            arr1[i]=geciciEleman;


        }
        return Arrays.toString(arr1);
    }

    public static void enUzunveEnkisaKelimeyiYazdiran(String []arr){
        /*
    Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

    String [] arr = {"selçuk","dilan","çiğdemm"};
     */
       String  kisa = arr[2];
       String  uzun = arr[2];

        for (int i = 0; i < arr.length; i++) {
            if (kisa.length() >= arr[i].length()){
                kisa=arr[i];
            }
        }
        System.out.println("En kısa kelime...: "+ kisa);

        for (int i = 0; i < arr.length; i++) {
            if (uzun.length() <= arr[i].length()){
                uzun=arr[i];
            }
        }
        System.out.println("En uzun kelime ...:"+ uzun);
    }
    public static String istenenElemaniEkle(int eleman){


        int []arr = new int[]{1, 2, 3};
        int [] newArr = new int[arr.length+1];

        for (int i = 0; i <=arr.length-1 ; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=eleman;
        arr=newArr;
        return Arrays.toString(arr);
    }
    /*
    Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin, eski array’e yeni degeri atayin.
     */

}
