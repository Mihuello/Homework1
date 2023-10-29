package AdditionalTasksLecitons2.Interface;

public class Dog  implements Runnable {
    @Override
    public void run() {
        System.out.println("Я побежал");
    }
}
