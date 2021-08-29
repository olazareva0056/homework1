package pro.sky.java.course1.lesson2;

public class Main {
    public static void main(String[] args) {
       /* //Задание 1
        int clientOS = 0;
        //Задание 2
        int clientDeviceYear = 2015;
        if (clientDeviceYear > 2019) {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        }

        //Задание 3
        int year = 2020;
        int year4 = year % 4;
        int year400 = year % 400;
        if (year4 == 0 || year400 == 0) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }

        //Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка карты составит сутки");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка карты составит двое суток");
        }
        if (deliveryDistance >= 60) {
            System.out.println("Доставка карты составит трое суток");
        }
*/
        //Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
