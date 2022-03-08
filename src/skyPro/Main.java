package skyPro;

public class Main {
    // Задача 1 =============================================================
    public static void main(String[] args) {
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("К сожалению Ваш клиент не поддерживается");
        }
        System.out.println("**********    Конец задачи 1     **********");
        Task2();
        System.out.println("**********    Конец задачи 2     **********");
        Task3_Leap();
        System.out.println("**********    Конец задачи 3     **********");
        Task4_TimeDelivery();
        System.out.println("**********    Конец задачи 4     **********");
        Task5_SeasonsYear();
    }

    // Задача 2 =============================================================
    public static void Task2() {
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
                System.out.println("Установите  версию приложения для Android");
            } else {
                System.out.println("Год выпуска устройства ошибочен!");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else if (clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
                System.out.println("Установите  версию приложения для IOS");
            } else {
                System.out.println("Год выпуска устройства ошибочен!");
            }
        } else {
            System.out.println("К сожалению Ваш клиент не поддерживается");
        }
    }

    // Задача 3 =======       Определить, високосный ли год    =================
    public static void Task3_Leap() {
        short Year = 2020;
        boolean isLeapYear = ((Year % 4) == 0 && (Year % 100) != 0) || (Year % 400 == 0);
        if (isLeapYear) {
            System.out.println("Год " + Year + " - високосный!");
        } else {
            System.out.println("Год " + Year + " - невисокосный");
        }
    }


    // Задача 4 =======       Время доставки    =================
    public static void Task4_TimeDelivery() {
        byte deliveryDistance = 90;
        byte deliveryDays = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays += 2;
        } else if (deliveryDistance < 0 || deliveryDistance >= 95) {
            deliveryDays = 0;
        }
        if (deliveryDays != 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Значение вне условий задачи");
        }
    }

    // Задача 5 =======       Сезон года    =================
    public static void Task5_SeasonsYear() {
        byte monthNumber = 9;
        String season;
        switch (monthNumber) {
            case 1, 2, 12:
                season = "зима";
                break;
            case 3, 4, 5:
                season = "весна";
                break;
            case 6, 7, 8:
                season = "лето";
                break;
            case 9, 10, 11:
                season = "осень";
                break;
            default:
                season = "out";
                break;
        }
        if (season != "out") {
            System.out.println("Номер месяца " + monthNumber + " относится к сезону - " + season);
        } else {
            System.out.println("Месяца с таким порядковым номером не существует!");
        }
    }
}