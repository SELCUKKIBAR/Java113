package Const.Team113_ogrenciPratikDersleri;

public class methodOverloading_1 {
    public static void main(String[] args) {

        int sayi1 = 12;
        int sayi2 = 11;
        int sayi3 = 19;
        double sayi4 = 8.8;
        double sayi5 = 2.2;
        double sayi6 = 5.9;


        System.out.println(toplama(sayi1, sayi2));
        System.out.println(toplama(sayi3, sayi4));
        System.out.println(toplama(sayi5, sayi6));


    }
    public static int toplama(int sayi1,int sayi2){
        int toplama = sayi1+sayi2;
        System.out.println("İki int sayının toplamı...: "+toplama);
        return toplama;
    }
    public static double toplama(int sayi3,double sayi4){
        double toplama = sayi3+sayi4;
        System.out.println("Bir int bir double sayının toplamı...: "+toplama);
        return toplama;
    }
    public static double toplama(double sayi5, double sayi6){
        double toplama = sayi5+sayi6;
        System.out.println("İki double sayının toplamı...: "+toplama);
        return toplama;
    }
}
