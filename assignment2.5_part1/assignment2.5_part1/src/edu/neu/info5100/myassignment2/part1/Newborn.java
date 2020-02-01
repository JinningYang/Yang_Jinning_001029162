package edu.neu.info5100.myassignment2.part1;

public class Newborn extends Patient {

    public Newborn(double r, double h, double b, double w1, double w2) {
        super(r, h, b, w1, w2);
    }

    @Override
    public int getPatientStatus() {
		int ret = 0;
		if (!(respiratoryRate >= 30 && respiratoryRate <= 50)) {
			ret |= 1<<0;
		}

		if (!(heartRate >= 120 && heartRate <= 160)) {
			ret |= 1<<1;
		}

		if (!(sysBloodPre >= 50 && sysBloodPre <= 70)) {
			ret |= 1<<2;
		}

		if (!(weightKilos >= 2 && weightKilos <= 3)) {
			ret |= 1<<3;
		}
		if (!(weightPounds >= 4.5 && weightPounds <= 7)) {
			ret |= 1<<4;
		}
		return ret;
    }
}

