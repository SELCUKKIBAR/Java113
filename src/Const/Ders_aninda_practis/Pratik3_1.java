package Const.Ders_aninda_practis;

import java.util.Scanner;

public class Pratik3_1 {
    public static void main(String[] args) {

        int a=3,b=9,c=7;
        double total =(a+b+c);
        System.out.println(total);

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz...:");

        char hrf = scan.next().charAt(0);
        System.out.println("Girilen harf...: "+hrf);
        System.out.println("Girdiğiniz harften sonraki 3 harf..:"
                +(hrf+0)+","+(hrf+1)+","+(hrf+2));

        System.out.println("Girdiğiniz harften sonraki 3 harf..:"+(char)(hrf+1)+","+
                (char)(hrf+2)+","+(char)(hrf+3));


    }
}
