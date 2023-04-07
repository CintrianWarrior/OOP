import transport.Bus;
import transport.Car;
import transport.HeavyCar;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("Lada", "Granta", 1.7);
        Car secondCar = new Car("Audi", "null", 3.0);
        Car thirdCar = new Car("BMW", "Z8", 3.0);
        Car fourthCar = new Car("Porsche", "Cayenne", 9.4);
        HeavyCar firstHeavyCar = new HeavyCar("КамАЗ", "54901", 12);
        HeavyCar secondHeavyCar = new HeavyCar("Hyundai", "Mighty", 3.9);
        HeavyCar thirdHeavyCar = new HeavyCar("Volvo", "FL7", 7.2);
        HeavyCar fourthHeavyCar = new HeavyCar("Daewoo", "Novus SE", 14.6);
        Bus firstBus = new Bus("Hyundai", "Universe", 12.3);
        Bus secondBus = new Bus("ЛиАЗ", "6213", 6.8);
        Bus thirdBus = new Bus("Volvo", "9700", 10.8);
        Bus fourthBus = new Bus("Daewoo", "BS106", 11.1);
        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(fourthCar);
        System.out.println(firstHeavyCar);
        System.out.println(secondHeavyCar);
        System.out.println(thirdHeavyCar);
        System.out.println(fourthHeavyCar);
        System.out.println(firstBus);
        System.out.println(secondBus);
        System.out.println(thirdBus);
        System.out.println(fourthBus);
        firstCar.startMovement();
        secondHeavyCar.finishMovement();
    }
}