import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми

        int array[] = {11, 12, 22, 32, 5, 8, 21, 13, 1414, 55};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i]; // TEMP временная переменная для i
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
