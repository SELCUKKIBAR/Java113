package Const.Ders_aninda_practis;

public class Pratik3_3 {
    public static void main(String[] args) {

        /*
        1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
        *** String icin equals method'unusalı kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Gün ismini giriniz...: ");
        String dayName = scan.nextLine().toUpperCase();

        if (dayName.equals("CUMARTESİ") || dayName.equals("PAZAR")) {
            System.out.println("Hafta Sonu");
        } else if (dayName.equals("PAZARTESİ") || dayName.equals("SALI") || dayName.equals("ÇARŞAMBA") || dayName.equals("PERŞEMBE") || dayName.equals("CUMA")) {
            System.out.println("Hafta İçi");
        } else {
            System.out.println("Yalnış bir gün ismi girdiniz..");
        }*/

        String str = "seyhan yavuz";
        System.out.println(str.replace("s", "S").replace("y", "Y"));

        System.out.println(str.replaceAll("s", "S").replaceAll("y", "Y"));
        System.out.println(str.replace('s', 'S').replace('y', 'Y'));
        //System.out.println(str.replaceAll('s', 'S').replaceAll('y', 'Y'));

        String text = "Can, Cananlara gitmek icin can atiyor";

        System.out.println(text.replace("Can", "Turk"));
    }
}
