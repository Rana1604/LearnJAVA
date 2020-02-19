package oop.abstraction;

public class Toyota extends FlyingCar implements Car,NewCar {



    public void carStart() {
        System.out.println("Toyota car has Start feature");
    }


    public void carStop() {
        System.out.println("Toyota car has stop feature");
    }


    public void carWheel() {
        System.out.println("Toyota car has Wheel ");
    }


    public void carEngine() {
        System.out.println("Toyota car has Engine ");
    }

    public void display(){
        System.out.println("Toyota car has a Display");
    }

    public void flyingFeature() {
        System.out.println("Toyota car has Flying feature");
    }


    public void backCamera() {
        System.out.println("Toyota car has Back Camera");
    }
}
