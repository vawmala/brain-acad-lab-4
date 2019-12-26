package ua.zp.brainacad;

public class LogicTask {
    public static void main(String[] args) {
       // 1. Решить логические вычисления:

        System.out.println(true && false || true && !false);
        System.out.println(false || false || !true && false);
        System.out.println(!false && (false || true && true));
        System.out.println(4 > 8 && !(7 == 0));
        System.out.println(!(true && false || false && true) && !(true && 4 <= 5));




    }
}
