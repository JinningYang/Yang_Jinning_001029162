package edu.neu.info5100.myassignment2.part1;

public class Toddler extends Patient{
    public Toddler(double r, double h, double b, double w1, double w2) {
        super(r, h, b, w1, w2);
    }

    @Override
    public int getPatientStatus() {
			int ret = 0;
            if (!(respiratoryRate >= 20 && respiratoryRate<= 30)) {
                ret |= 1<<0;
            }

            if (!(heartRate>= 80 && heartRate <= 130)) {
                ret |= 1<<1;
            }

            if (!(sysBloodPre>= 80 && sysBloodPre <= 110)) {
                ret |= 1<<2;
            }

            if (!(weightKilos>= 10 && weightKilos<= 14)) {
                ret |= 1<<3;
            }

            if (!(weightPounds>= 22 && weightPounds<= 31)) {
                ret |= 1<<4;
            }
            return ret;
        }

    }
}
