public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 57;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int ageHuman = 100;
        if (ageHuman < 2) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно идти спать");
        } else if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно идти в детский сад");
        } else if (ageHuman >= 7 && ageHuman <= 18) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно идти в школу");
        } else if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно идти в университет");
        } else if (ageHuman > 24 && ageHuman <= 60) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно идти на работу");
        } else if (ageHuman > 60){
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно идти отдыхать");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 16;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на атракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на атракционе в сопровождении");
        } else if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на атракционе без сопровождения");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int capacityOfOneWagon = 102;
        int seatPlace = 60;
        int standingPlace = capacityOfOneWagon - seatPlace;

        int seatPlaceUsed = 60;
        int standingPaceUsed = 42;
        if (seatPlaceUsed < seatPlace) {
            System.out.println("Есть еще " + (seatPlace - seatPlaceUsed) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standingPaceUsed < standingPlace) {
            System.out.println("Есть еще " + (standingPlace - standingPaceUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 115;
        int two = 115;
        int three = 115;
        if (one > two) {
            if (one >= three) {
                System.out.println("Большее число - " + one);
            } else {
                System.out.println("Большее число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Большее число - " + two);
            } else {
                System.out.println("Большее число - " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Большее число - " + one);
            } else if (three > one) {
                System.out.println("Большее число - " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}


