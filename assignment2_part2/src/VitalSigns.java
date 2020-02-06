import java.util.ArrayList;
import java.util.Scanner;

public class VitalSigns {
    protected double respiratoryRate;
    protected double heartRate;
    protected double sysBloodPre;
    protected double weightKilos;
    protected double weightPounds;

    public VitalSigns() {

    }

    //构造函数
    public VitalSigns(double r, double h, double b, double w1, double w2) {
        setValues(r, h, b, w1, w2);
    }
    public void setValues(double r, double h, double b, double w1, double w2) {
        respiratoryRate = r;
        heartRate = h;
        sysBloodPre = b;
        weightKilos = w1;
        weightPounds = w2;
    }
    public void print() {
        System.out.println("Respiratory rate: " + String.valueOf(respiratoryRate));
        System.out.println("Heart rate: " + String.valueOf(heartRate));
        System.out.println("Systolic blood pressure: " + String.valueOf(sysBloodPre));
        System.out.println("Weight in kilos: " + String.valueOf(weightKilos));
        System.out.println("Weight in pounds: " + String.valueOf(weightPounds));
    }
}