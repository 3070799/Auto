package models;

public class Auto extends AutoAbs {

    @Override
    public void driveForward(int transmissionNumber) {
        System.out.print("Number of transmission is:");
        System.out.println(transmissionNumber);
    }
}
