import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int [] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));
        System.out.println("Задание 1");
        int sum = 0;
        for (int exe :expenses) {
            sum = sum +exe;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("Задание 2");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int exp:expenses) {
            if (exp > max){
                max = exp;
            }
            if (exp < min){
                min = exp;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min +
                "рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + max +
                "рублей. ");

        System.out.println("Задание 3");
        float averageExpenses = (float) sum / expenses.length;
        System.out.println ("Cредняя сумма трат за месяц составила " + averageExpenses + " рублей ");
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }








    }




    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

