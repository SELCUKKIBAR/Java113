package Const.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class for_each_soru1 {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin,
        mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip
        eski array’e yeni halini atayip yazdirin.
         */


        int[] arr = {1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7, 8, 9, 0, 0, 0};

        List<Integer> benzersizListe = new ArrayList<>();

        for (int each : arr
        ) {
            if (!benzersizListe.contains(each)) {
                benzersizListe.add(each);
            }
        }
        System.out.println("Liste Hali =>       " + benzersizListe);
        arr = new int[benzersizListe.size()];
        System.out.println("arr'nin boş hali => " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = benzersizListe.get(i);
        }
        System.out.println("arr'nin son hali => " + Arrays.toString(arr));


    }


}
