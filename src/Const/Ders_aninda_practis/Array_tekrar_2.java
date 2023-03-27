package Const.Ders_aninda_practis;

import java.util.Arrays;

public class Array_tekrar_2 {
    public static void main(String[] args) {


        int [] arr = {2,5,7,8,2,0,5,5,8};
        System.out.println(Arrays.toString(arr));


        //for (int i = 0; i <arr.length ; i++) {
        //    arr[i]+=5;
        //}
        //System.out.println(Arrays.toString(arr));

        //arr = elemetleriArtirma(arr,9);
        //System.out.println(Arrays.toString(arr));

        System.out.println(elementVarmi(arr, 5));


    }
    public static int[] elemetleriArtirma(int []arr1,int artis){
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]+=artis;
        }
        return arr1;
    }

    public static int elementVarmi(int[]arr1, int aranan){
        int sayac = 0;

        for (int i = 0; i <arr1.length ; i++) {

            if (arr1[i]==aranan){
                sayac++;
            }

        }
        return sayac;
    }
}
