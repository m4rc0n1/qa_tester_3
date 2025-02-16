import oop.encapsulation.AccessModifiers;
public class Constructor {
    static class Car{
        int qapiSayi;
        String model;
        String reng;
        //Constructor  =  kran
        //Employee() -> default constructor


        /*
        Nece bilek ki hansi constructor ishe dushur
        Cavab: Constructor data typendan ve argumentin sayindan
         */
        //        No-arg constructor
        Car(){
            this.qapiSayi=4;
            this.model="Audi";
            this.reng ="Ag";
            System.out.println(model + " modelde" + qapiSayi + " qapili avtomobil yarandi");
        }
        Car(String reng){
            this();
            this.reng =reng;
        }
        Car(int qapiSayi){
            this();
            this.qapiSayi=qapiSayi;
        }

        Car(String reng,int qapiSayi){
            this();
            this.qapiSayi=qapiSayi;
            this.reng=reng;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mavi");
        Car car2 = new Car(5);
        Car car3 = new Car("Yashil",2);
        System.out.println(car3.qapiSayi);
        AccessModifiers ac1 = new AccessModifiers();

        System.out.println(AccessModifiers.pi);
    }
}

