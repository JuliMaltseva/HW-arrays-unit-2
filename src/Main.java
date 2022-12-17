import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dailyExpenses = generateRandomArray();
        System.out.println(Arrays.toString(dailyExpenses));

// Задание 1
        System.out.println("Задание 1"); //посчитать сумму всех выплат за месяц «Сумма трат за месяц составила … рублей».
        int totalCostPerMonth = 0;
        for (int element : dailyExpenses) {
            totalCostPerMonth += element;
        }
        System.out.println("Сумма трат за месяц составила " + totalCostPerMonth + " рублей.");

// Задание 2
        System.out.println("Задание 2");
        //«Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей»
        int minDailyExpenses = 200_001; //по условиям рандома MAX = 200_000
        int maxDailyExpenses = 0; //меньше 0 потратить нельзя
        for (int dailyExpens : dailyExpenses) {
            if (dailyExpens < minDailyExpenses) {
                minDailyExpenses = dailyExpens;
            }
        }
        for (int dailyExpens : dailyExpenses) {
            if (dailyExpens > maxDailyExpenses) {
                maxDailyExpenses = dailyExpens;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDailyExpenses + " рублей. Максимальная сумма трат за день составила " + maxDailyExpenses + " рублей.");

// Задание 3
        System.out.println("Задание 3"); //«Средняя сумма трат за месяц составила … рублей».
        int days = generateRandomArray().length;
        float averageDailyExpenses = totalCostPerMonth / days;
        System.out.println("Средняя сумма трат за месяц составила " + averageDailyExpenses + " рублей.");

// Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String a = String.valueOf(reverseFullName);
        System.out.println(a);

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
