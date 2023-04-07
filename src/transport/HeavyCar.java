package transport;

public class HeavyCar extends Transport<LicenseC> {
    public HeavyCar(String brand, String model, double engineVolume, LicenseC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMovement() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +  getModel() + " начинает движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +  getModel() + " заканчивает движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +  getModel() + " совершает техническую остановку.");
    }
    @Override
    public void bestTimeForCircle() {
        int minTime = 20;
        int maxTime = 40;
        int bestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время грузового автомобиля " + bestTime + " минут.");
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 60;
        int maxSpeed = 120;
        int definedMaxTime = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость грузового автомобиля " + definedMaxTime + " км/ч.");
    }
    @Override
    public void printInfo() {
        System.out.println("Водитель " + getDriver().getName() + " управляет грузовым автомобилем " + getBrand() + " " + getModel() + " и будет участвовать в заезде.");
    }
}