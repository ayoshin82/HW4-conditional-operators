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
        System.out.println("Задача № 5");


        int ageFromLessThan5   =  4;
        if (ageFromLessThan5<5 ) {
            System.out.println("Если возраст  ребенка равен " + ageFromLessThan5  +   ", то  он не может кататься на аттракционе.");
        } else {
            System.out.println("Если больше 5 лет, то может каталься на аттракционев в присутвствии взрослого");
        }

        int ageFrom5To14 = 6;
        if (ageFrom5To14 > 5 && ageFrom5To14 < 14) {
            System.out.println("Если возраст  ребенка равен " + ageFrom5To14  +   ", то  он   может кататься на аттракционе в сопровождении  взрослого.");
        } else {
            System.out.println("Если больше 14 лет, то может кататься без  сопровождения взрослого");
        }

        int ageFromMoreThan14 = 14;
        if (ageFromMoreThan14 >= 14) {
            System.out.println("Если возраст  ребенка равен " + ageFromMoreThan14  +   ", то  он   может кататься на " +
                    "аттракционе  без  сопровождения взрослого.");
        } else {
            System.out.println("Если меньше 14 лет, то может кататься, но в  сопровождении взрослого ");
        }
        System.out.println("Задача № 6 ");

        int place = 0;
        if (place  >  60) {
            System.out.println("Если место под номером " + place  +   ", то   место стоячее");
        }
        if (place  <= 60 && place != 0) {
            System.out.println("Если место под номером " + place + ", то   место сидячее");
        }   else {
            System.out.println("Если мест " + place +  ", то вагон уже полностью забит ");
        }
        System.out.println("Задача № 7");

        int One = 10;
        int Two = 2;
        int Three = 3;

        if (One>Two && One>Three) {
            System.out.println("Максимальное число равное " + One );
        }
        else if (Two>One && Two>Three) {
            System.out.println("Максимальное число равное " + Three );
        }
        else if  (Three>One && Three>Two) {
            System.out.println("Максимальное число равное " + Three );
        }



    }
}

