import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия", "Автомат", "седан", "А123БВ45", 4, true);
        Car secondCar = new Car("Audi", "null", 3.0, "Черный", 2020, "Германия", "", "", "", 4, false);
        Car thirdCar = new Car("BMW", "Z8", 3.0, "Черный", 2021, "", "", "", "", 6, true);
        Car fourthCar = new Car("Kia", "Sportage 4", 0, "Красный", 2018, "Южная Корея", "", "", "", 4, true);
        Car fifthCar = new Car("Hyundai", "Avante", 1.6, "Оранжевый", -2012, "Южная Корея", "", "", "", 4, true);
        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(fourthCar);
        System.out.println(fifthCar);
    }
}