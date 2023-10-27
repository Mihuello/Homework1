package Lection2;
/*
Стакан, который наполовину полон
 */
public class Glass {
    public static void main(String[] args) {
        int glassVoluve = 1000;
        double glassFullness = 60.6;
        double glassFillingPercentage = glassVoluve * glassFullness / 100;
        System.out.println("Объём стакана в милилитрах: " + glassVoluve);
        System.out.println("Ка сколько процентов заполнен стакан:  " + glassFullness + "%");
        System.out.println("Миллилитров воды в стакане, заполненном на столько процентов, " +
                "сколько указано в предыдущей переменной: " + glassFillingPercentage);

    }
}
