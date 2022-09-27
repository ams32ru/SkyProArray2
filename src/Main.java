import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class Main {
    // уважаемый проверяющий, мне кажется что я написал плохо читаемы код,
    // вероятно потуму что еще не разобрался с зонами видимости и вообще с методами,
    // но все почему то работает
    public static void main(String[] args) {
        generateRandomArray();
        task4();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;

        }
        System.out.println("Задание 1");
        int moneyMont = 0;
        for (int i = 0; i < arr.length; i++) {
            moneyMont = moneyMont + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + moneyMont + " рублей.");
        System.out.println("Задание 2");
        //как я понял можно указывать первый индекс массива для перебора, или просто число которое
        // будет больше или меньше нужного нам
        int minMoney = arr[0];
        int maxMoney = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length > maxMoney) {
                maxMoney = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxMoney + " рублей.");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length < minMoney) {
                minMoney = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей.");
        System.out.println("Задание 3");
        float summ = 0f;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + summ / arr.length + " рублей.");


        return arr;
    }

    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }


}

