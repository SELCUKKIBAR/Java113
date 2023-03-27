package Const.Team113_ogrenciPratikDersleri;

import java.time.LocalDate;
import java.time.Period;

public class dogumtarihi {
    public static void main(String[] args) {
        LocalDate dogum = LocalDate.of(1988,1,1);
        LocalDate bugun = LocalDate.now();
        System.out.println(Period.between(dogum, bugun));
        System.out.println("Yas : "+Period.between(dogum,bugun).getDays());
    }
}
