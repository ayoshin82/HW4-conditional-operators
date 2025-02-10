//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        { System.out.println("Задача 1");}
        int age = 17;
        if (age <18) {
            System.out.println("Ты несовершеннолетний");
        }
        if (age >=18) {
            System.out.println("Ты совершеннолетний");
        }
        { System.out.println("Задача 2");}
        int temperature = 6;
        if (temperature >= 5)  { System.out.println("Тепло, шапку можно не надевать");}
        if (temperature < 5)  { System.out.println("Холодно, шапку нужно надевать");}
    }
}