package ua.zp.brainacad;
    // Написать программу, которая считает факториал числа и выводит
//промежуточные значения на экран.
//Условие: если промежуточное значение >1000, завершить цикл предварительно
//написав в консоли “Достигнут максимально возможный результат”.
public class FactorNumber {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i < 50; i++) {
            fact = fact * i;
            if (fact > 1000) {
                break;
            }
            System.out.println(fact);
        }
        System.out.println("Достигнут максимально возможный результат");
    }
}
