package Const.Ders_aninda_practis;

import java.util.Scanner;

public class doWhileSoru_3 {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
                tamkare ise true değilse false yazdırınız.

                Ornek : input : 16, output: 4
         */
        //tamKaremi();
        sifreDogrumu();

    }
    public static void tamKaremi(){
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean tamKaremi = false;
        do {
            System.out.print("Lutfen bir pozitif tam sayi girin: ");
            number = scanner.nextInt();

            for (int i = 1; i <number ; i++) {
                if(i * i == number) {
                    tamKaremi = true;
                    break;
                }
            }
        } while(number<0);

        if(tamKaremi) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void sifreDogrumu(){
        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin.
                Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
                Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
                “Sifreniz Kabul edilmistir” yazdirin.
                    - Sifre kucuk harf icermelidir
                    - Sifre buyuk harf icermelidir
                    - Sifre ozel karakter icermelidir
                    - Sifre en az 8 karakter olmalidir.
         */


        Scanner scan = new Scanner(System.in);
        String pasword;
        boolean kckHrfvrm,bykHrfvrm,ozelkrkvrm,uzunlukSekizmi;//küçük harf, büyük harf, özel karakter ve şifre uzunluklarını boolean oluşturdum

        do {

            kckHrfvrm = false; // küçük harf, büyük harf, özel karakter ve şifre uzunluklarını boolean olarak false tanımladım
            bykHrfvrm = false;
            ozelkrkvrm = false;
            uzunlukSekizmi = false;

            System.out.print("Şifrenizi giriniz....: ");
            pasword = scan.nextLine();

            for (int i = 0; i < pasword.length(); i++) { // döngüye aldım
                char c = pasword.charAt(i);// özel karakter için char c oluşturdum

                if (pasword.charAt(i)>='a'&&pasword.charAt(i)<='z'){ // küçük harf varsa küçükharf ı true yaptım
                    kckHrfvrm=true;
                } else if (pasword.charAt(i)>='A'&&pasword.charAt(i)<='Z') {// büyük harf varsa büyükharf ı true yaptım
                    bykHrfvrm=true;
                } else if (!Character.isLetterOrDigit(pasword.charAt(i))) {// özel karakter varsa özel karakter ı true yaptım
                    ozelkrkvrm = true;
                }
            }

            if (!kckHrfvrm){
                System.out.println("Şifre küçük harf içermeli"); // for içinde değerler true olmaz ise bu bölüm çalışacak
            }
            if (!bykHrfvrm){
                System.out.println("Şifre büyük harf içermeli");
            }
            if (!ozelkrkvrm){
                System.out.println("Şifre ozel karakter içermelidir");
            }
            if (pasword.length()>=8){ // burda şifrenin uzunluğunu hesaplattım true ise olay bitmiştir.
                uzunlukSekizmi = true;
            }
            else{
                System.out.println("Şifre en az 8 karakter olmalıdır");// eğer uzunluk en az 8 karakter dğeil ise false döner şifreiyi tekrar sorar
            }
        }while (!(kckHrfvrm && bykHrfvrm && ozelkrkvrm && uzunlukSekizmi));
        System.out.println("Şifreniz başarılı bir şekilde kayıt edilmiştir.");
    }

}
