package Const.Team113_ogrenciPratikDersleri;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class gun25_2 {
    public static void main(String[] args) {

        //String str1= "Java";
        //String str2 = "Java";
        //String str3 = new String("Java");
       //String str4 = "Ja"+"va";
       //String s = "Ja";
       //String t = "va";
       //String str5 = s.concat(t);//Java

       //System.out.println(str1.equals(str2));//True
       //System.out.println(str1.equals(str3));//True
       //System.out.println(str1.equals(str4));//True
       //System.out.println(str1.equals(str5));//True

       //System.out.println("=============");

       //System.out.println(str1==str2);//True
       //System.out.println(str1==str3);//false
       //System.out.println(str1==str4);//True
       //System.out.println(str1==str5);//false

        LocalTime saat = LocalTime.now();
        LocalDate tarih = LocalDate.now();
        LocalDateTime tarih_saat = LocalDateTime.now();
        //System.out.println(saat);
        //System.out.println(tarih);
        //System.out.println(tarih_saat);

        System.out.println(saat.getNano());
        int toplam = 0;

        int baslamazamani = saat.getNano();


        for (int i = 1; i <100001 ; i++) {
            toplam +=i;
        }
        System.out.println(toplam);
        int bitiszamani = saat.getNano();


    }
}
