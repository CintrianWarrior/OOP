package transport;

public abstract class Driver {
    private final String name;
    private boolean haveLicense;
    private int drivingExperience;

    public Driver(String name, boolean haveLicense, int drivingExperience) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "driver name";
        } else {
            this.name = name;
        }
        this.haveLicense = haveLicense;
        this.drivingExperience = drivingExperience;
        setHaveLicense(haveLicense);
        setDrivingExperience(drivingExperience);
    }

    public String getName() {
        return name;
    }

    public boolean isHaveLicense() {
        return haveLicense;
    }

    public void setHaveLicense(boolean haveLicense) {
        if (haveLicense = true) {
            System.out.print(" есть лицензия ");
        } else {
            System.out.print(" лицензии нет ");
        }
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 5;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
    public abstract void start();
    public abstract void stop();
    public abstract void refuel();


    @Override
    public String toString () {
        return "Водитель " + name + ", " +
                haveLicense + ", " +
                "стаж вождения " + drivingExperience + ".";
    }
}
