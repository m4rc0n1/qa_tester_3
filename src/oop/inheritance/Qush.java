package oop.inheritance;

public class Qush extends ColHeyvanlari{

    String qidalanir = "yem";
    @Override
    public String qidalanir(){
        return super.qidalanir();
    }
    public void move(){
        System.out.println("Qush ucur");
    }
}
