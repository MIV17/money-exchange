import com.sun.jdi.Value;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. ввод суммы
        // 2. выбор варианта валюты: доллар либо евро
        // 3. подсчитать итоговое значение (сумму * на курс доллар или евро)
        // 4. сохранить где-то в приложении курс доллара и евро
        while (true) {
            start();
        }
    }

    static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму валюты: ");
        int valueSum = scanner.nextInt();
        //System.out.println();
        System.out.println("Выберите валюту: ");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int choiceType = scanner.nextByte();
        String result = convertCurrency(valueSum, choiceType);
        int dotIndex = result.indexOf(".");
        String finalyResult = result.substring(0, dotIndex + 2);
        System.out.println("По текущему курсу сумма будет: " + finalyResult);
    }

    static String convertCurrency(int valueSum, int choiceType) {
        double rubToUsd = 0.012;
        double rubToEur = 0.011;
        double result = 0;

        switch (choiceType) {
            case 1: result = valueSum * rubToUsd;
                break;
            case 2: result = valueSum * rubToEur;
                break;
        }
        return String.valueOf(result);
    }
}
