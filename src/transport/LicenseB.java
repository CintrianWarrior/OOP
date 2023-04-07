package transport;

public class LicenseB extends Driver{
    public LicenseB(String name, boolean haveLicense, int drivingExperience) {
        super(name, haveLicense, drivingExperience);
    }

    @Override
    public void start() {
        System.out.println("Водитель легкового автомобиля " + getName() + " начинает движение.");
    }

    @Override
    public void stop() {
        System.out.println("Водитель легкового автомобиля " + getName() + " закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель " + getName() + " заправляет автомобиль.");
    }
}
