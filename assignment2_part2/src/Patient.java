import java.util.ArrayList;

public class Patient {
    Patient(String name, double r, double h, double b, double w1, double w2, double rrMax, double rrMin, double hrMax, double hrMin, double sbMax, double sbMin, double wkMax, double wkMin, double wpMax, double wpMin) {
        currentVitalSigns = new VitalSigns(r, h, b, w1, w2);
        previousVitalSigns = new ArrayList<VitalSigns>();

        respiratoryRateMax = rrMax;
        respiratoryRateMin = rrMin;
        heartRateMax = hrMax;
        heartRateMin = hrMin;
        sysBloodPreMax = sbMax;
        sysBloodPreMin = sbMin;
        weightKilosMax = wkMax;
        weightKilosMin = wkMin;
        weightPoundsMax = wpMax;
        weightPoundsMin = wpMin;
        this.name = name;
    }

    public VitalSigns getVitalSigns() {
        return getVitalSigns(0);
    }
    public VitalSigns getVitalSigns(int index) {
        if (index == 0) {
            return currentVitalSigns;
        }
        return previousVitalSigns.get(previousVitalSigns.size() - index);
    }
    public int getNVitalSigns() {
        return previousVitalSigns.size() + 1;
    }

    public String getName() {
        return name;
    }

    public VitalSigns newVitalSign() {
        previousVitalSigns.add(currentVitalSigns);
        currentVitalSigns = new VitalSigns();
        return currentVitalSigns;
    }
    public int getPatientStatus(int index) {
        VitalSigns v = getVitalSigns(index);
        int ret = 0;
        if (!(v.respiratoryRate >= respiratoryRateMin&& v.respiratoryRate <=respiratoryRateMax)) {
            ret |= 1<<0;
        }

        if (!(v.heartRate >= heartRateMin && v.heartRate <= heartRateMax)) {
            ret |= 1<<1;
        }

        if (!(v.sysBloodPre >=sysBloodPreMin&& v.sysBloodPre <=sysBloodPreMax)) {
            ret |= 1<<2;
        }

        if (!(v.weightKilos >= weightKilosMin&& v.weightKilos <= weightKilosMax)) {
            ret |= 1<<3;
        }
        if (!(v.weightPounds >= weightPoundsMin && v.weightPounds <=weightPoundsMax)) {
            ret |= 1<<4;
        }
        return ret;
    }
    public void isVitalSignNormal(int index, String indexName) {
        int status = getPatientStatus(index);
        int printed = 0;
        System.out.println("For patient " + name + ":");
        if (indexName.contains("Respiratory Rate")) {
            if ((status& (1 << 0)) != 0) {
                System.out.println("\tThe Anomalous Is Respiratory Rate");
                printed = 1;
            }
        }
        if (indexName.contains("Heart Rate")) {
            if ((status& (1 << 1)) != 0) {
                System.out.println("\tThe Anomalous Is In Heart Rate");
                printed = 1;
            }
        }

        if (indexName.contains("Systolic Blood Pressure")) {
            if ((status& (1 << 2)) != 0) {
                System.out.println("\tThe Anomalous Is In Blood Pressure");
                printed = 1;
            }
        }

        if (indexName.contains("Weight In Kilos")) {
            if ((status & (1 << 3)) != 0) {
                System.out.println("\tThe Anomalous Is In Weight Kilos");
                printed = 1;
            }
        }

        if (indexName.contains("Weight In Pounds")) {
            if ((status& (1 << 4)) != 0) {
                System.out.println("\tThe Anomalous Is In Weight Pounds");
                printed = 1;
            }
        }
        if (0 == printed) {
            System.out.println("\tThe selected vital signs are normal.");
        }
    }

    public void isPatientNormal(int index) {
        int status = getPatientStatus(index);
        int printed = 0;
        System.out.println("For patient " + name + ":");
        if (status == 0) {
            System.out.println("Is healthy.");
        } else {
            System.out.println("Is not healthy.");
        }
    }

    protected double respiratoryRateMax;
    protected double respiratoryRateMin;
    protected double heartRateMax;
    protected double heartRateMin;
    protected double sysBloodPreMax;
    protected double sysBloodPreMin;
    protected double weightKilosMax;
    protected double weightKilosMin;
    protected double weightPoundsMax;
    protected double weightPoundsMin;
    protected String name;
    ArrayList<VitalSigns> previousVitalSigns;
    VitalSigns currentVitalSigns;
}
