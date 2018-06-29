import models.Auto;

public class MainRunner {
    //    psvm Скорочене створення методу Main
    public static void main(String[] args) {


        //    Числа зі плаваючою крапкою
        float f1 = -1.1f;
        double d1 = -1.1;
        //    Логічна змінна
        boolean check = true;
        Integer i1 = 154;
        //    Символ
        char ch = 'c';
        //     Числа
        byte by = 22;
        short sh = 22222;
        int i = 222222222;
        long l = 2222222222222222222l;

        int temp = (int) l;
        long tempLong = (long) temp;
        //    Змінні
        String s = String.valueOf(l);
        long convertFromString = Long.parseLong(s);

        Auto autoMercedes = new Auto();
        autoMercedes.driveForward(i);
        autoMercedes.driveForward(l);
        autoMercedes.driveForward(s);
        autoMercedes.driveForward(convertFromString);
    }
}
