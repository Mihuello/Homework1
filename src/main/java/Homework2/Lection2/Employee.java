package Homework2.Lection2;

/*Задача о количестве сотрудников на проекте
 */

public class Employee {
    public static void main(String[] args) {
        int programmers = 100, testers = 50, support = 5;
        int testersOnProject = programmers - testers;
        int supportOnProject = (programmers + testers) / support;
        int Specialists = programmers + testersOnProject + supportOnProject;

        System.out.println("Программистов всего: " + programmers);
        System.out.println("Тестировщиков чтобы проверить код одного программиста: " + testers);
        System.out.println("Специалистов поддержки, необходимое, чтобы обработать вопросы, \n" + "возникающие у пользователей по поводу кода, написанного одним программистом: " + support);
        System.out.println("Количество тестировщиков, требуемое на проекте: " + testersOnProject);
        System.out.println("Количество специалистов поддержки, требуемое на проекте: " + supportOnProject);
        System.out.println("Общее количество технических специалистов на проекте : " + Specialists);
    }
}
