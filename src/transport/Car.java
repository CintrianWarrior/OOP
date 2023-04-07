package transport;

public class Car extends Transport {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +  getModel() + " начинает движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +  getModel() + " заканчивает движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +  getModel() + " совершает техническую остановку.");
    }

    @Override
    public void bestTimeForCircle() {
        int minTime = 10;
        int maxTime = 25;
        int bestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время легкового автомобиля " + bestTime + " минут.");
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 90;
        int maxSpeed = 200;
        int definedMaxTime = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость легкового автомобиля " + definedMaxTime + " км/ч.");
    }
}
