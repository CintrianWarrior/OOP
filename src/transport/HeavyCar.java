package transport;

public class HeavyCar extends Transport {
    public HeavyCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMovement() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +  getModel() + " начинает движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +  getModel() + " заканчивает движение.");
    }
}
