package ua.zp.brainacad;

// 2.Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
//и возле каждого пишет четное это число или нечетное.

public class EvenOdd {
    public static void main(String[] args) {

        for (int i = 1; i < 11 ; i++) {
            if (i %2==0) {
                System.out.println(i + "-> четное");
            } else {
                System.out.println(i + "-> нечетное");
            }
        }
    }
    }

