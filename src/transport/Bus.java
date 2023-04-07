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
}
