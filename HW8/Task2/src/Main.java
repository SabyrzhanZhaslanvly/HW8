import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        double[] peopleWeight = new double[10];

        for (int i = 0; i < peopleWeight.length; i++) {
            peopleWeight[i] = random.nextInt(40, 100);
        }

        double summ = 0;
        int counter = 0;

        for (double i : peopleWeight) {
            summ += i;
            if (i >= 60 && i <= 80) {
                counter++;
            }
        }

        double averageWeight = summ / peopleWeight.length;

        System.out.println("Средний вес: " + averageWeight);

        System.out.println("Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно: " + counter);
    }
}
