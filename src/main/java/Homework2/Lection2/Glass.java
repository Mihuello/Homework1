package Homework2.Lection2;
/*
Стакан, который наполовину полон
*/
public class Glass {
    public static void main(String[] args) {
        int glassVolume = 1000;
        double glassFullness = 60.6;
        double coefficientFullness = glassFullness/100;
        double glassFillingPercentage = glassVolume * coefficientFullness;
        System.out.println("Объём стакана в милилитрах: " + glassVolume);
        System.out.println("На сколько процентов заполнен стакан:  " + glassFullness + "%");
        System.out.println("Миллилитров воды в стакане, заполненном на столько процентов, сколько указано в предыдущей переменной: " + glassFillingPercentage);
    }
}
