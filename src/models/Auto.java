package models;

public class Auto extends AutoAbs {

    @Override
    public void driveForward(int transmissionNumber) {
        System.out.println("int method: " + transmissionNumber);
    }

    public void driveForward(long transmissionNumber) {
        System.out.println("long method: " + transmissionNumber);
    }

    public void driveForward(String transmissionNumber) {
        System.out.println("String method: " + transmissionNumber);
    }
}
