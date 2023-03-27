package Const.Ders_aninda_practis;

import java.util.Arrays;

public class Array_soru_5 {
    public static void main(String[] args) {
        // verilen arrya e istenen elementi ekleyelim...

        int[]arr = {4,5,6};
        int eklenecekSayi=10;

        int[] yeniArr = new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];

        }
        yeniArr[yeniArr.length-1]=eklenecekSayi;
        arr=yeniArr;
        System.out.println(Arrays.toString(arr));
    }


}
