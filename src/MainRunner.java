import models.Auto;

public class MainRunner {
    //    psvm Скорочене створення методу Main
    public static void main(String[] args) {
        //    Числа зі плаваючою крапкою
        float f1 = 2222222222.922222f;
        double d1 = 2222222222222222.2;
        //    Логічна змінна
        boolean check = true;
        Integer i1 = 154;
        //    Символ
        char ch = 'c';
        //     Числа
        byte by = 127;
        short sh = 22222;
        int i = 222222222;
        long l = 2222222222222222222l;
        //      Строки
        String s = String.valueOf(l);

//        Перетворення змінних
        int temp = (int) l;
        int convertToIntFromFloat = (int) f1;
        int convertToIntFromDouble = (int) d1;
        long convertToLongFromFloat = (long) f1;
        long convertToLongFromDouble = (long) d1;
        long tempLong = (long) temp;
        long convertFromString = Long.parseLong(s);

        Auto autoMercedes = new Auto();
        autoMercedes.driveForward(i);
        autoMercedes.driveForward(l);
        autoMercedes.driveForward(s);
        autoMercedes.driveForward(convertFromString);
        autoMercedes.driveForward(convertToIntFromFloat);
        autoMercedes.driveForward(convertToIntFromDouble);
        autoMercedes.driveForward(convertToLongFromFloat);
        autoMercedes.driveForward(convertToLongFromDouble);
    }
}
