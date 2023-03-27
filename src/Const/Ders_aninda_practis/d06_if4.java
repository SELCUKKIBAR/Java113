package Const.Ders_aninda_practis;

import java.util.Scanner;

public class d06_if4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Lütfen yaşınızı giriniz...:");
        //nt age = scan.nextInt();

        //f (age>=65){
        //   System.out.println("Emekli olabilirsiniz....");
        //else {
        //   System.out.println((65-age)+" Yıl daha çalıştıktan sonra emekli olabilirsiniz");
        //

        //System.out.println("Lütfen bir karakter giriniz....");
        //char krk = scan.next().charAt(0);
        //if (krk>=65 && krk<=90){
        //    System.out.println("Girilen karakter BÜYÜK HARF");
        //}
        //else {
        //    System.out.println("Girilen Karakter Büyük Harf Değil");
        //}

        System.out.println("Lütfen bir karakter giriniz...:");
        char krk=scan.next().charAt(0);

        if (krk>=97 && krk<=122){
            System.out.println(Character.toUpperCase(krk));
            System.out.println((char)(krk-32));
        }
        else {
            System.out.println(krk);
        }

    }
}
