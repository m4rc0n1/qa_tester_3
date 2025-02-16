package oop.encapsulation;

public class StaticKeyword {
      static class Employee{
//         final static double PI=3.14;
//         final int a; //bu olmaz
         int a = 5;
    }
    public static void main(String[] args) {
         final Employee e1 = new Employee();
         e1.a = 10;
        Employee e2 = new Employee();
        e2.a =15;

        int productSayi =20;
        final int MAXIMUM_PRODUCT_SAYI = 17;
//        Secret or magic values.
        if(productSayi > MAXIMUM_PRODUCT_SAYI){
            System.out.println("Limiti kecdiniz cari limit: " + MAXIMUM_PRODUCT_SAYI);
        }

//        e1=e2;
//        System.out.println(e1.a);


//         final int b;
//         b = 25;
//
//         Employee e1 = new Employee();
//         System.out.println(e1.PI);
//
//         Employee e2 = new Employee();
//         System.out.println(e2.PI);
    }
}
