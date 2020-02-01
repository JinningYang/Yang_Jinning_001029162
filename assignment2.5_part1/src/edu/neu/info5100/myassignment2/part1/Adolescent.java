package edu.neu.info5100.myassignment2.part1;

public class Adolescent extends Patient{
    public Adolescent(double r, double h, double b, double w1, double w2) {
        super(r, h, b, w1, w2);
    }

    @Override
    public int getPatientStatus() {
		int ret = 0;
		if (!(respiratoryRate >= 12 && respiratoryRate<= 20)) {
			ret |= 1<<0;
		}

		if (!(heartRate>= 55 && heartRate <= 105)) {
			ret |= 1<<1;
		}

		if (!(sysBloodPre>=110 && sysBloodPre <= 120)) {
			ret |= 1<<2;
		}

		if (!(weightKilos>50)) {
			ret |= 1<<3;
		}

		if (!(weightPounds>110)) {
			ret |= 1<<4;
		}
		return ret;
    }

}
