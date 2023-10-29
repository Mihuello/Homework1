package Lection2;
/*Объявить целочисленную переменную, в которой количество яблок у Буратино Объявить целочисленную переменную, в которой записано, сколько яблок отобрал у него Карабас Барабас.
Объявить целочисленную переменную, в которой записано, сколько яблок осталось у Буратино , после того, как Карабас Барабас отобрал у него яблоки.
*/
public class Buratino {
    public static void main(String[] args) {
        //Объявление целочисленных переменных
        int appleBuratino = 10;
        int applesKarabasBarabas = 6;
        //Нахождение переменной
        int remained = appleBuratino - applesKarabasBarabas;
        System.out.println("У Буратино было яблок: " + appleBuratino);
        System.out.println("Карабас забрал яблок у Буратино: " + applesKarabasBarabas);
        System.out.println("У буратино осталось яблок: " + remained);
    }
}
