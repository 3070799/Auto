package models;

import interfaces.AutoInt;

public abstract class AutoAbs implements AutoInt {
    @Override
    public void driveForward(int transmissionNumber) {
//        sout
        System.out.println("We drive from Abstract method");
    }
}
