package transport;

public class LicenseC extends Driver{
    public LicenseC(String name, boolean haveLicense, int drivingExperience) {
        super(name, haveLicense, drivingExperience);
    }

    @Override
    public void start() {
        System.out.println("Водитель грузового автомобиля " + getName() + " начинает движение.");
    }

    @Override
    public void stop() {
        System.out.println("Водитель грузового автомобиля " + getName() + " закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель " + getName() + " заправляет автомобиль.");
    }
}
