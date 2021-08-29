package pro.sky.java.course1.lesson1;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        byte a;
        short b;
        int c;
        long d;
        float i;
        double f;
        char g;
        boolean h;

        a = 100;
        b = 30000;
        c = 2140000;
        d = 9000000000L;
        i = 0.777777777f;
        f = 1.888888888888;
        g = 'k';
        h = 5 < 3;

        System.out.println("a = " + a + ",\nb = " + b + ",\nc = " + c + ",\nd = "
                + d + ",\ni = " + i + ",\nf = " + f + ",\ng = " + g + ",\nh = " + h);

        // Задача 2
        float b1 = 78.2f;
        float b2 = 82.7f;
        float a1 = 0.0f;
        float a2 = 0.0f;

        a1 = b1 + b2;
        a2 = b1 - b2;
        System.out.println("Общий вес двух бойцов = " + a1 + ", Разница между весами бойцов = " + a2);

        // Задача 3
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        float breakfastG = 0.0f;
        float breakfastKg = 0.0f;

        breakfastG = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        breakfastKg = breakfastG / 1000;
        System.out.println("Вес спорт-завтрака = " + breakfastKg + " кг");

        // Задача 4
        int v1 = 250;
        int v2 = 500;
        int weight = 7000;
        int aa = weight / v1;
        int bb = weight / v2;
        int k = aa / 2 + bb / 2;
        System.out.println("Варант1 = " + aa + " дней, Вариант2 = " + bb + " дней, Среднее количестов дней = " + k);

        // Задача 5
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int masha1 = masha * 110 / 100;
        int denis1 = denis * 110 / 100;
        int kristina1 = kristina * 110 / 100;
        int mashaD = masha1 * 12 - masha * 12;
        int denisD = denis1 * 12 - denis * 12;
        int kristinaD = kristina1 * 12 - kristina * 12;
        System.out.println("Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + mashaD +
                " рублей.\nДенис теперь получает " + denis1 + " рублей. Годовой доход вырос на " + denisD +
                " рублей.\nКристина теперь получает " + kristina1 + " рублей. Годовой доход вырос на " + kristinaD + " рублей.");

        // Задача 6
        int a3 = 12;
        int b3 = 27;
        int c3 = 44;
        int d3 = 15;
        int e3 = 9;
        float result = 0.0f;

        result = -(a3 * (b3 + (c3 - d3 * e3)));
        System.out.println(result);

        // Задача 7
        int a4 = 5;
        int b4 = 7;

        a4 = a4 + b4;
        b4 = a4 - b4;
        a4 = a4 - b4;
        System.out.println("a = " + a4 + ", b = " + b4);

        // Задача 8
        int a5 = 354;
        int b5;
        b5 = a5 / 10 % 10;
        System.out.println("b = " + b5);
    }
}
