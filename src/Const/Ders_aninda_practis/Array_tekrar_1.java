package Const.Ders_aninda_practis;

import java.util.Arrays;

public class Array_tekrar_1 {
    public static void main(String[] args) {
        int [] arr = new int[]{99,12,0,23,48};
        int [] arr1 = new int[]{99, 12, 0, 23, 48};
       //System.out.println(Arrays.toString(arr));
       //System.out.println(Arrays.toString(arr1));
       //System.out.println(arr.length);
       //System.out.println(arr1.length);


       //System.out.println(arr1[3]);

       //for (int i = 0; i <arr1.length ; i++) {
       //    System.out.print(arr1[i]+" ");

       //}
       //System.out.println(" ");

       //System.out.println(Arrays.binarySearch(arr1,99));

       //Arrays.sort(arr1);
       //System.out.println(Arrays.toString(arr1));
       //System.out.println(arr1[3]);

       //System.out.println(Arrays.binarySearch(arr1,99));

       //Arrays.sort(arr);
       //System.out.println(Arrays.equals(arr,arr1));

        String kelime = "Java candir gerisi heycandır birader";

        String [] arrKelime = kelime.split(" ");
        System.out.println(Arrays.toString(arrKelime));
        String [] arrhiclik = kelime.split("");
        System.out.println(Arrays.toString(arrhiclik));
    }





}
