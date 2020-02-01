package edu.neu.info5100.myassignment2.part1;

public class Infant extends Patient {
    public Infant(double r, double h, double b, double w1, double w2) {
		super(r, h, b, w1, w2);
    }

    @Override
    public int getPatientStatus() {
		int ret = 0;
		if (!(respiratoryRate >= 20 && respiratoryRate<= 30)) {
			ret |= 1<<0;
		}

		if (!(heartRate>= 80 && heartRate <= 140)) {
			ret |= 1<<1;
		}

		if (!(sysBloodPre>= 70 && sysBloodPre <= 100)) {
			ret |= 1<<2;
		}

		if (!(weightKilos>= 4 && weightKilos<= 10)) {
			ret |= 1<<3;
		}

		if (!(weightPounds>= 9 && weightPounds<= 22)) {
			ret |= 1<<4;
		}
		return ret;
    }
}
