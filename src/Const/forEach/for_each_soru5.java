package Const.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class for_each_soru5 {
    public static void main(String[] args) {

        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip,
        ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.
         */
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] arr2 = {3, 4, 5, 6, 77, 88, 22};
        List<Integer> ortakelemanListesi = new ArrayList<>();
        for (Integer each1 : arr1) {
            for (Integer each2 : arr2) {
                if (each1.equals(each2)) {
                    ortakelemanListesi.add(each1);
                    break;
                }
            }
        }
        System.out.println("1.ARRAY.....................: " + Arrays.toString(arr1));
        System.out.println("2.ARRAY.....................: " + Arrays.toString(arr2));
        System.out.println("3.ORTAK ELEMANLAR LİSTESİ...: " + ortakelemanListesi);
    }
}
