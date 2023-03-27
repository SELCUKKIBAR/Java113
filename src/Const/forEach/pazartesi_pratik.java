package Const.forEach;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class pazartesi_pratik {
    /*
    Bu uygulama bir Arraye random olarak oluşturulan 10 tarih ekleyin
    ve bu tarihleri en eskiden yeniye doğru sıralayınız.

    Yil degiskeni icin 2013 ila 2022 arasinda random sayi uretin
    Ay degiskeni icin 1 ila 12 arasinda random sayi uretin
    Gun degiskeni icin 1 ila 28 arasinda random sayi uretin

    LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin
    ve random tarih uretin

*/
    static LocalDate tarihler[] = new  LocalDate[10];
    public static void main(String[] args) {


        Random rnd = new Random();

        for (int i = 0; i <10 ; i++) {
            int yil = rnd.nextInt(2013,2024);
            int ay = rnd.nextInt(1,13);
            int gun = rnd.nextInt(1,29);

            tarihOlustur(yil,ay,gun,i);
        }
        Arrays.sort(tarihler);
        for (LocalDate each:tarihler
             ) {
            System.out.println(each);
        }
    }
    private static void tarihOlustur(int yil, int ay, int gun, int index) {
        tarihler[index]=LocalDate.of(yil,ay,gun);
    }


}
