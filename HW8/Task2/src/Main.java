import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут

//        double[] peopleWeights = new double[10];
//        for (int i = 0; i < peopleWeights.length; i++) {
//            peopleWeights[i] = (new Random().nextDouble() * 60) + 40;
//        }
//        double middleWeight =0;
//        for (int i = 0; i < peopleWeights.length; i++) {
//            middleWeight += peopleWeights[i];
//        }
//
//        for (int i = 0; i < peopleWeights.length; i++) {
//            System.out.println(peopleWeights[i]);
//        }
//
//        int peopleCount = 0;
//        for (int i = 0; i < peopleWeights.length; i++) {
//            if (peopleWeights[i] >= 60 && peopleWeights[i] <= 80) {
//                peopleCount++;
//            }
//        }

//        System.out.println("Средний вес = " + middleWeight / peopleWeights.length);
//        System.out.println("Кол-во людей: " + peopleCount);

        System.out.println("УПРОЩЕННЫЙ ВАРИАНТ");

        double[] peopleWeights = new double[10];
        double middleWeight = 0;
        int peopleCount = 0;

        for (int i = 0; i < peopleWeights.length; i++) {
            peopleWeights[i] = (new Random().nextDouble() * 60) + 40;
            middleWeight += peopleWeights[i];
            if (peopleWeights[i] >= 60 && peopleWeights[i] <= 80) {
                peopleCount++;
            }
        }

        System.out.println("Средний вес = " + (middleWeight / peopleWeights.length));
        System.out.println("Кол-во людей: " + peopleCount);
    }
}
