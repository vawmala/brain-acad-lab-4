package ua.zp.brainacad;
//Написать программу, которая выводит на экран каждое 3-е i-ое значение цикла.
public class OutputLoopValue {
    public static void main(String[] args) {
int a;
        for (int i = 3; i < 15; i = i + 3) {
            a = (5+1)*i;
            System.out.println(i);
            System.out.println(a);
            System.out.println();
        }
    }
}
