//Q3: Implement Abstract Factory Pattern to create cars of different categories from different countries.

package DesignPatterns;

abstract class Car{
    String carType;
    String location;
    public Car(String carType, String location){
        this.carType = carType;
        this.location = location;
    }
    abstract void construct();

}

class LuxuryCar extends Car {
    public LuxuryCar(String location){
        super("Luxury", location);
    }
    @Override
    void construct() {
        System.out.println("This is Luxury Car constructor.");
    }
}
class MiniCar extends Car {
    public MiniCar(String location){
        super("Mini", location);
    }
    @Override
    void construct() {
        System.out.println("This is Mini Car constructor.");
    }
}

class IndianFactory{
    static Car builtCar(String carType){
        Car car = null;
        System.out.println("This is a Indian car.");
        if(carType.equals("Luxury")){
            car = new LuxuryCar("Indian");
            car.construct();
        }
        else{
            car = new MiniCar("Indian");
            car.construct();
        }
        return car;
    }
}
class USAFactory{
    static Car builtCar(String carType){
        Car car = null;
        System.out.println("This is a USA car.");
        if(carType.equals("Luxury")){
            car = new LuxuryCar("USA");
            car.construct();
        }
        else{
            car = new MiniCar("USA");
            car.construct();
        }
        return car;
    }

}

class CarFactory{
    static Car builtCar(String carType, String location){
        Car car = null;
        if(location.equals("Indian")){
            car = IndianFactory.builtCar(carType);
        }
        else{
            car = USAFactory.builtCar(carType);
        }
        return car;
    }
}

public class Q3 {
    public static void main(String[] args) {
        CarFactory.builtCar("Luxury", "Indian");
        CarFactory.builtCar("Mini", "USA");

    }
}
