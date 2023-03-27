package Const.Ders_aninda_practis;

public class D09_Strging_manipilation_1 {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Candir";
        String str3=" ";

        System.out.println(str1+str3+str2);

        System.out.println(str3.concat(str1).concat(str2));
    }
}
