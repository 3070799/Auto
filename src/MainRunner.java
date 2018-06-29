import models.Auto;

public class MainRunner {
//    psvm Скорочене створення методу Main
    public static void main(String[] args) {

        //    Змінні
        String str = "Рядок";
        //    Символ
        char ch = 'c';
        //     Числа
        byte by = 22;
        short sh = 22222;
        int i = 222222222;
        long l = 2222222222222222222l;
        //    Числа зі плаваючою крапкою
        float f1 = -1.1f;
        double d1 = -1.1;
        //    Логічна змінна
        boolean check = true;
//


        Auto autoMercedes = new Auto();
        autoMercedes.driveForward(5);


    }
}
