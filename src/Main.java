public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <=10; i ++ )
        { System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i -- )
        { System.out.println(i);
        }

        System.out.println("Задание 3");
        for (int i = 0; i <=17; i ++ ) {
            if (i % 2 == 0) {
                System.out.println(i); }
        }

        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i -- ) {
            if (i % 2 == 0) {
                System.out.println(i); }
        }

        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i ++ ) {
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
                System.out.println(i + " год является високосным"); }
        }

        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7 )
        { System.out.println(i);
        }

        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2 )
        { System.out.println(i);
        }

        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total + " рублей.");
        }


        System.out.println("Задание 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            salary1 = salary1 + salary1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total1 + " рублей");
        }

        System.out.println("Задание 10");
        int N = 2;
        for (int i = 1; i <= 10; i ++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }



    }
}