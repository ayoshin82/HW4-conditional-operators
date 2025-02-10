//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
        }
        int age = 17;
        if (age < 18) {
            System.out.println("Ты несовершеннолетний");
        }
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        }
        {
            System.out.println("Задача 2");
        }
        int temperature = 6;
        if (temperature >= 5) {
            System.out.println("Тепло, шапку можно не надевать");
        }
        if (temperature < 5) {
            System.out.println("Холодно, шапку нужно надевать");
        }
        {
            System.out.println("Задача 3");
        }
        int speed = 130;
        if (speed <= 60) {
            System.out.println("Если скорсть меньше или равно 60 км/ч, можно ездить спокойно");
        }
        if (speed > 60) {
            System.out.println("Если скорсть , больше 60 км/ч, будет штраф");
        }
        {
            System.out.println("Задача 4");
        }
        int ageFrom2to6 =  2;
        if (ageFrom2to6>=2 &&  ageFrom2to6<6) {
            System.out.println("Если возраст человека равен " + ageFrom2to6 +   ", то ему нужно ходить  в детский сад");
        } else {
            System.out.println("Ему не нужно ходить в детский сад");
        }

        int ageFrom7To18 =  7;
        if (ageFrom7To18>=7 && ageFrom7To18 < 18) {
            System.out.println("Если возраст человека равен " + ageFrom7To18+   ", то ему нужно ходить  в школу");
        } else {
            System.out.println("Ему не нужно ходить в школу");
        }

        int ageFrom18To24 =  18;
        if (ageFrom18To24>=18 && ageFrom18To24 < 24) {
            System.out.println("Если возраст человека равен " + ageFrom18To24+   ", то ему нужно ходить в университет");
        } else {
            System.out.println("Ему не нужно ходить в университет");
        }

        int ageFromMoreThan24  =  25;
        if (ageFromMoreThan24>24 ) {
            System.out.println("Если возраст человека равен " + ageFromMoreThan24 +   ", то ему нужно ходить на работу");
        } else {
            System.out.println("Ему не нужно ходить на работу");
        }
    }
}

