public class Main {
    public static void main(String[] args) {
//
//        //      ДЗ 1
//        //  " Задание" 1
//        System.out.println("Задание 1");
//
//        for (int i = 1; i < 11; i++) {
//            System.out.println(+i);
//        }
//        //   " Задание" 2
//        System.out.println(" Задание 2");
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println(+i);
//        }
//        //   " Задание" 3
//        System.out.println(" Задание 3");
//
//        for (int i = 0; i <= 17; i += 2) {
//            System.out.println(+i);
//        }
//
//        //    "Задание" 4
//        System.out.println(" Задание 4");
//
//        for (int i = 10; i > -11; i--) {
//            System.out.println(i);
//        }
//
//        //      ДЗ 2
//        //     "Задание" 1
//        System.out.println("Задание 1 ДЗ 2");
//
//        for (int i = 1904; i < 2096; i = i + 4) {
//            System.out.println("Високосный год " + i);
//        }
//
//        //     "Задание" 2
//        System.out.println("Задание 2");
//
//        for (int i = 7; i < 98; i = i + 7) {
//            System.out.println(i);
//        }
//        //     "Задание"3
//        System.out.println("Задание 3");
//
//        for (int i = 1; i <= 512; i = i + 2) {
//            System.out.println(i);
//        }
//        //          ДЗ2
//        //     "Задание"4
//        System.out.println("Задание 4");
//
//        int contribution = 29000;
//        int total = 0;
//        for (int i = 1; i <= 2_459_000; i++) {
//            total += contribution;
//            total = total + contribution;
//            System.out.println("Месяц  " + i + "  , сумма накоплений равна " + total + "_ рублей");
//        }
//        //     " Задание" 5
//        System.out.println("Задание 5");
//        double totalWithPercent = 0;
//        double percent = 0.01;
//        for (int i = 1; i <= 12; i++) {
//            totalWithPercent = (totalWithPercent + contribution) * (1 + percent);
//            System.out.println("Месяц  " + i + "  , сумма накоплений равна " + totalWithPercent + " рублей");
//
//        }
        // Задача1
// " Циклы часть два "
        System.out.println("Задача1");

        int myMoney = 0;
        int mounth = 0;
        while (myMoney < 2459000) {
            myMoney += 15000;
            mounth = mounth + 1;
            System.out.println(" Месяц " + mounth + " Денег накоплено " + myMoney);
        }
        // Задача2
        System.out.println("Задача2");
        int counter = 1;
        while (counter < 11) {
            System.out.print(counter + " ");
            counter = counter + 1;
        }
        System.out.println("Задача2/2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Задача3
        System.out.println("Задача3");
        int allPeople = 12000000;
        int estimatePerYear = 96000;
        int rozhdVGod = 204000;
        int year = 0;
        while (year < 10) {
            allPeople += rozhdVGod;
            allPeople -= estimatePerYear;

            allPeople += rozhdVGod - estimatePerYear;
            //       year = year + 1;
            //        System.out.println(" Количество лет " + year + " Людей " + allPeople);


            //  Задача 3.1


            //for (int i = 1896; i < 2122; i = i + 79) {


               // System.out.println("каждый" + i);
               // {
                    //Задача 3.2
               // }

                for (int i = 2; i < 10; i++) {
                    System.out.println("2 x " + i + " = " + 2 * i);


                }

            }
        }
    }

























