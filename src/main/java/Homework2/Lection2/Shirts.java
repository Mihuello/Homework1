package Homework2.Lection2;

/*
Скидки на рубашки
 */

public class Shirts {
    public static void main(String[] args) {

        int shirtWithoutDiscount = 2300;
        int numberOfSelectedShirts = 3;
        int wholeSaleShirtsPromotion = 4;
        double discount = 20;

        int numberOfShirtsThatNeedToBeAddedToThePurchasedOnesToGetADiscount = wholeSaleShirtsPromotion - numberOfSelectedShirts;
        int totalNumberOfShirtsWithoutDiscount = shirtWithoutDiscount * numberOfSelectedShirts;
        int totalPriceOfShirtsWithoutDiscountThatYouNeedToBuyToGetADiscount = totalNumberOfShirtsWithoutDiscount + shirtWithoutDiscount;

        double coefficientDiscount = discount / 100;
        double allShirtsAreDiscounted = (totalPriceOfShirtsWithoutDiscountThatYouNeedToBuyToGetADiscount * coefficientDiscount) * wholeSaleShirtsPromotion;
        double oneShirtWithADiscount = totalPriceOfShirtsWithoutDiscountThatYouNeedToBuyToGetADiscount * coefficientDiscount;
        double amountOfMoneySaved = totalPriceOfShirtsWithoutDiscountThatYouNeedToBuyToGetADiscount - totalNumberOfShirtsWithoutDiscount;
        double shirtsReceivedForFree = amountOfMoneySaved / shirtWithoutDiscount;

        System.out.println("Цена одной рубашки без скидки: " + shirtWithoutDiscount);
        System.out.println("Количество уже выбранных рубашек: " + numberOfSelectedShirts);
        System.out.println("Количество рубашек, которые надо купить, чтобы получить скидку: " + wholeSaleShirtsPromotion);
        System.out.println("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку: " + numberOfShirtsThatNeedToBeAddedToThePurchasedOnesToGetADiscount);
        System.out.println("Общая цена уже выбранных рубашек без скидки: " + totalNumberOfShirtsWithoutDiscount);
        System.out.println("Общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку: " + totalPriceOfShirtsWithoutDiscountThatYouNeedToBuyToGetADiscount);
        System.out.println("Процент скидки: " + discount);
        System.out.println("Цена всех рубашек со скидкой: " + allShirtsAreDiscounted);
        System.out.println("Цена одной рубашки со скидкой: " + oneShirtWithADiscount);
        System.out.println("Количество сэкономленных денег, если рубашки куплены со скидкой: " + amountOfMoneySaved);
        System.out.println("Количество рубашек, которые из-за скидки считай получены на халяву: " + shirtsReceivedForFree);
    }
}
