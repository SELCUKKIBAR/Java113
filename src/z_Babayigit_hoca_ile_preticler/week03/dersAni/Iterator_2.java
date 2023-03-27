package z_Babayigit_hoca_ile_preticler.week03.dersAni;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator_2 {
    public static void main(String[] args) {

        //int [] arr = {3,8,1,9,15};
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(7);

        ListIterator lit = sayilar.listIterator();
        while (lit.hasNext()) {
            Integer sayi = (Integer) lit.next();
            lit.set(sayi+3);

        }
        System.out.println(sayilar);







/*
        Iterator it1 = sayilar.iterator();

        while (it1.hasNext()) {

            Integer sayi = (Integer) it1.next();
            if (sayi % 2 == 0) {
                it1.remove();
            }
        }
        System.out.println(sayilar);

 */
    }
}
