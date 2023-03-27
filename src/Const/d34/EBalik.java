package Const.d34;

public abstract class EBalik extends AHayvanlar{

    public void hareket(){
        System.out.println("Baliklar yüzer");
    }
    public void solunum(){
        System.out.println("Baliklar solungaç solunumu yapar");
    }
    public void cogalma(){
        System.out.println("Baliklar yumurta ile çoğalır");
    }
    public abstract void yuzgec();
    public abstract void yasamAlani();
    public abstract void iskeletYApisi();


}
