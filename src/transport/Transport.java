package transport;

public abstract class Transport {
        private final String brand;
        private final String model;
        private final int year;
        private final String country;
        private String colour;
        private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String colour, int maxSpeed) {
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
        setColour(colour);
        setMaxSpeed(maxSpeed);
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

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            if (colour == null || colour.isEmpty() || colour.isBlank()) {
                this.colour = "Белый";
            } else {
                this.colour = colour;
            }
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            if (maxSpeed <= 0) {
                maxSpeed = 150;
            }
            this.maxSpeed = maxSpeed;
        }

    @Override
    public String toString() {
        return "brand - " + brand + ", " +
                "model - " + model + ", " +
                "colour - " + colour + ", " +
                "year - " + year + ", " +
                "country - " + country + ", " +
                "maxSpeed - " + maxSpeed;
    }
}
