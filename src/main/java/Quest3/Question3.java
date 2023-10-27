package Quest3;

public class Question3 {
    public static void main(String[] args) {
        int a = 6, b = 4, c = 5;
        // Найдем полупелиметр
        double p = (a + b + c) * 0.5;
        //далее найдем площадь
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника равна: " + area);


    }
}
