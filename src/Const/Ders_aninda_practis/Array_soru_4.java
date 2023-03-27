package Const.Ders_aninda_practis;

import java.util.Arrays;

public class Array_soru_4 {
    public static void main(String[] args) {
        //verilen int bir arrydeki tüm elmentleri bir sağa kaydırıp,
        //sondaki elementi de en başa alıp kaydedin.
        // ör: [3,4,5,6]>>>>>>>[6,3,4,5]

        int []arr= {3,4,5,6};
        int temp =arr[arr.length-1];

        for (int i = 0; i <arr.length-1 ; i++) {
            arr[arr.length-1-i]=arr[arr.length-2-i];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
