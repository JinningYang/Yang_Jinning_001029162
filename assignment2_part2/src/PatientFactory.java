public class PatientFactory {
    public Patient getPatient(String name, double yourAge, double r, double h, double b, double w1, double w2) {
        if (yourAge > 0 && yourAge < 0.083) {
            return new Patient(name, r,h,b,w1,w2, 50, 30, 160, 120, 70, 50, 3, 2, 7, 4.5);
        } else if (yourAge >= 0.083 && yourAge < 1) {
            return new Patient(name, r,h,b,w1,w2, 30, 20, 140, 80, 100, 70, 10, 4, 22, 9);
        } else if (yourAge >= 1 && yourAge < 3) {
            return new Patient(name, r,h,b,w1,w2, 30, 20, 130, 80, 110, 80, 14, 10, 31, 22);
        } else if (yourAge >= 3 && yourAge <= 5) {
            return new Patient(name, r,h,b,w1,w2, 30, 20, 120, 80, 110, 80, 18, 14, 40, 31);
        } else if (yourAge >= 6 && yourAge <= 12) {
            return new Patient(name, r,h,b,w1,w2, 30, 20, 110, 70, 120, 80, 42, 20, 92, 41);
        } else if (yourAge >= 13) {
            return new Patient(name, r,h,b,w1,w2, 20, 12, 105, 55, 120, 110, Double.MAX_VALUE, 50, Double.MAX_VALUE, 110);
        } else {
            System.out.println("Your Input Age Is Wrong!");
        }
        return null;
    }
}
