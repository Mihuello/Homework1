package Lection2;
/*
Время в пути
 */
public class TravelTime {
    public static void main(String[] args) {


        int distanceFromHomeToOffice = 6;
        double taxi = 65.3;
        double testerGoesToTheOffice = distanceFromHomeToOffice / taxi;
        int ratio = 6;
        double testerGoesToTheHome = testerGoesToTheOffice * ratio;
        System.out.println("Расстояние в километрах от дома до офиса : " + distanceFromHomeToOffice);
        System.out.println("Средняя скорость в такси: " + taxi + " Км/час");
        System.out.println("Время за которое тестировщик добирается от дома до офиса: " + testerGoesToTheOffice + " часа");
        System.out.println("Коэффициент замедления транспорта вечером: " + ratio);
        System.out.println("Время за которое тестировщик добирается на такси с работы домой: " + testerGoesToTheHome + "часа");


    }
}
