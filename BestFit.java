package xdd;

public int best_fit_approach(double w, double d) {
    int index = -1;
    Slot s=new Slot();
    double[] area = new double[s.NumOfVehicles()];
    for (int i = 0; i < s.NumOfVehicles(); i++) {
        area[i] = Double.MAX_VALUE;
        if ( s.active[i] == false) {
            if (w <= width[i] && d <= width[i]) {
                area[i] = (width[i] - w) + (width[i] - d);
                index = i;
            }
        }
    }
    if (index == -1) {
        return -1;

    } else {
        double a = area[0];
        for (int i = 0; i < s.NumOfVehicles(); i++) {
            if (a > area[i]) {
                a = area[i];
                index = i;
            }
        }
        System.out.println("the best fit slot is: " + (index + 1));
        s.active[index] = true;
        return index;
    }

}
