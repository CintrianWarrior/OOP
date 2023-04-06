import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия", 120, "Автомат", "седан", "А123БВ45", 4, true, new Car.Key(true, true));
        Car secondCar = new Car("Audi", "null", 3.0, "Черный", 2020, "Германия", 0 ,  "", "", "", 4, false, new Car.Key(false, false));
        Car thirdCar = new Car("BMW", "Z8", 3.0, "Черный", 2021, "", -100, "", "", "", 6, true, new Car.Key(true, false));
        Car fourthCar = new Car("Kia", "Sportage 4", 0, "Красный", 2018, "Южная Корея", 200, "", "", "", 4, true, new Car.Key(true, false));
        Car fifthCar = new Car("Hyundai", "Avante", 1.6, "Оранжевый", -2012, "Южная Корея", 150, "", "", "", 4, true, new Car.Key(false, false));
        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(fourthCar);
        System.out.println(fifthCar);
    }
}