import transport.*;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("Lada", "Granta", 1.7, new LicenseB("Nick", true, 6));
        Car secondCar = new Car("Audi", "null", 3.0, new LicenseB("Nick", true, 6));
        Car thirdCar = new Car("BMW", "Z8", 3.0, new LicenseB("Nick", true, 6));
        Car fourthCar = new Car("Porsche", "Cayenne", 9.4, new LicenseB("Nick", true, 6));
        HeavyCar firstHeavyCar = new HeavyCar("КамАЗ", "54901", 12, new LicenseC("Mike", true, 8));
        HeavyCar secondHeavyCar = new HeavyCar("Hyundai", "Mighty", 3.9, new LicenseC("Mike", true, 8));
        HeavyCar thirdHeavyCar = new HeavyCar("Volvo", "FL7", 7.2, new LicenseC("Mike", true, 8));
        HeavyCar fourthHeavyCar = new HeavyCar("Daewoo", "Novus SE", 14.6, new LicenseC("Mike", true, 8));
        Bus firstBus = new Bus("Hyundai", "Universe", 12.3, new LicenseD("Dan", true, 15));
        Bus secondBus = new Bus("ЛиАЗ", "6213", 6.8, new LicenseD("Dan", true, 15));
        Bus thirdBus = new Bus("Volvo", "9700", 10.8, new LicenseD("Dan", true, 15));
        Bus fourthBus = new Bus("Daewoo", "BS106", 11.1, new LicenseD("Dan", true, 15));
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
        thirdBus.maxSpeed();
        fourthCar.bestTimeForCircle();
        thirdHeavyCar.pitStop();
        System.out.println(firstCar.getDriver());
        firstCar.printInfo();
        secondBus.printInfo();
    }
}