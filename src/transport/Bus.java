package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начинает движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заканчивает движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " +  getModel() + " совершает техническую остановку.");
    }
    @Override
    public void bestTimeForCircle() {
        int minTime = 20;
        int maxTime = 50;
        int bestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время авобуса " + bestTime + " минут.");
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 60;
        int maxSpeed = 100;
        int definedMaxTime = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость автобуса " + definedMaxTime + " км/ч.");
    }
}
