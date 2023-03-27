package Const.LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalTime {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);

        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman);

        System.out.println(zaman.getMonthValue());

        java.time.LocalTime saat = java.time.LocalTime.now();
        System.out.println(saat);

        LocalDate dogmTarihi = LocalDate.of(1987,12,18);
        System.out.println(dogmTarihi);
        //int hesapla = tarih-dogmTarihi;

        Period yas = Period.between(dogmTarihi,tarih);
        System.out.println(yas);
        System.out.println(yas.getYears());

    }
}
