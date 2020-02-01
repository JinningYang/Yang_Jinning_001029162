package edu.neu.info5100.myassignment2.part1;

import java.util.Scanner;

public class PatientFactory {
    public Patient getPatientAge(double yourAge, double r, double h, double b, double w1, double w2) {
        if (yourAge > 0 && yourAge < 0.083) {
            return new Newborn(r,h,b,w1,w2);
        } else if (yourAge >= 0.083 && yourAge < 1) {
            return new Infant(r,h,b,w1,w2);
        } else if (yourAge >= 1 && yourAge < 3) {
            return new Toddler(r,h,b,w1,w2);
        } else if (yourAge >= 3 && yourAge <= 5) {
            return new Preschooler(r,h,b,w1,w2);
        } else if (yourAge >= 6 && yourAge <= 12) {
            return new SchoolAge(r,h,b,w1,w2);
        } else if (yourAge >= 13) {
            return new Adolescent(r,h,b,w1,w2);
        } else {
            System.out.println("Your Input Age Is Wrong!");
        }
        return null;
    }
}
