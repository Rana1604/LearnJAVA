package oop.abstraction;

public class Test {


    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.carStart();
        toyota.carEngine();
        toyota.carWheel();
        toyota.display();
        toyota.carStop();
        toyota.flyingFeature();
        toyota.boostEngine();

        Car myCar=new Toyota();
        myCar.carStart();
        myCar.carEngine();
        myCar.carStop();
        myCar.carWheel();





    }


}
