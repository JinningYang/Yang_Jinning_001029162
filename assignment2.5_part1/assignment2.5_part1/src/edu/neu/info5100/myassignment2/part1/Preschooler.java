package edu.neu.info5100.myassignment2.part1;

public class Preschooler extends Patient{

    public Preschooler(double r, double h, double b, double w1, double w2) {
        super(r, h, b, w1, w2);
    }

    @Override
    public int getPatientStatus() {
		int ret = 0;
		if (!(respiratoryRate >= 20 && respiratoryRate<= 30)) {
			ret |= 1<<0;
		}

		if (!(heartRate>= 80 && heartRate <= 120)) {
			ret |= 1<<1;
		}

		if (!(sysBloodPre>= 80 && sysBloodPre <= 110)) {
			ret |= 1<<2;
		}

		if (!(weightKilos>= 14 && weightKilos<= 18)) {
			ret |= 1<<3;
		}

		if (!(weightPounds>= 31 && weightPounds<= 40)) {
			ret |= 1<<4;
		}
		return ret;
    }
}
