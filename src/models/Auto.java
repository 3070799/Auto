package models;

public class Auto extends AutoAbs {
    //    Змінні
    String str = "Строка";
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


    @Override
    public void driveForward(int transmissionNumber) {

        System.out.print("Number of transmission is:");
        System.out.println(transmissionNumber);
    }
}
