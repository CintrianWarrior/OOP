public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        Car secondCar = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        Car thirdCar = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Car fourthCar = new Car("Kia", "Sportage 4", 2.4, "Красный", 2018, "Южная Корея");
        Car fifthCar = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(fourthCar);
        System.out.println(fifthCar);
    }
}