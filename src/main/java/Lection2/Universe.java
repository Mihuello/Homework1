package Lection2;
/*
Возраст Вселенной по сравнению с возрастом человечества
*/
public class Universe {
    public static void main(String[] args) {
        long ageOfTheUniverse = 13000000000L;
        int ageOfThePerson = 100000;
        long theUniverseIsOlderThanHumans = ageOfTheUniverse / ageOfThePerson;
        System.out.println("Возраст вселенной: " + ageOfTheUniverse);
        System.out.println("Возраст человека, как вида: " + ageOfThePerson);
        System.out.println("Во сколько раз Вселенная старше людей: " + theUniverseIsOlderThanHumans );
    }
}
