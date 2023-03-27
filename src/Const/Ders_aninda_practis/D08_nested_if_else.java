package Const.Ders_aninda_practis;

import java.util.Scanner;

public class D08_nested_if_else {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz..:");
        int age=scan.nextInt();

        System.out.println("Lutfen cinsiyetinizi giriniz..:");
        char cinsiyet = scan.next().charAt(0);

        if (cinsiyet=='k'|| cinsiyet=='K'){

            if (age<16 || age>80){
                System.out.println("Gecersiz yas girisi Lütfen tekrar deneyiniz");
            } else if (age<60) {
                System.out.println("Emekli olabilmeniz için "+
                        (60-age)+" yıl daha calismaniz lazim");
            }else {
                System.out.println("Emekli olabilirsiniz...");
            }

        } else if (cinsiyet=='e'|| cinsiyet=='E') {
            if (age<16 || age>80){
                System.out.println("Gecersiz yas girisi Lütfen tekrar deneyiniz");
            } else if (age<65) {
                System.out.println("Emekli olabilmeniz için "+
                        (65-age)+" yıl daha calismaniz lazim");
            }else{
                System.out.println("Emekli olabilirsiniz...");
            }
        }else {
            System.out.println("Gecersiz cinsiyet girisi lütfen yeniden deneyiniz");
        }
    }
}
