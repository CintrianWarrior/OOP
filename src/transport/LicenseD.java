package transport;

public class LicenseD extends Driver {
    public LicenseD(String name, boolean haveLicense, int drivingExperience) {
        super(name, haveLicense, drivingExperience);
    }

    @Override
    public void start() {
        System.out.println("Водитель автобуса " + getName() + " начинает движение.");
    }

    @Override
    public void stop() {
        System.out.println("Водитель автобуса " + getName() + " закончил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель " + getName() + " заправляет автобус.");
    }
}
