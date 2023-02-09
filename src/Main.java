public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 15000;
        int time = 0;
        int total = 0;
        while (total <= 2_459_000) {
            money = money + 15000 / 100;
            total = total + money;
            time = time + 1;
            System.out.println("Месяц " + time + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int one = 0;
        while (one < 10) {
            one += 1;
            System.out.print(one + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i -= 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            population = (population / 1000 * (17 - 8)) + population;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int money = 15000;
        int month = 0;
        while (money <= 12_000_000) {
            money = money + money * 7 / 100;
            month++;
            System.out.println("Месяц " + month + " сумма " + money);

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int money = 15000;
        int month = 0;
        while (money <= 12_000_000) {
            money = money + money * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + money);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int money = 15000;
        int month = 12 * 9;
        for (int i = 1; i <= month; i++) {
            money = money + money * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма " + money);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int day = 6;
        for (int i = 1; i <= 31; i++) {
            if (i == day || (i - day) % 7 == 0) {
                System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int comet = 79;
        int presentTime = 2023;
        int year = 0;
        while (year <= presentTime + 100) {
            year = year + comet;
            if (year <= presentTime + 100 && year >= presentTime - 200) {
                System.out.println(year);
            }
        }
    }
}




