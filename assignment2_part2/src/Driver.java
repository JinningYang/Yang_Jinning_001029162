import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    ArrayList<Patient> patients;
    PatientFactory pf;
    Driver() {
        patients = new ArrayList<Patient>();
        pf = new PatientFactory();
    }
    public static void main(String[] args){
        Driver d = new Driver();
        d.run();
    }
    public void run(){
        Scanner input=new Scanner(System.in);

        while(true) {
            System.out.println("Make a selection: \n\tA for adding a patient\n\tU for updating a patient's information\n\tE for examining a patient's vital signs\n\tL for listing a patient's information\n\tQ to quit");
            char opcode = input.next().charAt(0);
            if (opcode == 'A' || opcode == 'a') {
                // Add a patient
                System.out.print("What's the patient's name? ");
                String name = "";
                while (name.equalsIgnoreCase("") || name.equalsIgnoreCase("\n")) {
                    name = input.nextLine();
                }
                System.out.print("Input patient's age, respiratoryRate, heartRate, bloodPressure, weightKilo, weightPounds: ");
                double age, r, h, b, w1, w2;
                age = input.nextDouble();
                r = input.nextDouble();
                h = input.nextDouble();
                b = input.nextDouble();
                w1 = input.nextDouble();
                w2 = input.nextDouble();
                Patient newPatient = pf.getPatient(name, age, r, h, b, w1, w2);
                patients.add(newPatient);
                System.out.println("New Patient: " + newPatient.getName() + " (id: " +  String.valueOf(patients.size()-1) + ") added.");
            } else if (opcode == 'E' || opcode == 'e') {
                // Examine an patient
                // E patient# vitalSignsOffset
                System.out.print("Patient ID? ");
                int pIndex = input.nextInt();
                System.out.print("Result offset? (0 for current result, 1 for previous result, ...) ");
                int vIndex = input.nextInt();
                patients.get(pIndex).isPatientNormal(vIndex);
                System.out.print("Which vital signs? ");
                String vNames = "";
                while (vNames.equalsIgnoreCase("") || vNames.equalsIgnoreCase("\n")) {
                    vNames = input.nextLine();
                }
                // Examine the current vitalSigns
                patients.get(pIndex).isVitalSignNormal(vIndex, vNames);

            } else if (opcode == 'U' || opcode == 'u') {
                // Update an patient's information
                System.out.print("Patient ID? ");
                int pIndex = input.nextInt();
                System.out.print("Input patient's new respiratoryRate, heartRate, bloodPressure, weightKilo, weightPounds: ");
                double r, h, b, w1, w2;
                r = input.nextDouble();
                h = input.nextDouble();
                b = input.nextDouble();
                w1 = input.nextDouble();
                w2 = input.nextDouble();
                VitalSigns v = patients.get(pIndex).newVitalSign();
                v.setValues(r, h, b, w1, w2);
                System.out.println("Patient" + patients.get(pIndex).getName() + "(id: " +  String.valueOf(patients.size()-1) + ") has been successfully updated.");
                System.out.println("Patient " + patients.get(pIndex).getName() + " now have " + String.valueOf(patients.get(pIndex).getNVitalSigns()) + " records.");
            } else if (opcode == 'L' || opcode == 'l') {
                System.out.print("Patient ID? ");
                int pIndex = input.nextInt();
                System.out.println("========================================");
                System.out.println("Patient" + patients.get(pIndex).getName() + "(id: " +  String.valueOf(patients.size()-1) + ") have " + String.valueOf(patients.get(pIndex).getNVitalSigns()) + " records.");
                for (int i = 0; i < patients.get(pIndex).getNVitalSigns(); i++) {
                    System.out.println("Record " + String.valueOf(i+1) + " of " + String.valueOf(patients.get(pIndex).getNVitalSigns()) + ":");
                    patients.get(pIndex).getVitalSigns(i).print();
                    System.out.println("----------------------------------------");
                }
                System.out.println("========================================");
            } else if (opcode == 'Q' || opcode == 'q') {
                break;
            } else {
                System.out.println("Unknown operation " + opcode + ".");
            }
        }
    }
}
