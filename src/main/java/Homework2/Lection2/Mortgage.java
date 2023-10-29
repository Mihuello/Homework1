package Homework2.Lection2;
/*
Первоначальный взнос по ипотеке
*/
public class Mortgage {
    public static void main(String[] args) {
        int theCostOfTheApartment = 3236077;
        double initialPayment = 20;
        double coefficientPayment = initialPayment /100;
        double theAmountOfTheInitialPayment = theCostOfTheApartment * coefficientPayment;
        System.out.println("Стоимость квартиры: " + theCostOfTheApartment + " рублей");
        System.out.println("Процент первоначального взноса по ипотеке: " + initialPayment);
        System.out.println("Сумма первоначального взноса: " + theAmountOfTheInitialPayment + " рублей");
    }
}
