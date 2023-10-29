package Homework2.Lection2;
/*
Время в пути
*/
public class TravelTime {
    public static void main(String[] args) {
        int distanceFromHomeToOffice = 20;
        double taxiSpeed = 40;
        double testerGoesToTheOffice = distanceFromHomeToOffice / taxiSpeed;
        int ratio = 6;
        double testerGoesToTheHome = testerGoesToTheOffice * ratio;
        System.out.println("Расстояние в километрах от дома до офиса : " + distanceFromHomeToOffice);
        System.out.println("Средняя скорость в такси: " + taxiSpeed + " Км/час");
        System.out.println("Время за которое тестировщик добирается от дома до офиса: " + testerGoesToTheOffice + " часа");
        System.out.println("Коэффициент замедления транспорта вечером: " + ratio);
        System.out.println("Время за которое тестировщик добирается на такси с работы домой: " + testerGoesToTheHome + " часа");
    }
}
