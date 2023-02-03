public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("  ", "Granta", 1.7, "Желтый", 2015, "Россия");
        Car secondCar = new Car("Audi", "null", 3.0, "Черный", 2020, "Германия");
        Car thirdCar = new Car("BMW", "Z8", 3.0, "Черный", 2021, "");
        Car fourthCar = new Car("Kia", "Sportage 4", 0, "Красный", 2018, "Южная Корея");
        Car fifthCar = new Car("Hyundai", "Avante", 1.6, "Оранжевый", -2012, "Южная Корея");
        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(fourthCar);
        System.out.println(fifthCar);
    }
}