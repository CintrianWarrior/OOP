public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.brand = "Lada";
        firstCar.model = "Granta";
        firstCar.engineVolume = 1.7;
        firstCar.color = "Желтый";
        firstCar.year = 2015;
        firstCar.country = "Россия";
        Car secondCar = new Car();
        secondCar.brand = "Audi";
        secondCar.model = "A8 50 L TDI quattro";
        secondCar.engineVolume = 3.0;
        secondCar.color = "Черный";
        secondCar.year = 2020;
        secondCar.country = "Германия";
        Car thirdCar = new Car();
        thirdCar.brand = "BMW";
        thirdCar.model = "Z8";
        thirdCar.engineVolume = 3.0;
        thirdCar.color = "Черный";
        thirdCar.year = 2021;
        thirdCar.country = "Германия";
        Car fouthCar = new Car();
        fouthCar.brand = "Kia";
        fouthCar.model = "Sportage 4";
        fouthCar.engineVolume = 2.4;
        fouthCar.color = "Красный";
        fouthCar.year = 2018;
        fouthCar.country = "Южная Корея";
        Car fifthCar = new Car();
        fifthCar.brand = "Hyundai";
        fifthCar.model = "Avante";
        fifthCar.engineVolume = 1.6;
        fifthCar.color = "Оранжевый";
        fifthCar.year = 2016;
        fifthCar.country = "Южная Корея";
        System.out.println(fifthCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(fouthCar);
        System.out.println(fifthCar);
    }
}