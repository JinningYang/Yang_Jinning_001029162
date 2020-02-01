package edu.neu.info5100.myassignment2.part1;

public class SchoolAge extends Patient{
    public SchoolAge(double r, double h, double b, double w1, double w2) {
        super(r, h, b, w1, w2);
    }

    @Override
    public int getPatientStatus() {
        int ret = 0;
		if (!(respiratoryRate >= 20 && respiratoryRate<= 30)) {
			ret |= 1<<0;
		}

		if (!(heartRate>= 70 && heartRate <= 110)) {
			ret |= 1<<1;
		}

		if (!(sysBloodPre>= 80 && sysBloodPre <= 120)) {
			ret |= 1<<2;
		}

		if (!(weightKilos>= 20 && weightKilos<= 42)) {
			ret |= 1<<3;
		}

		if (!(weightPounds>= 41 && weightPounds<= 92)) {
			ret |= 1<<4;
		}
		return ret;
    }

}
