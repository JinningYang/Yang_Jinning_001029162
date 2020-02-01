package edu.neu.info5100.myassignment2.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static double resRate;
    private static double hrtRate;
    private static double bloPre;
    private static double weKilos;
    private static double wePounds;
    private static double age;

    public static void main(String[] args){
		Driver d = new Driver();
		d.run();
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        ArrayList<Patient> patients=new ArrayList<>();
        PatientFactory patientFac=new PatientFactory();
        System.out.print("Please Input How Many Patient You'd Like To Input: ");
        int num=input.nextInt();

        for(int i=0;i<num;i++){
            System.out.print("Please Input Patients' Age: ");
            age = input.nextDouble();
            System.out.print("Please Input Patients' Vital Signs: ");
            resRate=input.nextDouble();
            hrtRate=input.nextDouble();
            bloPre=input.nextDouble();
            weKilos=input.nextDouble();
            wePounds=input.nextDouble();
            patients.add(patientFac.getPatientAge(age,resRate,hrtRate,bloPre,weKilos,wePounds));
        }

        for(Patient p : patients){
            int status = p.getPatientStatus();
			if (status == 0) {
				System.out.println("The patient is healthy.");
			} else {
				System.out.println("The patient is not healthy.");
			}
			if ((status&(1<<0))!=0) {
				System.out.println("The Anomalous Is IN Respiratory Rate");
			}
			if ((status&(1<<1))!=0) {
				System.out.println("The Anomalous Is IN Heart Rate");
			}
			if ((status&(1<<2))!=0) {
				System.out.println("The Anomalous Is IN Blood Pressure");
			}
			if ((status&(1<<3))!=0) {
				System.out.println("The Anomalous Is IN Weight Kilos");
			}
			if ((status&(1<<4))!=0) {
				System.out.println("The Anomalous Is IN Weight Pounds");
			}
        }
    }

}
