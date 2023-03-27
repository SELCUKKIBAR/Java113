package Const.Ders_aninda_practis;

public class d11 {
    public static void main(String[] args) {
        String str = "Java Candir";

        str = str.replace("a","x");
        System.out.println(str);
        str = str.replaceFirst("x","a");
        System.out.println(str);
        str = str.replaceFirst("x","");
        str=str.replaceFirst("x","a");
        System.out.println(str);

        String str1="J&ava54 C+an01dir,,,";
        str1=str1.replaceAll("\\d","");
        System.out.println(str1);
        str1=str1.replaceAll(" ","5");
        str1=str1.replaceAll("\\W","");
        str1=str1.replaceAll("5"," ");
        System.out.println(str1);

    }
}
