package Const.Ders_aninda_practis;

import java.util.Arrays;
import java.util.Scanner;

public class Array_soru_1 {

    public static void main(String[] args) {
        // verilen bir arrydeki elemanları 2 artıran
        // ve bize döndüren method yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Arrydeki elemenları kaç artıracaksınız..:");
        int artis= scan.nextInt();

        int [] arr ={3,4,5,6};
        arr=arryElemetleriniArttir(arr,artis);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arryElemetleriniArttir(int[]ilkArr,int artis){

        for (int i = 0; i < ilkArr.length; i++) {
            ilkArr[i]+=artis;
        }return ilkArr;
    }
}
