package ua.zp.brainacad;
//  Написать программу, которая выводит информацию о дне неделе.
//Например для понедельника – пятницы выводит сообщение “Это рабочий
//день”, а для субботы и воскресенья выводит “Это выходной!”  (рассчитана на грамотный ввод)
import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        String day1 = "Понедельник";
        String day2 = "Вторник";
        String day3 = "Среда";
        String day4 = "Четверг";
        String day5 = "Пятница";
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите сегодняшний день недели");
        String days = scr.nextLine();
        if (days.equals(day1)) {
            System.out.println("Это рабочий день");
        } else if (days.equals(day2)) {
            System.out.println("Это рабочий день");
        } else if (days.equals(day3)) {
            System.out.println("Это рабочий день");
        } else if (days.equals(day4)) {
            System.out.println("Это рабочий день");
        } else if (days.equals(day5)) {
            System.out.println("Это рабочий день");
        } else {
            System.out.println("Это выходной!");
        }
    }
    }