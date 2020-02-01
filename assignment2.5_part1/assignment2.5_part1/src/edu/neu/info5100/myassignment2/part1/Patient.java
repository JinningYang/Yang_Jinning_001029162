package edu.neu.info5100.myassignment2.part1;

public abstract class Patient {
    protected double respiratoryRate;
    protected double heartRate;
    protected double sysBloodPre;
    protected double weightKilos;
    protected double weightPounds;
    //构造函数
    public Patient(double r, double h, double b, double w1, double w2) {
        respiratoryRate=r;
        heartRate=h;
        sysBloodPre=b;
        weightKilos=w1;
        weightPounds=w2;
    }
    public abstract int getPatientStatus();
}
