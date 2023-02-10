package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int sittingPlace;
    private boolean summerTire;
    private Key key;

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteEngineStart, boolean withoutKeyAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int sittingPlace, boolean summerTire, Key key) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        setColor(color);
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setTransmission(transmission);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        setRegistrationNumber(registrationNumber);
        if (sittingPlace <= 0) {
            this.sittingPlace = 4;
        } else {
            this.sittingPlace = sittingPlace;
        }
        this.summerTire = summerTire;
        setKey(key);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSittingPlace() {
        return sittingPlace;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "Белый";
        } else {
            this.color = brand;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerTire() {
        return summerTire;
    }

    public void setSummerTire(boolean summerTire) {
        this.summerTire = summerTire;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        } else {
            this.key = key;
        }
    }

    public void changeTire(int month) {
        if (month >= 3 && month < 11) {
            this.summerTire = true;
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month < 3)) {
            this.summerTire = false;
        }
    }
    @Override
    public String toString() {
        return "brand - " + brand + ", " +
                "model - " + model + ", " +
                "engineVolume - " + engineVolume + ", " +
                "color - " + color + ", " +
                "year - " + year + ", " +
                "country - " + country + ", " +
                "transmission - " + transmission + ", " +
                "bodyType - " + bodyType + ", " +
                "registrationNumber - " + registrationNumber + ", " +
                "sittingPlace - " + sittingPlace + ", " +
                "summerTire - " + (summerTire ? "летняя резина" : "зимняя резина") + ", " +
                "remoteEngineStart - " + (getKey().remoteEngineStart ? "удаленный запуск" : "без удаленного запуска") + ", " +
                "withoutKeyAccess - " + (getKey().withoutKeyAccess ? "бесключевой доступ" : "ключевой доступ") + ".";
    }

}
